package com.death.myfeed.ui.feed;

import com.death.myfeed.databinding.SingleFeedItemBinding;
import com.death.myfeed.model.dto.FeedResponse;
import com.death.myfeed.ui.adapter.PillAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DefaultViewHolder extends RecyclerView.ViewHolder {


    public SingleFeedItemBinding singleFeedItemBinding;
    PillAdapter pillAdapter;

    public DefaultViewHolder(@NonNull SingleFeedItemBinding itemView) {
        super(itemView.getRoot());
        singleFeedItemBinding = itemView;
    }

    public void bindData(FeedResponse feedResponse){
        singleFeedItemBinding.setPost(feedResponse);
        singleFeedItemBinding.setUser(feedResponse.getSender());
        singleFeedItemBinding.tags.setLayoutManager(new LinearLayoutManager(itemView.getContext(),RecyclerView.HORIZONTAL, false));
        pillAdapter = new PillAdapter(feedResponse.getTags());
        singleFeedItemBinding.tags.setAdapter(pillAdapter);
        if(feedResponse.getAttachments()!=null && feedResponse.getAttachments().size()>0) {
            singleFeedItemBinding.setAttachment(feedResponse.getAttachments().get(0));
        }else{
            singleFeedItemBinding.setAttachment(null);
        }
        singleFeedItemBinding.executePendingBindings();
    }

}
