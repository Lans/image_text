package com.example.administrator.app;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;

/**
 * 图文混排
 */
public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        SpannableString spannableString2 = new SpannableString("    123商品商品上的改变手机看大家爱看阿萨德还搜电影啊爱上大压缩一点傲视大搜大搜大搜的的啊大生意的是");
        Drawable d2 = getResources().getDrawable(R.mipmap.daiyanrzg);
        d2.setBounds(0, 0, d2.getIntrinsicWidth(), d2.getIntrinsicHeight());//这里设置图片的大小
        ImageSpan imageSpan2 = new ImageSpan(d2, ImageSpan.ALIGN_BASELINE);
        spannableString2.setSpan(imageSpan2, 0, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        text.setText(spannableString2);
    }
}
