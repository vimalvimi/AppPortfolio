package com.vimalvimiroxy.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.buttonPopularMovies);
        Button button2 = (Button) findViewById(R.id.buttonStockHawk);
        Button button3 = (Button) findViewById(R.id.buttonBuildItBigger);
        Button button4 = (Button) findViewById(R.id.buttonMakeYourAppMaterial);
        Button button5 = (Button) findViewById(R.id.buttonGoUbiquitous);
        Button button6 = (Button) findViewById(R.id.buttonCapstone);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "This button will open the Popular Movies project",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "This button will open the Stock Hawk project",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "This button will open the Build it Bigger project",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "This button will open the App Material project",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "This button will open the Ubiquitous project",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "This button will open the Capstone project",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
