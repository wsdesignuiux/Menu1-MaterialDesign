package com.wolfsoft.menu1materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView more;

    LinearLayout linear,bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.linear);
        bg = findViewById(R.id.bg);
        more = findViewById(R.id.more);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linear.setVisibility(View.VISIBLE);
                bg.setVisibility(View.VISIBLE);
            }
        });

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linear.setVisibility(View.GONE);
                bg.setVisibility(View.GONE);
            }
        });
    }
}
