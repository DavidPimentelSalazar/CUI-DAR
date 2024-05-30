package com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.PersonalImplicado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

import java.util.ArrayList;

public class CuestionarioPersonalImplicado2 extends Fragment implements View.OnClickListener {
    Button siguiente;
    ArrayList<RadioButton> radioButtons;
    PacienteDiagnostico paciente;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cuestionario_personal_implicado2, container, false);

        radioButtons = new ArrayList<>();
        radioButtons.add(view.findViewById(R.id.A1_1));
        radioButtons.add(view.findViewById(R.id.A1_2));

//        radioButtons.get(0).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//              if (isChecked == view.findViewById(R.id.Si_radioButton_A1_1)) {
//
//              } else if (isChecked == view.findViewById(R.id.No_radioButton_A1_1)) {
//
//              } else if (isChecked == view.findViewById(R.id.Np_radioButton_A1_1)) {
//
//              }
//            }
//        });

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        siguiente = view.findViewById(R.id.siguiente);
        siguiente.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        // fragmentos
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


//        =*+*+**************-
//        =*+===+############=
//        +#+===+############=              CODIGO DE NOBATO ALANTE
//        +#+===+############=              NO SUFRA DEMASIADO
//        +#+===+############=              @GLa2s github
//        +#+===+############+
//        *#+===+############+
//        *#+===*%%##########+
//        *#*===*##%#########*
//        *#*===+++++++++++*#*
//        *#*==============+#*
//        *#*+***+***++*+++*#*
//        +##################+