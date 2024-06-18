package com.example.application1;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Radiobutton_Java extends AppCompatActivity {

    TextView textview_answer_q01, textview_answer_q02;
    RadioGroup radiogroup_01, radiogroup_02;
    RadioButton radiobutton_01, radiobutton_02, radiobutton_03, radiobutton_04, radiobutton_05, radiobutton_06;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radiobutton_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        textview_answer_q01 = findViewById(R.id.textview_answer_q01);
        textview_answer_q02 = findViewById(R.id.textview_answer_q02);

        radiogroup_01 = findViewById(R.id.radiogroup_01);
        radiogroup_02 = findViewById(R.id.radiogroup_02);

        radiobutton_01 = findViewById(R.id.radiobutton_01);
        radiobutton_02 = findViewById(R.id.radiobutton_02);
        radiobutton_03 = findViewById(R.id.radiobutton_03);
        radiobutton_04 = findViewById(R.id.radiobutton_04);
        radiobutton_05 = findViewById(R.id.radiobutton_05);
        radiobutton_06 = findViewById(R.id.radiobutton_06);

        //匿名委派:沒有指定方法名稱
        radiogroup_01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedId = radiogroup_01.getCheckedRadioButtonId();

                if (selectedId == R.id.radiobutton_01){
                    textview_answer_q01.setText("第一題選擇："+ radiobutton_01.getText().toString());
                } else if (selectedId == R.id.radiobutton_02){
                    textview_answer_q01.setText("第一題選擇："+ radiobutton_02.getText().toString());
                } else if (selectedId == R.id.radiobutton_03){
                    textview_answer_q01.setText("第一題選擇："+ radiobutton_03.getText().toString());
                }
            }
        });

        //具名委派:有指定方法名稱 ex:radioClickListener
        radiobutton_04.setOnClickListener(radioClickListener);
        radiobutton_05.setOnClickListener(radioClickListener);
        radiobutton_06.setOnClickListener(radioClickListener);
    }
    View.OnClickListener radioClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selectedId = radiogroup_02.getCheckedRadioButtonId();
            View v1 = findViewById(selectedId);
            RadioButton rb1 = (RadioButton)  v1;
            textview_answer_q02.setText("第二題選擇："+ rb1.getText().toString());
        }
    };
}