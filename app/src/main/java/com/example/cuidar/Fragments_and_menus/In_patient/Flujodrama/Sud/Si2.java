package com.example.cuidar.Fragments_and_menus.In_patient.Flujodrama.Sud;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cuidar.Fragments_and_menus.In_patient.Cuestionario.Cuestionario;
import com.example.cuidar.R;
import com.example.cuidar.users_data.PacienteDiagnostico;
import com.google.gson.Gson;

import java.io.FileWriter;

public class Si2 extends Fragment implements View.OnClickListener {

    PacienteDiagnostico paciente;
    Button si;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_si2, container, false);

        paciente = (PacienteDiagnostico) getArguments().get("paciente");

        TextView texto;
        texto = view.findViewById(R.id.textView19);
        texto.setText(paciente.getNombre());

        si = view.findViewById(R.id.button2);
        si.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        //json();

        Intent intent = new Intent(getActivity(), Cuestionario.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("paciente",paciente);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    protected void json() {
        Gson gson = new Gson();
        String json = gson.toJson(paciente);

        FileWriter fw;
        try {
            fw = new FileWriter("paciente.json");
        } catch (Exception e) {
            Log.i("json", "json: Error paciente al crear el archivo");
            return;
        }

        try {
            fw.write(json);
        } catch (Exception e) {
            Log.e("json", "json: Error al escribir el achivo", e );
        }

        try {
            fw.close();
        } catch (Exception e) {
            Log.i("json", "json: Error al cerrar el archivo");
        }
    }
}