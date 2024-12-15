package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView hellotext;
    private ImageButton startbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        hellotext = (TextView) findViewById(R.id.hellotext);
        startbutton = (ImageButton) findViewById(R.id.startbutton);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void navigateToAnotherPage(View view) {
        Intent intent = new Intent(this, develop.class);
        startActivity(intent);
    }
    public void onstartbuttonclick(View view) {
        startbutton.setImageResource(R.drawable.hello);
        hellotext.setVisibility(View.VISIBLE);
        startbutton.setClickable(false);
    }
}