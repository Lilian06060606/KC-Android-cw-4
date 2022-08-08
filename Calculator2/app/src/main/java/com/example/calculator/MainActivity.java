package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        TextView calculator = findViewById(R.id.textView);
        TextView enter = findViewById(R.id.textView1);
        EditText number1 = findViewById(R.id.editTextTextPersonName);
        EditText number2 = findViewById(R.id.editTextTextPersonName1);
        Button  plus = findViewById(R.id.textView2);
        Button  multiplied = findViewById(R.id.textView3);
        Button minus = findViewById(R.id.textView4);
        Button divided = findViewById(R.id.textView5);
        Button calculate = findViewById(R.id.button2);
        TextView total = findViewById(R.id.textView0);
  plus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          int x = Integer.parseInt(number1.getText().toString());
          int y = Integer.parseInt(number2.getText().toString());
          int r = x+y;
          total.setText(String.valueOf(r));
          System.out.println("///"+r);

      }
  });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(number1.getText().toString());
                int y = Integer.parseInt(number2.getText().toString());
                int r = x-y;
                total.setText(String.valueOf(r));
                System.out.println("///"+r);

            }
        });
        multiplied.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(number1.getText().toString());
                int y = Integer.parseInt(number2.getText().toString());
                int r = x*y;
                total.setText(String.valueOf(r));
                System.out.println("///"+r);

            }
        });
        divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(number1.getText().toString());
                int y = Integer.parseInt(number2.getText().toString());
                int r = x/y;
                total.setText(String.valueOf(r));
                System.out.println("///"+r);

            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = findViewById(R.id.editTextTextPersonName);
                number1.getText().clear();
                EditText number2 = findViewById(R.id.editTextTextPersonName1);
                number2.getText().clear();
                TextView total = findViewById(R.id.textView0);
               total.setText("");
            }

        });

    }
}
