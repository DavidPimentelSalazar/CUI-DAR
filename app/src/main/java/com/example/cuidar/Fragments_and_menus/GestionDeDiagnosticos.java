package com.example.cuidar.Fragments_and_menus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cuidar.users_data.PacienteDiagnostico;
import com.example.cuidar.R;

import java.util.ArrayList;


public class GestionDeDiagnosticos extends Fragment {

    ArrayList<Button> buttons = new ArrayList<>();

    TextView texto;
    PacienteDiagnostico pacienteDiagnostico;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gestion_de_diagnosticos, container, false);

        return view;
    }

}