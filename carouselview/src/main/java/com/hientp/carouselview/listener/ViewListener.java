package com.hientp.carouselview.listener;

import android.view.View;
/**
 * Created by hientran on 07/25/18.
 */
public interface ViewListener extends CarouseListener{
    View setViewForPosition(int position);
}