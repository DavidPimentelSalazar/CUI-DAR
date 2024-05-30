package com.example.cuidar.Fragments_and_menus.In_patient.cuestionario;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuidar.Fragments_and_menus.In_patient.cuestionario.PersonalImplicado.CuestionarioFragment;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;

public class Cuestionario extends AppCompatActivity {

    PacienteDiagnostico paciente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);

        Bundle bundle = getIntent().getExtras();
        paciente = (PacienteDiagnostico) bundle.get("paciente");

        System.out.println(paciente.getNombre());

        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("paciente", paciente);

        CuestionarioFragment cuestionarioFragment = new CuestionarioFragment();
        cuestionarioFragment.setArguments(bundle2);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, cuestionarioFragment).commit();
    }
}