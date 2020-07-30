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

        Button clearBtn = findViewById(R.id.clearButton);
        Button saveBtn = findViewById(R.id.saveButton);

        final EditText firstName = findViewById(R.id.firstNameInput);
        final EditText lastName = findViewById(R.id.lastNameInput);
        final EditText phoneNumber = findViewById(R.id.phoneInput);
        final EditText emailAddress = findViewById(R.id.emailInput);

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
