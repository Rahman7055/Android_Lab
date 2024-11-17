package com.lab.id_card;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load University Logo
        ImageView universityLogo = findViewById(R.id.university_logo);
        universityLogo.setImageResource(R.drawable.ju_logo);

        // Load Student Picture
        ImageView studentPicture = findViewById(R.id.student_picture);
        studentPicture.setImageResource(R.drawable.student_pic);

        // Load Barcode
        ImageView barcode = findViewById(R.id.barcode);
        barcode.setImageResource(R.drawable.barcode);
    }
}
