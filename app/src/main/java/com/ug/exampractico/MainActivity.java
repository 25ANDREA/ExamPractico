package com.ug.exampractico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextCParcial1 = findViewById(R.id.editTextCParcial1);
        final EditText editTextCParcial2 = findViewById(R.id.editTextCParcial2);
        final EditText editTextPromedio = findViewById(R.id.editTextPromedio);
        Button btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNotaParcial1 = editTextCParcial1.getText().toString();
                String strNotaParcial2 = editTextCParcial2.getText().toString();

                double calificacionParcial1 = Double.parseDouble(strNotaParcial1);
                double calificacionParcial2 = Double.parseDouble(strNotaParcial2);

                double Promedio = (calificacionParcial1  + calificacionParcial2) / 2;

                editTextPromedio.setText(String.valueOf(Promedio));
            }
        });
    }
}