package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.Sud;

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


public class Si extends Fragment implements View.OnClickListener{
    PacienteDiagnostico paciente;
    Button siguiente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_si, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        siguiente = view.findViewById(R.id.siguiente2);
        siguiente.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        // bundle
        Bundle bundle = new Bundle();
        bundle.putSerializable("paciente",paciente);

        // meter el bundle en el fragmento
        Si2 si2 = new Si2();
        si2.setArguments(bundle);

        ft.replace(R.id.fragment_container, si2);
        ft.addToBackStack(null);
        ft.commit();
    }
}