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
    }

    public void onClickToast(View view) {

        String buttonText = ((Button)view).getText().toString();

        Toast.makeText(
                getApplicationContext(),
                "This button will open the " + buttonText,
                Toast.LENGTH_SHORT).show();
    }
}


