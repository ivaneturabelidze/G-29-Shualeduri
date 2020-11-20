package com.example.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String petRace;
    String petName;
    int petAge;


    public void onButtonClick(View view){
        EditText raceEditText = (EditText) findViewById(R.id.editTextRace);
        EditText nameEditText = (EditText) findViewById(R.id.editTextName);
        EditText ageEditText = (EditText) findViewById(R.id.editTextAge);
        String message;

        if (raceEditText.getText().toString().isEmpty()|| nameEditText.getText().toString().isEmpty() || ageEditText.getText().toString().isEmpty() ){
            message = "Please complete the form";


        }
        else {
            int age = Integer.parseInt(ageEditText.getText().toString());
            if (age > 10 || age < 1){
                message = "Age has to be between 1-10";
            }
            else {
                petRace = raceEditText.getText().toString();
                petName = nameEditText.getText().toString();
                petAge = Integer.parseInt(ageEditText.getText().toString());
                message = "Your pet was created";
            }
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        PetClass pet = new PetClass(petRace,petName,petAge);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
