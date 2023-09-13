package com.example.trabalhociclodevidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Elementos da tela de login
        EditText usuario = (EditText) findViewById(R.id.ETusuario);
        EditText senha = (EditText) findViewById(R.id.ETsenha);
        button = (Button) findViewById(R.id.BTentrar);


        //Verificação de usuário e senha
        //Abertura de classes e erros no login via Toast

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(usuario.getText().toString().equals("admin") && senha.getText().toString().equals("admin")){
                    closeMainActivity();
                    openActivity2();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Usuário e/ou senha incorretos", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }

    // Classes

    public void closeMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}