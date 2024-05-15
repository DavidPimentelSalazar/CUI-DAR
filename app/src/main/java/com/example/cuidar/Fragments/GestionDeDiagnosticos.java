package com.example.cuidar.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cuidar.users.PacienteDiagnostico;
import com.example.cuidar.R;

import java.util.ArrayList;


public class GestionDeDiagnosticos extends Fragment implements View.OnClickListener {

    ArrayList<Button> buttons = new ArrayList<>();

    TextView texto;
    PacienteDiagnostico pacienteDiagnostico;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gestion_de_diagnosticos, container, false);

        texto = view.findViewById(R.id.Diagnostico); ///// esto es para coger el titulo para ponerlo ahi luego se quitaria
        pacienteDiagnostico = new PacienteDiagnostico(); // el paciente.

        buttons.add(view.findViewById(R.id.iniciarDiagnostico));

        for (Button button : buttons) {
            button.setOnClickListener(this);
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        Button iniciarDiagnostico = buttons.get(0);

        if (v == iniciarDiagnostico) {
            texto.setText(" "+pacienteDiagnostico.createDate());
        }
    }

}