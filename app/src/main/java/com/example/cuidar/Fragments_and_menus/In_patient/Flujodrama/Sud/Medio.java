package com.example.cuidar.Fragments_and_menus.In_patient.Flujodrama.Sud;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;


public class Medio extends Fragment implements View.OnClickListener {
    PacienteDiagnostico paciente;
    ArrayList<Button> buttons;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_medio, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        buttons = new ArrayList<>();
        buttons.add(view.findViewById(R.id.siguiente2));
        buttons.add(view.findViewById(R.id.siguiente3));

        for (Button tmp: buttons) {
            tmp.setOnClickListener(this);
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        // bundle
        Bundle bundle = new Bundle();
        bundle.putSerializable("paciente",paciente);

        if (v == buttons.get(0)){
            Si si = new Si();
            si.setArguments(bundle);
            ft.replace(R.id.fragment_container, si);
        } else if (v == buttons.get(1)) {
            No no = new No();
            no.setArguments(bundle);
            ft.replace(R.id.fragment_container, no);
        }

        ft.addToBackStack(null);
        ft.commit();
    }
}