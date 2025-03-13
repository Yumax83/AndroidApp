package com.example.first;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewBtn1;
    private TextView textViewBtn2;
    private Button txt1Button;
    private Button txt2Button;
    private ImageView imageSmile1;
    private ImageView imageSmile2;



//    private TextView textSample;
//    private Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.first_layout);
        //       setContentView(R.layout.second_layout);
//        setContentView(R.layout.dz_dz2);
        //      setContentView(R.layout.linear_layout_2);
//        setContentView(R.layout.table_layout_1);
//        setContentView(R.layout.frame_layout_1);
//        setContentView(R.layout.scroll_view_1);
        //       setContentView(R.layout.third_layout);
        setContentView(R.layout.dz_dz3);

        textViewBtn1 = findViewById(R.id.textViewBtn1);
        txt1Button = findViewById(R.id.txt1Button);
        imageSmile1 = findViewById(R.id.imageSmile1);
        txt1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewBtn1.setTextColor(RED);
                imageSmile1.setVisibility(VISIBLE);
                txt1Button.setVisibility(INVISIBLE);
                txt2Button.setVisibility(VISIBLE);
            }
        });

        textViewBtn2 = findViewById(R.id.textViewBtn2);
        txt2Button = findViewById(R.id.txt2Button);
        imageSmile2=findViewById(R.id.imageSmile2);
        txt2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewBtn2.setTextColor(GREEN);
                imageSmile2.setVisibility(VISIBLE);
                txt2Button.setVisibility(INVISIBLE);
            }
        });
//        textSample = findViewById(R.id.textSample);
//        secondButton= findViewById(R.id.secondButton);
//        secondButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textSample.setText("Новое приветствие");
//                textSample.setTextSize(40);
//            }
//        });

                                      }

//    public void sayHello(View view){
//        textSample.setText("Привет");
//    }
    }