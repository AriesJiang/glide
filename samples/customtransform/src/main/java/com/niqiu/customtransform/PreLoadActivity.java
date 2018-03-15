package com.niqiu.customtransform;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;
import com.niqiu.customtransform.transform.GlideRoundTransform;

public class PreLoadActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pre_load);
    ImageView imageView = findViewById(R.id.custom_form_image);
    ImageView preLoadImg = findViewById(R.id.custom_preload_image);

    RequestOptions options = new RequestOptions()
        .centerCrop()
        .placeholder(R.mipmap.ic_launcher)
        .error(R.mipmap.ic_launcher)
        .priority(Priority.HIGH)
        .transform(new GlideRoundTransform(this, 12, ContextCompat.getColor(this, android.R.color.black))); //带白色边框的圆形图片加载
//        .transform(new GlideRoundTransform(0));
//        .transform(new GlideCircleTransform());

//    Glide.with(this)
////        .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516861354&di=306794fcb2e5809e2a05eb3ff34b4e89&imgtype=jpg&er=1&src=http%3A%2F%2Fi1363.photobucket.com%2Falbums%2Fr704%2Fnfchq%2FDSCF2152_zpsea0b8349.jpg")
//        .load("/storage/emulated/0/DCIM/Camera/20180117_192446.mp4")
////        .apply(options)
//        .into(imageView);
//
    Glide.with(this)
        .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516266525129&di=5f5587b71ac4d2408ff9c4e884ddbf0c&imgtype=0&src=http%3A%2F%2Fupload.chinaz.com%2F2015%2F0929%2F1443533979582.jpg")
        .apply(options)
        .into(preLoadImg);
  }
}
