
        package com.huazai.myapplication15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


        public class Main2Activity extends AppCompatActivity {

            @Override
            public void onBackPressed() {
                Intent it=new Intent();
                it.putExtra("bbbb","没什么看的，都叫你不要看！");
                setResult(RESULT_OK,it);
                super.onBackPressed();
            }

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);
                final TextView tv1=(TextView)findViewById(R.id.textView1);
                Intent intent=getIntent();
                String aaaa=intent.getStringExtra("aaaa");//对方用aaaa传过来，我用aaaa去接
                tv1.setText(aaaa);
                final Button button = (Button)findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.putExtra("bbbb", "没什么看的，都叫你不要看");
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                });
            }
        }


