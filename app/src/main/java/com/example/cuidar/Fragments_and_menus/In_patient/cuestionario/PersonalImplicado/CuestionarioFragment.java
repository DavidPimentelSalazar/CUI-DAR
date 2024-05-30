package com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.PersonalImplicado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.EvaluacionInicial.EvaluacionInicial1;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;


public class CuestionarioFragment extends Fragment implements View.OnClickListener {
    PacienteDiagnostico paciente;
    Button siguiente;
    ArrayList<EditText> editTexts;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_questionario, container, false);

        /// editText ///
        editTexts = new ArrayList<>();
        editTexts.add(view.findViewById(R.id.cuidadorPrincipal_edit));
        editTexts.add(view.findViewById(R.id.Relación_con_paciente_edit));

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        siguiente = view.findViewById(R.id.siguiente);
        siguiente.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        // editText
        paciente.setDiagnostico_texto(editTexts.get(0).getText());
        paciente.setComorbilidad(editTexts.get(1).getText());


        // fragmentos
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        // bundle
        Bundle bundle = new Bundle();
        bundle.putSerializable("paciente",paciente);


        EvaluacionInicial1 evaluacionInicial1 = new EvaluacionInicial1();
        evaluacionInicial1.setArguments(bundle);
        ft.replace(R.id.fragment_container, evaluacionInicial1);


        ft.addToBackStack(null);
        ft.commit();
    }
}