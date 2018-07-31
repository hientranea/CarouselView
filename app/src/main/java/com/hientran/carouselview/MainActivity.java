package com.hientran.carouselview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hientran.carouselview.listener.ImageListener;
import com.hientran.carouselview.listener.ViewListener;
import com.squareup.picasso.Picasso;

/**
 * Created by hientran on 07/25/18.
 */

public class MainActivity extends AppCompatActivity {

  CarouselView carouselView;
  CarouselView customCarouselView;

  TextView carouselLabel;
  TextView customCarouselLabel;

  Button pauseButton;

  int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
  String[] sampleTitles = {"Orange", "Grapes", "Strawberry", "Cherry", "Apricot"};
  String[] sampleNetworkImageURLs = {
      "https://placeholdit.imgix.net/~text?txtsize=15&txt=image1&txt=350%C3%97150&w=350&h=150",
      "https://placeholdit.imgix.net/~text?txtsize=15&txt=image2&txt=350%C3%97150&w=350&h=150",
      "https://placeholdit.imgix.net/~text?txtsize=15&txt=image3&txt=350%C3%97150&w=350&h=150",
      "https://placeholdit.imgix.net/~text?txtsize=15&txt=image4&txt=350%C3%97150&w=350&h=150",
      "https://placeholdit.imgix.net/~text?txtsize=15&txt=image5&txt=350%C3%97150&w=350&h=150"
  };
  // To set simple images
  ImageListener imageListener = new ImageListener() {
    @Override
    public void setImageForPosition(int position, ImageView imageView) {

      Picasso.with(getApplicationContext())
          .load(sampleNetworkImageURLs[position])
          //.placeholder(sampleImages[0])
          //.error(sampleImages[3])
          .fit()
          .centerCrop()
          .into(imageView);

      //imageView.setImageResource(sampleImages[position]);
    }
  };
  // To set custom views
  ViewListener viewListener = new ViewListener() {
    @Override
    public View setViewForPosition(int position) {

      View customView = getLayoutInflater().inflate(R.layout.view_custom, null);

      TextView labelTextView = (TextView) customView.findViewById(R.id.labelTextView);
      ImageView fruitImageView = (ImageView) customView.findViewById(R.id.fruitImageView);

      fruitImageView.setImageResource(sampleImages[position]);
      labelTextView.setText(sampleTitles[position]);

      carouselView.setIndicatorGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP);

      return customView;
    }
  };
  View.OnClickListener pauseOnClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      carouselView.pauseCarousel();
      customCarouselView.reSetSlideInterval(0);
    }
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    carouselView = findViewById(R.id.carouselView);
    customCarouselView = findViewById(R.id.customCarouselView);
    carouselLabel = findViewById(R.id.carouselLabel);
    customCarouselLabel = findViewById(R.id.customCarouselLabel);
    pauseButton = findViewById(R.id.pauseButton);

    pauseButton.setOnClickListener(pauseOnClickListener);

    carouselView.setPageCount(sampleImages.length);

    customCarouselView.setPageCount(sampleImages.length);
    customCarouselView.setSlideInterval(4000);

    carouselView.setCarouselListener(imageListener);
    customCarouselView.setCarouselListener(viewListener);
    carouselView.setEntryViewClickListener(new EntryViewClickListener() {
      @Override
      public void onClick(int position) {
        Toast.makeText(MainActivity.this, "Clicked item: " + position, Toast.LENGTH_SHORT).show();
      }
    });

  }

}
