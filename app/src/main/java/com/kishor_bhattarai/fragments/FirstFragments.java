package com.kishor_bhattarai.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragments extends Fragment implements View.OnClickListener {
private Button btnadd;
private EditText etFirst,etSecond;

    public FirstFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first_fragments,container, false);
        etFirst= view.findViewById(R.id.etfirst);
        etFirst= view.findViewById(R.id.etsecond);
        btnadd=view.findViewById(R.id.btnadd);
        btnadd.setOnClickListener(this);
        return view;}


    @Override
    public void onClick(View v) {

    int first=Integer.parseInt(etFirst.getText().toString());
        int second=Integer.parseInt(etSecond.getText().toString());
        int result= first+second;
        Toast.makeText(getActivity(),"" +result, Toast.LENGTH_SHORT).show();

    }
}
