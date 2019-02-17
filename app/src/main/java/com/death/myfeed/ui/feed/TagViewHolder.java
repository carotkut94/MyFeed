package com.death.myfeed.ui.feed;

import com.death.myfeed.databinding.SingleFeedItemBinding;
import com.death.myfeed.databinding.SingleTagItemBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.death.myfeed.model.dto.Tags;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TagViewHolder extends RecyclerView.ViewHolder {
    SingleTagItemBinding singleTagItemBinding;
    public TagViewHolder(@NonNull SingleTagItemBinding singleTagItemBinding) {
        super(singleTagItemBinding.getRoot());
        this.singleTagItemBinding = singleTagItemBinding;
    }

    public void bindData(Tags tag){
        singleTagItemBinding.setTag(tag);
        singleTagItemBinding.executePendingBindings();
    }

}
