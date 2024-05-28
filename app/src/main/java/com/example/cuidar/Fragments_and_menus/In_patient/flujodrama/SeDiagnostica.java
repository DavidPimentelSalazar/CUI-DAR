package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.Sud.Medio;
import com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.Sud.No;
import com.example.cuidar.Fragments_and_menus.In_patient.flujodrama.Sud.Si;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;

public class SeDiagnostica extends Fragment implements View.OnClickListener{
    PacienteDiagnostico paciente;
    ArrayList<Button> buttons;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_se_diagnostica, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        buttons = new ArrayList<>();
        buttons.add(view.findViewById(R.id.si));
        buttons.add(view.findViewById(R.id.mitad));
        buttons.add(view.findViewById(R.id.no));

        for (Button tmp:buttons) {
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
            Medio medio = new Medio();
            medio.setArguments(bundle);
            ft.replace(R.id.fragment_container, medio);
        } else if (v == buttons.get(2)) {
            No no = new No();
            no.setArguments(bundle);
            ft.replace(R.id.fragment_container, no);
        }

        ft.addToBackStack(null);
        ft.commit();
    }
}