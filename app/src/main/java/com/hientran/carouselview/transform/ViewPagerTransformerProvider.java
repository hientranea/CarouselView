package com.hientran.carouselview.transform;

/**
 * Created by hientran on 01/08/2018.
 */
public class ViewPagerTransformerProvider {
  public static BaseTransformer getTransformer(@Transformer int transformType) {
    switch (transformType) {
      case Transformer.ACCORDION:
        return new AccordionTransformer();
      case Transformer.BACKGROUND_TO_FOREGROUND:
        return new BackgroundToForegroundTransformer();
      case Transformer.CUBE_OUT:
        return new CubeOutTransformer();
      case Transformer.DEFAULT:
        return new DefaultTransformer();
      case Transformer.DEPTH_PAGE:
        return new DepthPageTransformer();
      case Transformer.DRAWER:
        return new DrawerTransformer();
      case Transformer.FLIP_HORIZONTAL:
        return new FlipHorizontalTransformer();
      case Transformer.FLIP_VERTICAL:
        return new FlipVerticalTransformer();
      case Transformer.FOREGROUND_TO_BACKGROUND:
        return new ForegroundToBackgroundTransformer();
      case Transformer.ROTATE_DOWN:
        return new RotateDownTransformer();
      case Transformer.ROTATE_UP:
        return new RotateUpTransformer();
      case Transformer.SCALE_IN_OUT:
        return new ScaleInOutTransformer();
      case Transformer.STACK:
        return new StackTransformer();
      case Transformer.TABLET:
        return new TabletTransformer();
      case Transformer.ZOOM_IN:
        return new ZoomInTransformer();
      case Transformer.ZOOM_OUT_SLIDE:
        return new ZoomOutSlideTransformer();
      case Transformer.ZOOM_OUT:
        return new ZoomOutTransformer();
    }
    return new DefaultTransformer();
  }
}
