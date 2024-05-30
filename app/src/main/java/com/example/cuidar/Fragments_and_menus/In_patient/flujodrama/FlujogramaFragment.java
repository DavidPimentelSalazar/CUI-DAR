package com.example.cuidar.Fragments_and_menus.In_patient.flujodrama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;


public class FlujogramaFragment extends Fragment implements View.OnClickListener {

    ArrayList<Switch> switches;
    Button siguiente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flujograma, container, false);

        switches = new ArrayList<>();
        switches.add(view.findViewById(R.id.reversible_switch));
        switches.add(view.findViewById(R.id.ultimasHoras_switch));
        switches.add(view.findViewById(R.id.especialista_switch));
        siguiente = view.findViewById(R.id.siguiente); // boton de abajo

        siguiente.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        PacienteDiagnostico paciente = (PacienteDiagnostico) getArguments().get("paciente");
        paciente.createDate();
        paciente.setReversible(switches.get(0).isChecked());
        paciente.setUltimasHoras(switches.get(1).isChecked());
        paciente.setDeviracionEspecialista(switches.get(2).isChecked());

        fragmento(paciente);
    }

    public void fragmento(PacienteDiagnostico paciente) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("paciente",paciente);

        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        SudFragment sud = new SudFragment();
        sud.setArguments(bundle);

        ft.replace(R.id.fragment_container, sud);
        ft.addToBackStack(null);
        ft.commit();
    }
}