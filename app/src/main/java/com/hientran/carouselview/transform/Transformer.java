package com.hientran.carouselview.transform;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by hientran on 26/07/2018.
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({Transformer.DEFAULT,
    Transformer.SLIDE_OVER,
    Transformer.DEPTH,
    Transformer.ZOOM,
    Transformer.FLOW
})
public @interface Transformer {
  int DEFAULT = 1000;
  int SLIDE_OVER = 1001;
  int DEPTH = 1002;
  int ZOOM = 1003;
  int FLOW = 1004;
}
