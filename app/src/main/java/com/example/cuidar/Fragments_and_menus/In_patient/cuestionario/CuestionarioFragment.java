package com.example.cuidar.Fragments_and_menus.In_patient.cuestionario;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;


public class CuestionarioFragment extends Fragment {
    PacienteDiagnostico paciente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_questionario, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        TextView text = view.findViewById(R.id.textView28);
        TextView text1 = view.findViewById(R.id.textView29);

        text.setText(paciente.getNombre());
        text1.setText(paciente.getFecha());

        return view;
    }
}