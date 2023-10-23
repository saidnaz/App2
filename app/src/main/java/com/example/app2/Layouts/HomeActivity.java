package com.example.app2.Layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.app2.Layouts.a01_Layout.L01_LinearActivity;
import com.example.app2.Layouts.a01_Layout.L02_RelativeActivity;
import com.example.app2.Layouts.a01_Layout.L03_FrameActivity;
import com.example.app2.R;

public class HomeActivity extends AppCompatActivity {


    Button btnLinearLayout;
    Button btnRelativeLayout;
    Button btnFrameLayout;
    public  void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);

    }
    // 4 Methodes pour la gestion du bouton LinearLayout

    public  void  setBtnLinearLayout(){
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L01_LinearActivity.class));
            }
        });
    }
    public  void  setBtnFrameLayout(){
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_FrameActivity.class));
            }
        });
    }
    public  void  setBtnRelativeLayout(){
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_RelativeActivity.class));

            }

        });


    }
   /** Life Cyckes */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initUI(); // 3 Appel
        setBtnLinearLayout();
        setBtnRelativeLayout();
        setBtnFrameLayout();
    }

}