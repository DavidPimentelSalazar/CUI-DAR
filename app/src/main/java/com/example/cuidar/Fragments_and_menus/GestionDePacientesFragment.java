package com.example.cuidar.Fragments_and_menus;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cuidar.Fragments_and_menus.In_patient.DiagnosticoPaciente;
import com.example.cuidar.Fragments_and_menus.In_patient.Flujodrama;
import com.example.cuidar.R;

import java.util.ArrayList;

public class GestionDePacientesFragment extends Fragment implements View.OnClickListener{

    ArrayList<Button> buttons;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gestion_de_pacientes, container, false);

        buttons = new ArrayList<>();
        buttons.add(view.findViewById(R.id.button_eduardo));
        buttons.add(view.findViewById(R.id.button_eduardo2));

        for (Button tmp:buttons) {
            tmp.setOnClickListener(this);
        }

        return view;
    }

@Override
    public void onClick(View v) {
        if (v == buttons.get(0)) {
            Intent intent = new Intent(getContext(), DiagnosticoPaciente.class);
            startActivity(intent);
        } else if (v == buttons.get(1)){
            Intent intent = new Intent(getContext(), Flujodrama.class);
            startActivity(intent);
        }
    }

}