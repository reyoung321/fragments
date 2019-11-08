package com.kishor_bhattarai.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button button;
private boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.btn1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (status){
            FirstFragments firstFragment = new FirstFragments();
            fragmentTransaction.replace(R.id.Linear, firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            button.setText("Load second Fragment");
            status = false;
        }
        else {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.Linear, secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            button.setText("Load first Fragment");
            status = true;
        }
    }
}
