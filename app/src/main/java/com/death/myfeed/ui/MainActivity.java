package com.death.myfeed.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.death.myfeed.R;
import com.death.myfeed.databinding.ActivityMainBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.death.myfeed.network.RetrofitProvider;
import com.death.myfeed.ui.adapter.FeedAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements FeedAdapter.ActionListener {

    ActivityMainBinding activityMainBinding;
    LinearLayoutManager layoutManager;
    List<FeedResponse> feedResponses;
    FeedAdapter feedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        feedResponses = new ArrayList<>();

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        feedAdapter = new FeedAdapter(feedResponses, this);
        activityMainBinding.feeds.setLayoutManager(layoutManager);
        activityMainBinding.feeds.setAdapter(feedAdapter);

        RetrofitProvider.getRestApiService().getAllFeed().enqueue(new Callback<List<FeedResponse>>() {
            @Override
            public void onResponse(Call<List<FeedResponse>> call, Response<List<FeedResponse>> response) {
                if(response.isSuccessful() && response.body()!=null && response.body().size()>0)
                {
                    feedResponses.addAll(response.body());
                    feedAdapter.notifyDataSetChanged();
                    activityMainBinding.error.setVisibility(View.GONE);
                }else{
                    Toast.makeText(MainActivity.this,"Failed", Toast.LENGTH_LONG).show();
                    activityMainBinding.error.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onFailure(Call<List<FeedResponse>> call, Throwable t) {
                t.printStackTrace();
                activityMainBinding.error.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"Failed", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onPostClicked(FeedResponse feedResponse) {
        Intent intent = new Intent(this, ViewPostActivity.class);
        intent.putExtra("DATA", new Gson().toJson(feedResponse, FeedResponse.class));
        startActivity(intent);
    }
}
