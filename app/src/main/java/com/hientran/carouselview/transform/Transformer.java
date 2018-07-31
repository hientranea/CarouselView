package com.hientran.carouselview.transform;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by hientran on 26/07/2018.
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({Transformer.DEFAULT,
    Transformer.ACCORDION,
    Transformer.BACKGROUND_TO_FOREGROUND,
    Transformer.CUBE_OUT,
    Transformer.DEPTH_PAGE,
    Transformer.DRAWER,
    Transformer.FLIP_HORIZONTAL,
    Transformer.FLIP_VERTICAL,
    Transformer.FOREGROUND_TO_BACKGROUND,
    Transformer.ROTATE_DOWN,
    Transformer.ROTATE_UP,
    Transformer.SCALE_IN_OUT,
    Transformer.STACK,
    Transformer.TABLET,
    Transformer.ZOOM_IN,
    Transformer.ZOOM_OUT_SLIDE,
    Transformer.ZOOM_OUT
})
public @interface Transformer {
  int DEFAULT = 1000;
  int ACCORDION = 1001;
  int BACKGROUND_TO_FOREGROUND = 1002;
  int CUBE_OUT = 1003;
  int DEPTH_PAGE = 1004;
  int DRAWER = 1005;
  int FLIP_HORIZONTAL = 1006;
  int FLIP_VERTICAL = 1007;
  int FOREGROUND_TO_BACKGROUND = 1008;
  int ROTATE_DOWN = 1009;
  int ROTATE_UP = 1010;
  int SCALE_IN_OUT = 1011;
  int STACK = 1012;
  int TABLET = 1013;
  int ZOOM_IN = 1014;
  int ZOOM_OUT_SLIDE = 1015;
  int ZOOM_OUT = 1016;
}
