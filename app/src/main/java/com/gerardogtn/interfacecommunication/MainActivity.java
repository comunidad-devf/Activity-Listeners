package com.gerardogtn.interfacecommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mTexto;
    private Button mHola;
    private Button mAdios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTexto = (EditText) findViewById(R.id.et_name);
        mHola = (Button) findViewById(R.id.btn_say_hi);
        mAdios = (Button) findViewById(R.id.btn_say_goodbye);
        mHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = mTexto.getText().toString();
                if (!TextUtils.isEmpty(texto)){
                    Toast.makeText(MainActivity.this, "Hola " + texto + "!! :D", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Presentate primero!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mAdios.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String texto = mTexto.getText().toString();
        if (!TextUtils.isEmpty(texto)){
            Toast.makeText(MainActivity.this, "Adios " + texto + "!! :D", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Presentate primero!", Toast.LENGTH_SHORT).show();
        }
    }
}
