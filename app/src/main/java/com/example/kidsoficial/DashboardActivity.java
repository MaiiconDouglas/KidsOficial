package com.example.kidsoficial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dashboard );
    }

    public void btn_abrir_cliente(View view) {
        Intent in = new Intent(DashboardActivity.this, ClientesActivity.class);
        startActivityForResult(in, 1);
    }

    public void btn_Cadastrar_Produtos(View view) {
        Intent in = new Intent(DashboardActivity.this, ProdutosActivity.class);
        startActivityForResult(in, 1);
    }

    public void btn_Lista_Clientes(View view) {
        Intent in = new Intent(DashboardActivity.this, Lista_ClienteActivity.class);
        startActivityForResult(in, 1);
    }
    public void btn_Avaliacao(View view) {
        Intent in = new Intent(DashboardActivity.this, AvaliacaoActivity.class);
        startActivityForResult(in, 1);
    }

}
