package com.example.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OutputFragment extends Fragment {

    TextView txtres;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_output, container, false);
        txtres = v.findViewById(R.id.txtoutput);
        Bundle bn = this.getArguments();

        int id = bn.getInt("eid");
        String name = bn.getString("ename");
        double salary = bn.getDouble("esalary");
        txtres.setText("Employee id= " + id + "Name = " + name + "Salary = " + salary);
        return v;
    }
}