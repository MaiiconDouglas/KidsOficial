package com.example.kidsoficial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClientesActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_clientes);

        mViewHolder.cd_cadastro_descricao = findViewById(R.id.cd_cadastro_descricao);

        mViewHolder.cd_cod_sku = findViewById(R.id.cd_cod_sku);

        mViewHolder.cd_preco_venda = findViewById(R.id.cd_preco_venda);

        mViewHolder.cd_cadastro_estoque = findViewById(R.id.cd_cadastro_estoque);

        mViewHolder.cd_cod_origem = findViewById(R.id.cd_cod_origem);

        mViewHolder.cd_cod_cep = findViewById(R.id.cd_cod_cep);

        mViewHolder.cd_cod_cidade = findViewById(R.id.cd_cod_cidade);

         // Puxando dados banco Clientes!

         db = new DBHelper(this);
         
        mViewHolder.bt_registo_registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cd_cadastro_descricao = mViewHolder.cd_cadastro_descricao.getText().toString().trim();

                String cd_cod_sku = mViewHolder.cd_cod_sku.getText().toString().trim();

                String cd_preco_venda = mViewHolder.cd_preco_venda.getText().toString().trim();

                String cd_cadastro_estoque = mViewHolder.cd_cadastro_estoque.getText().toString().trim();

                String cd_cod_origem = mViewHolder.cd_cod_origem.getText().toString().trim();

                String cd_cod_cep = mViewHolder.cd_cod_cep.getText().toString().trim();

                String cd_cod_cidade = mViewHolder.cd_cod_cidade.getText().toString().trim();

                ///////////////

                if (cd_cadastro_descricao.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Insira o nome do Produto!", Toast.LENGTH_SHORT).show();

                else if (cd_cod_sku.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Insira o código SKU", Toast.LENGTH_SHORT).show();

                else if (cd_preco_venda.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Insira o Valor da Venda!", Toast.LENGTH_SHORT).show();

                else if (cd_cadastro_estoque.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Insira a quantidade de produto no estoque!", Toast.LENGTH_SHORT).show();

                else if (cd_cod_origem.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Descrever a Origem!", Toast.LENGTH_SHORT).show();

                else if (cd_cod_cep.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Insira o código da cidade!", Toast.LENGTH_SHORT).show();

                else if (cd_cod_cidade.isEmpty())
                    Toast.makeText( ClientesActivity.this, "Insira o código do cliente", Toast.LENGTH_SHORT).show();


      //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                }

        });

    }

    private class ViewHolder {
        EditText cd_cadastro_descricao, cd_cod_sku, cd_preco_venda, cd_cadastro_estoque, cd_cod_origem, cd_cod_cep, cd_cod_cidade;

        Button bt_registo_registar;

        Button bt_cadastrar_cancelar;
    }
}

