package com.example.cuidar;



import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<EditText> editTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTexts = new ArrayList<>();
        editTexts.add(findViewById(R.id.userEditTextLogin));
        editTexts.add(findViewById(R.id.passwdEditTextLogin));

        Button loginBtn = findViewById(R.id.btnLogin);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = editTexts.get(0).getText().toString().trim();
        String password = editTexts.get(1).getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Intent it = new Intent(this, Main.class);///// esto luego se quita
            startActivity(it); ///////////////////////////////////////// esto luego se quita
            Toast.makeText(getApplicationContext(), "Please provide a username and password.", Toast.LENGTH_SHORT).show();
            finish(); ////////////////////////////////////////////////// esto luego se quita
        } else if (username.equals("admin") && password.equals("admin")) {
            Intent it = new Intent(this, Main.class);
            startActivity(it);
            Toast.makeText(getApplicationContext(), "Logged in", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid username or password.", Toast.LENGTH_SHORT).show();
        }
    }
}
