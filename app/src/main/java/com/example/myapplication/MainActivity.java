package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
        button = findViewById(R.id.button);
//        text view where the Ans will get displayed
        textView = findViewById((R.id.textView));
        editText = findViewById((R.id.editTextNumber));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ENTER THE NEXT VALUE ", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int valInC = Integer.parseInt(s);
                double valInF = (valInC*1.80)+32;

                textView.setText(valInC+" °C"+" = "+valInF+" °F");
            }
        });


    }
}