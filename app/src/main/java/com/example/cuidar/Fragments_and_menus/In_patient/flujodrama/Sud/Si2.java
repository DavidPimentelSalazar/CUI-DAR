package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.Sud;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.Cuestionario;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

public class Si2 extends Fragment implements View.OnClickListener {

    PacienteDiagnostico paciente;
    Button si;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_si2, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        si = view.findViewById(R.id.button2);
        si.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), Cuestionario.class);
        startActivity(intent);
    }
}