package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.Sud;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cuidar.Fragments_and_menus.GestionDeDiagnosticos;
import com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.Cuestionario;
import com.example.cuidar.Fragments_and_menus.Main;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

public class No2 extends Fragment implements View.OnClickListener {

    PacienteDiagnostico paciente;
    Button siguiente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_no2, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        siguiente = view.findViewById(R.id.siguiente3);
        siguiente.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), Main.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("paciente",paciente);
        intent.putExtra("paciente",bundle);
        startActivity(intent);
    }
}