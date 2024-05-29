package com.example.cuidar.Fragments_and_menus.In_patient.Cuestionario.PersonalImplicado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;


public class CuestionarioFragment extends Fragment implements View.OnClickListener {
    PacienteDiagnostico paciente;
    Button siguiente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_questionario, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");


        //// para comprobar que el objeto se paso bien ////
        TextView text = view.findViewById(R.id.textView28);
        TextView text1 = view.findViewById(R.id.textView29);
        //----------------------------------------------///
        text.setText(paciente.getNombre());
        text1.setText(paciente.getFecha());
        ////        Luego se borra esto             ///////

        siguiente = view.findViewById(R.id.siguiente);
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


        CuestionarioPersonalImplicado2 cuestionarioPersonalImplicado2 = new CuestionarioPersonalImplicado2();
        cuestionarioPersonalImplicado2.setArguments(bundle);
        ft.replace(R.id.fragment_container, cuestionarioPersonalImplicado2);


        ft.addToBackStack(null);
        ft.commit();
    }
}