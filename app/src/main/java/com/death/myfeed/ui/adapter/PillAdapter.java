package com.death.myfeed.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.death.myfeed.databinding.SingleFeedItemBinding;
import com.death.myfeed.databinding.SingleTagItemBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.death.myfeed.model.dto.Tags;
import com.death.myfeed.ui.feed.DefaultViewHolder;
import com.death.myfeed.ui.feed.TagViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PillAdapter extends RecyclerView.Adapter<TagViewHolder> {

    List<Tags> tags;

    public PillAdapter(List<Tags> tags) {
        this.tags = tags;
    }

    @NonNull
    @Override
    public TagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            SingleTagItemBinding singleTagItemBinding = SingleTagItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new TagViewHolder(singleTagItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TagViewHolder holder, int position) {
        holder.bindData(tags.get(position));
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }

}
