package com.example.formapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    //Initialize Variables
    EditText etLastName, etFirstName, etPhone, etAge, etDomain;
    Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Variables
        etLastName = findViewById(R.id.editTextLastName);
        etFirstName = findViewById(R.id.editTextFirstName);
        etPhone = findViewById(R.id.editTextPhone);
        etAge = findViewById(R.id.editTextAge);
        etDomain = findViewById(R.id.editTextDomain);
        btnSubmit = findViewById(R.id.button);

        btnSubmit.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder confirm = new AlertDialog.Builder(MainActivity.this);
                        confirm.setTitle("Confirmation");
                        confirm.setIcon(R.drawable.ic_baseline_warning_24);
                        confirm.setMessage(R.string.confirm_msg);

                        confirm.setPositiveButton(R.string.yes,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(),R.string.click_yes_action,Toast.LENGTH_LONG).show();

                                    }
                                }
                        );
                        confirm.setNegativeButton(R.string.no,null);
                        confirm.show();
                    }
                }

        );
    }
}