package com.example.administrator.qqlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IndexActivity extends AppCompatActivity {

    ImageView image;
    ImageButton exit;
    TextView t;

    int[] ico=new int[]{R.drawable.qq,R.drawable.ico1,R.drawable.ico2};

String[] i=new String[]{"轻舞飞扬","太阳花","飞天小女警"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int index=bundle.getInt("index");


        image=(ImageView) findViewById(R.id.qq);
        image.setImageResource(ico[index]);
        t= (TextView) findViewById(R.id.textView);
        t.setText(i[index]);
        /*exit=(ImageButton)findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); //关闭当前Activity
            }
        });*/

    }
}