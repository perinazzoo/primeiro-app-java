package com.gabrielperinazzo.primeiroaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title;
    EditText firstNameInput, lastNameInput, phoneInput, emailInput;
    Button clearButton, saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View clearBtn = findViewById(R.id.clearButton);
        View saveBtn = findViewById(R.id.saveButton);

        final TextView firstName = findViewById(R.id.firstNameInput);
        final TextView lastName = findViewById(R.id.lastNameInput);
        final TextView phoneNumber = findViewById(R.id.phoneInput);
        final TextView emailAddress = findViewById(R.id.emailInput);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName.setText("");
                lastName.setText("");
                phoneNumber.setText("");
                emailAddress.setText("");
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Primeiro nome: "+firstName.getText()+"\nUltimo nome: "+lastName.getText()+"\nNúmero: "+phoneNumber.getText()+"\nEndereço de email: "+emailAddress.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
