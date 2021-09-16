package com.example.voice_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View v){
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,RegistrationActivity.class);
        startActivity(intent);

    }
}