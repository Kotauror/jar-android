package com.justynaapps.justynazygmunt.personapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import main.Human;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human human = new Human(10, " I COME FROM BACKEND!!!");
        int idOfWindowInMobileGrid = getResources().getIdentifier("textView2", "id", getPackageName());
        TextView my = findViewById(idOfWindowInMobileGrid);
        my.setText(human.getName().toString());
    }
}
