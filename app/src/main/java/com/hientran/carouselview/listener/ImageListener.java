package com.hientran.carouselview.listener;

import android.widget.ImageView;

/**
 * Created by hientran on 07/25/18.
 */
public interface ImageListener extends CarouseListener{
    void setImageForPosition(int position, ImageView imageView);
}