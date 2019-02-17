package com.death.myfeed.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.death.myfeed.R;
import com.death.myfeed.databinding.ActivityViewPostBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.death.myfeed.ui.adapter.PillAdapter;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ViewPostActivity extends AppCompatActivity {

    ActivityViewPostBinding activityViewPostBinding;
    FeedResponse feedResponse;
    PillAdapter pillAdapter;

    AtomicBoolean shouldUpdateProgress = new AtomicBoolean(true);
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityViewPostBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_post);
        feedResponse = new Gson().fromJson(getIntent().getStringExtra("DATA"), FeedResponse.class);

        if(feedResponse==null){
            finish();
        }

        setTitle(feedResponse.getTitle());
        activityViewPostBinding.progress.setMax(100);
        activityViewPostBinding.setPost(feedResponse);
        if(feedResponse.getAttachments()!=null && feedResponse.getAttachments().size()>0) {
            activityViewPostBinding.setAttachment(feedResponse.getAttachments().get(0));
        }else{
            activityViewPostBinding.setAttachment(null);
        }
        activityViewPostBinding.setUser(feedResponse.getSender());

        activityViewPostBinding.tags.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        pillAdapter = new PillAdapter(feedResponse.getTags());
        activityViewPostBinding.tags.setAdapter(pillAdapter);
        activityViewPostBinding.playButton.setTag("PLAY");
        activityViewPostBinding.playButton.setOnClickListener(v -> {
            if(activityViewPostBinding.playButton.getTag().toString().equalsIgnoreCase("PLAY")) {
                try {
                    playAudio();
                    activityViewPostBinding.playButton.setImageResource(R.drawable.ic_stop);
                    activityViewPostBinding.playButton.setTag("STOP");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                stopAndReset();
                activityViewPostBinding.playButton.setTag("PLAY");
                activityViewPostBinding.playButton.setImageResource(R.drawable.ic_play);
            }
        });


        activityViewPostBinding.plaVideo.setOnClickListener(v -> {
            Intent intent = new Intent(ViewPostActivity.this, PlayVideoActivity.class);
            intent.putExtra("DATA", new Gson().toJson(feedResponse, FeedResponse.class));
            startActivity(intent);
        });

    }

    void playAudio() throws IOException {
        if(mediaPlayer!=null && mediaPlayer.isLooping()){
            stopAndReset();
        }
        shouldUpdateProgress.set(true);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(feedResponse.getAttachments().get(0).getUrl());
        mediaPlayer.prepareAsync();
        mediaPlayer.setOnPreparedListener(mp -> {
            mediaPlayer.start();
            activityViewPostBinding.progress.setMax(mediaPlayer.getDuration());
            new Thread(() -> {
                while(shouldUpdateProgress.get()){
                    activityViewPostBinding.progress.post(() -> activityViewPostBinding.progress.setProgress(mediaPlayer.getCurrentPosition()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        });
    }

    void stopAndReset(){
        if(mediaPlayer!=null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;

            activityViewPostBinding.progress.post(() -> activityViewPostBinding.progress.setProgress(0));
            shouldUpdateProgress.set(false);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopAndReset();
    }
}
