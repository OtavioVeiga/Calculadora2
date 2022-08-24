package br.unigran.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = (Button)findViewById(R.id.btn_somar);
        Button btn_dividir = (Button)findViewById(R.id.btn_dividir);
        Button btn_multiplicar = (Button)findViewById(R.id.btn_multiplicar);
        Button btn_subitrair = (Button)findViewById(R.id.btn_subitrair);

        TextView resultado = (TextView) findViewById(R.id.resultado);
        EditText valor1 = (EditText) findViewById(R.id.valor1);
        EditText valor2 = (EditText) findViewById(R.id.valor2);


        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(valor1.getText().toString());
                num2 = Double.parseDouble(valor2.getText().toString());

                result = num1 / num2;
                resultado.setText(String.valueOf(result));
            }
        });

        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(valor1.getText().toString());
                num2 = Double.parseDouble(valor2.getText().toString());

                result = num1 + num2;
                resultado.setText(String.valueOf(result));
            }
        });

        btn_subitrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(valor1.getText().toString());
                num2 = Double.parseDouble(valor2.getText().toString());

                result = num1 - num2;
                resultado.setText(String.valueOf(result));
            }
        });

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(valor1.getText().toString());
                num2 = Double.parseDouble(valor2.getText().toString());

                result = num1 * num2;
                resultado.setText(String.valueOf(result));
            }
        });
    }
}