package com.niqiu.customtransform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    ImageView imageView = findViewById(R.id.custom_form_image);

    RequestOptions options = new RequestOptions()
        .centerCrop()
        .placeholder(R.mipmap.ic_launcher)
        .error(R.mipmap.ic_launcher)
        .priority(Priority.HIGH)
        .transform(new GlideRoundTransform(20));
//        .transform(new GlideCircleTransform());

    Glide.with(this)
        .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513921422581&di=096b08b70daeefa1479f5dc1dec80bc2&imgtype=0&src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fitbbs%2F1412%2F12%2Fc7%2F577115_1418395060436_mthumb.jpg")
        .apply(options)
        .into(imageView);
  }
}
