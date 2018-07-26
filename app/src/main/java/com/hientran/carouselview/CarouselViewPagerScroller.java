package com.hientran.carouselview;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by hientran on 07/25/18.
 */

public class CarouselViewPagerScroller extends Scroller {

  int mScrollDuration = Constant.SCROLL_DURATION;

  public CarouselViewPagerScroller(Context context) {
    super(context);
  }

  public CarouselViewPagerScroller(Context context, Interpolator interpolator) {
    super(context, interpolator);
  }

  @Override
  public void startScroll(int startX, int startY, int dx, int dy, int duration) {
    super.startScroll(startX, startY, dx, dy, mScrollDuration);
  }

  @Override
  public void startScroll(int startX, int startY, int dx, int dy) {
    super.startScroll(startX, startY, dx, dy, mScrollDuration);
  }
}
