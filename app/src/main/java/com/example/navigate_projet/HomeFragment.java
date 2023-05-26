package com.example.navigate_projet;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class HomeFragment extends Fragment {

    private Button btnAdd;
    private Button btnSub;
    private Button btnMulti;
    private Button btnDivide;

    private EditText et1;
    private EditText et2;
    private EditText et3;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnAdd = view.findViewById(R.id.button2);
        btnSub = view.findViewById(R.id.button3);
        btnMulti = view.findViewById(R.id.button4);
        btnDivide = view.findViewById(R.id.button5);

        et1 = view.findViewById(R.id.editTextNumber);
        et2 = view.findViewById(R.id.editTextNumber2);
        et3 = view.findViewById(R.id.editTextNumber3);


        btnAdd.setOnClickListener(v -> {
            if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
                Toast.makeText(getActivity(), "Veuillez entrer deux nombres", Toast.LENGTH_SHORT).show();
                return;
            }
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());
            int result = n1 + n2;

            et3.setText("La somme est : " + result);
        });

        btnSub.setOnClickListener(v -> {
            if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
                Toast.makeText(getActivity(), "Veuillez entrer deux nombres", Toast.LENGTH_SHORT).show();
                return;
            }
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());
            int result = n1 - n2;

            et3.setText("La différence est : " + result);
        });

        btnMulti.setOnClickListener(v -> {
            if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
                Toast.makeText(getActivity(), "Veuillez entrer deux nombres", Toast.LENGTH_SHORT).show();
                return;
            }
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());
            int result = n1 * n2;

            et3.setText("La multiplication est : " + result);
        });

        btnDivide.setOnClickListener(v -> {
            if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()) {
                Toast.makeText(getActivity(), "Veuillez entrer deux nombres", Toast.LENGTH_SHORT).show();
                return;
            }
            float n1 = Float.parseFloat(et1.getText().toString());
            float n2 = Float.parseFloat(et2.getText().toString());

            if (n2 == 0) {
                Toast.makeText(getActivity(), "Division par zéro impossible", Toast.LENGTH_SHORT).show();
                return;
            }
            float result = n1 / n2;

            et3.setText("La division est : " + result);




        });

        return view;
}
}
