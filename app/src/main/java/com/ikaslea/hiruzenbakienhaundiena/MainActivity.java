package com.ikaslea.hiruzenbakienhaundiena;

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

public class MainActivity extends AppCompatActivity {

    EditText Zenbakia1;
    EditText Zenbakia2;
    EditText Zenbakia3;
    TextView Erantzuna;
    Button Erakutsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Zenbakia1 = findViewById(R.id.editTextNumber4);
        Zenbakia2 = findViewById(R.id.editTextNumber);
        Zenbakia3 = findViewById(R.id.editTextNumber3);
        Erantzuna = findViewById(R.id.textView);
        Erakutsi = findViewById(R.id.button);
        Erakutsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ErakutsiZenbakiAltuena();
            }
        });
    }


    private int Hiruhandienak(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public void ErakutsiZenbakiAltuena() {
        int num1 = Integer.parseInt(Zenbakia1.getText().toString());
        int num2 = Integer.parseInt(Zenbakia2.getText().toString());
        int num3 = Integer.parseInt(Zenbakia3.getText().toString());

        int max = Hiruhandienak(num1, num2, num3);
        Erantzuna.setText("Zenbaki altuena : " + max + " da");
    }
}