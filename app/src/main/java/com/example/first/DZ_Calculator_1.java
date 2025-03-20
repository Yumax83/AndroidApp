package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DZ_Calculator_1 extends AppCompatActivity {
    private TextView result;
    private EditText num1, num2;
    private Button btnDif, btnSum, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_dz_calculator1);
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.editNum1);
        num2 = findViewById(R.id.editNum2);
        btnSum = findViewById(R.id.buttonSum);
        btnDif = findViewById(R.id.buttonDif);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());
                if ((num1 != null) || (num2 != null)) {
                    result.setText("Результат: " + number1 + " + " + number2 + " = " + String.valueOf(number1 + number2));
                }
            }
        });

        btnDif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());
                result.setText("Результат: " + number1 + " - " + number2 + " = " + String.valueOf(number1 - number2));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());
                result.setText("Результат: " + number1 + " * " + number2 + " = " + String.valueOf(number1 * number2));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double number1 = Double.parseDouble(num1.getText().toString());
                Double number2 = Double.parseDouble(num2.getText().toString());
                result.setText("Результат: " + number1 + " / " + number2 + " = " + String.valueOf(number1 / number2));
            }
        });

    }

    public void eExit(View view) {
        finish();
    }
}
