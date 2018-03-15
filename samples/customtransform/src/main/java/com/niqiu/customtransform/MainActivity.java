package com.niqiu.customtransform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;
import com.niqiu.customtransform.transform.GlideCircleTransform;
import com.niqiu.customtransform.transform.GlideRoundTransform;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Glide.with(this)
        .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516266525129&di=5f5587b71ac4d2408ff9c4e884ddbf0c&imgtype=0&src=http%3A%2F%2Fupload.chinaz.com%2F2015%2F0929%2F1443533979582.jpg")
        .preload();
  }

  public void onBtnClick(View view) {
    switch (view.getId()) {
      case R.id.custom_preload :
        startActivity(new Intent(this, PreLoadActivity.class));
        break;
    }
  }
}
