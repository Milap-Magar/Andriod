package com.example.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class InputFragment extends Fragment {
    Button b1;
    TextView t1, t2, t3;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_input, container, false);
        t1 = v.findViewById(R.id.empid);
        t2 = v.findViewById(R.id.empname);
        t3 = v.findViewById(R.id.empsalary);
        b1 = v.findViewById(R.id.btnsend);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(t1.getText().toString());
                String name = t2.getText().toString();
                double salary = Double.parseDouble(t3.getText().toString());
                OutputFragment of = new OutputFragment();
                Bundle bn = new Bundle();
                bn.putInt("eid", id );
                bn.putString("name", name);
                bn.putDouble("esalary", salary);

                of.setArguments(bn);
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.outputcontainer, of);
                ft.commit();
            }
        });
        return v;
    }
}