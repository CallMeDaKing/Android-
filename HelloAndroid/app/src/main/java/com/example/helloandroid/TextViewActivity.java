package com.example.helloandroid;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_text_view);
        mTextView4 = (TextView)findViewById(R.id.textView_4);
        mTextView4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);  // 给textView 文字添加中划线
        mTextView4.getPaint().setAntiAlias(true);  // 去除锯齿

        mTextView5 = (TextView)findViewById(R.id.textView_5);
        mTextView5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTextView5.getPaint().setAntiAlias(true);

        mTextView6 = (TextView)findViewById(R.id.textView_6);
        mTextView6.setText(Html.fromHtml("<u>金哥也想让下一代更幸福</u>"));

        mTextView7 = (TextView)findViewById(R.id.textView_7);
        mTextView7.setSelected(true);
    }
}

