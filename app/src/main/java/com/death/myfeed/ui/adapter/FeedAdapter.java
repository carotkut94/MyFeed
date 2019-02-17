package com.death.myfeed.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.death.myfeed.databinding.SingleFeedItemBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.death.myfeed.ui.feed.DefaultViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    public  interface ActionListener{
        void onPostClicked(FeedResponse feedResponse);
    }

    List<FeedResponse> feeds;
    private ActionListener actionListener;
    public FeedAdapter(List<FeedResponse> feeds, ActionListener actionListener) {
        this.feeds = feeds;
        this.actionListener = actionListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            SingleFeedItemBinding singleFeedItemBinding = SingleFeedItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new DefaultViewHolder(singleFeedItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((DefaultViewHolder) holder).bindData(feeds.get(position));
        ((DefaultViewHolder) holder).singleFeedItemBinding.getRoot().setOnClickListener(v -> actionListener.onPostClicked(feeds.get(position)));
    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }
}
