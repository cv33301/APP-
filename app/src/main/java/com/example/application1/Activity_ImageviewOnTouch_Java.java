package com.example.application1;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


    public class Activity_ImageviewOnTouch_Java extends AppCompatActivity {

        ImageView imageview_01;
        TextView textview_chang_pic, textview_chang_scaletype;

        int imageIndex = 0, scaleIndex = 0, i = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_imageview_java);
    //        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
    //            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
    //            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
    //            return insets;
    //        });
            imageview_01 = findViewById(R.id.imageview_01);
            textview_chang_pic = findViewById(R.id.textview_chang_pic);
            textview_chang_scaletype = findViewById(R.id.textview_chang_scaletype);

            textview_chang_pic.setText("手勢觸發的動作型態：");
            textview_chang_scaletype.setText("");

            imageview_01.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        textview_chang_scaletype.setText("ACTION DOWN 動作被觸發");
                    } else if (event.getAction() == MotionEvent.ACTION_UP) {
                        textview_chang_scaletype.setText("ACTION UP 動作被觸發");
                    } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                        textview_chang_scaletype.setText("ACTION MOVE 動作被觸發");
                    } else {
                        textview_chang_scaletype.setText("ACTION CODE-" + event.getAction());
                    }

                    return false;
                }
            });

        }
    }

