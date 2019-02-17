package com.death.myfeed.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.death.myfeed.R;
import com.death.myfeed.databinding.ActivityPlayVideoBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.gson.Gson;

public class PlayVideoActivity extends AppCompatActivity {

    ActivityPlayVideoBinding activityPlayVideoBinding;

    SimpleExoPlayer player;
    FeedResponse feedResponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPlayVideoBinding = DataBindingUtil.setContentView(this, R.layout.activity_play_video);

        activityPlayVideoBinding.close.setOnClickListener(v -> onBackPressed());

        feedResponse = new Gson().fromJson(getIntent().getStringExtra("DATA"), FeedResponse.class);

        if(feedResponse==null){
            finish();
        }

        activityPlayVideoBinding.setPost(feedResponse);
        setTitle(feedResponse.getTitle());
    }

    private void initializePlayer() {
        player = ExoPlayerFactory.newSimpleInstance(this,
                new DefaultRenderersFactory(this),
                new DefaultTrackSelector(), new DefaultLoadControl());

        player.addListener(new Player.EventListener() {
            @Override
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                Log.e("STATE",String.valueOf(playbackState));
            }
        });
        activityPlayVideoBinding.player.setPlayer(player);
        player.setPlayWhenReady(true);
        Uri uri = Uri.parse(feedResponse.getAttachments().get(0).getUrl());
        player.prepare(buildMediaSource(uri));
    }

    private MediaSource buildMediaSource(Uri uri) {
        return new ExtractorMediaSource.Factory(
                new DefaultHttpDataSourceFactory("stream_player")).
                createMediaSource(uri);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (Util.SDK_INT > 23) {
            initializePlayer();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if ((Util.SDK_INT <= 23 || player == null)) {
            initializePlayer();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (Util.SDK_INT <= 23) {
            releasePlayer();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (Util.SDK_INT > 23) {
            releasePlayer();
        }
    }

    private void releasePlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }
}
