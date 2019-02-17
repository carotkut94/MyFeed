package com.death.myfeed.utils;

import android.text.format.DateUtils;

import com.death.myfeed.model.dto.Attachments;
import com.death.myfeed.model.dto.Tags;

import java.util.List;
import java.util.Locale;

public class BindingUtility {

    public static String bindElapsedTime(long time){
        return DateUtils.getRelativeTimeSpanString(time,System.currentTimeMillis(),DateUtils.SECOND_IN_MILLIS).toString();
    }

    public static Boolean shouldHideTextView(String text){
        return text.isEmpty();
    }

    public static Boolean shouldHideTags(List<Tags> text){
        return text==null || text.size()==0;
    }

    public static Boolean shouldHideImageView(Attachments attachments){
        return attachments==null || !attachments.getType().equalsIgnoreCase(AttachmentType.IMAGE);
    }

    public static Boolean shouldHideVideoLayout(Attachments attachments){
        return attachments==null || !attachments.getType().equalsIgnoreCase(AttachmentType.VIDEO);
    }

    public static Boolean shouldShowAudioView(Attachments attachments){
        return attachments != null && attachments.getType().equalsIgnoreCase(AttachmentType.AUDIO);
    }
    public static String durationString(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;
        if(hours>0) {
            return String.format("%02d:%02d:%02d", hours, minutes, sec);
        }
        return String.format("%02d:%02d", minutes, sec);
    }


    public static String getPrettyCount(long count) {
        if (count < 1000) return "" + count;
        int exp = (int) (Math.log(count) / Math.log(1000));
        return String.format(Locale.getDefault(),"%.1f%c",
                count / Math.pow(1000, exp),
                "kmgtpe".charAt(exp - 1));
    }

}
