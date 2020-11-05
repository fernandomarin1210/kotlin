package com.example.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(applicationContext, "OnCreate", Toast.LENGTH_LONG).show();

        button_clientes.setOnClickListener {
            val intent = Intent(this, ClientesActivity::class.java);
            startActivity(intent);
        }

        button_empresa.setOnClickListener {
            val intent = Intent(this, EmpresaActivity::class.java);
            startActivity(intent);
        }

        button_servicos.setOnClickListener {
            val intent = Intent(this, ServicosActivity::class.java);
            startActivity(intent);
        }

        button_contato.setOnClickListener {
            //Toast.makeText(this, "Mensagem Toast", Toast.LENGTH_LONG).show();          // Tanto faz this ou applicationContext
            Toast.makeText(applicationContext, "Mensagem Toast", Toast.LENGTH_LONG).show();   // Tanto faz this ou applicationContext
            val intent = Intent(this, ContatoActivity::class.java);
            startActivity(intent);
        }

    }

    override fun onStart() {
        super.onStart();
        Toast.makeText(applicationContext, "OnStart", Toast.LENGTH_LONG).show();
    }

    override fun onResume() {
        super.onResume();
        Toast.makeText(applicationContext, "OnResume", Toast.LENGTH_LONG).show();
    }

    override fun onPause() {
        super.onPause();
        Toast.makeText(applicationContext, "OnPause", Toast.LENGTH_LONG).show();
    }

    override fun onStop() {
        super.onStop();
        Toast.makeText(applicationContext, "OnStop", Toast.LENGTH_LONG).show();
    }

    override fun onRestart() {
        super.onRestart();
        Toast.makeText(applicationContext, "OnRestart", Toast.LENGTH_LONG).show();
    }

    override fun onDestroy() {
        super.onDestroy();
        Toast.makeText(applicationContext, "OnDestroy", Toast.LENGTH_LONG).show();
    }

}