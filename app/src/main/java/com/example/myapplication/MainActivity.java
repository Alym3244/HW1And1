package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtValue;
    EditText etValue;
    Button btnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue = findViewById(R.id.txt_value);
        etValue = findViewById(R.id.et_value);
        btnChange = findViewById(R.id.btn_change);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = etValue.getText().toString().trim();
                if (value.isEmpty()){
                   // etValue.setError("немедленно ведите ваш текст!");
                    return;
                }
                else { txtValue.setText(value);}

            }
        });
    }




}


