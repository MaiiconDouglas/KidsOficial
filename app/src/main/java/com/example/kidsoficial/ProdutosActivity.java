package com.example.kidsoficial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProdutosActivity extends AppCompatActivity {

    private ProdutosActivity.ViewHolder mViewHolder = new ProdutosActivity.ViewHolder();

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

        db = new DBHelper(this);  // Puxando dados banco produtos! porém ainda não registrando no mesmo.

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

                if (cd_cadastro_descricao.isEmpty())
                    Toast.makeText( ProdutosActivity.this, "Insira o nome do Produto!", Toast.LENGTH_SHORT).show();
                else if (cd_cod_sku.isEmpty() || cd_preco_venda.isEmpty())
                    Toast.makeText( ProdutosActivity.this, "Insira e repita o password", Toast.LENGTH_SHORT).show();

                /// pensar na logica novamente.

                else if (!password1.equals(password2))
                    Toast.makeText( ProdutosActivity.this, "Passwords não coincidem!", Toast.LENGTH_SHORT).show();
                else {
                    long res = db.Utilizador_Insert(username, password1);
                    if (res > 0) {
                        Toast.makeText( ProdutosActivity.this, "Usuário registado com sucesso!!", Toast.LENGTH_SHORT).show();
                        Intent i = getIntent();
                        i.putExtra("username", username);
                        setResult(1, i);
                        finish();
                    } else {
                        Toast.makeText( ProdutosActivity.this, "Erro ao registar o Usuário!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    private class ViewHolder {
        EditText cd_cadastro_descricao, cd_cod_sku, cd_preco_venda, cd_cadastro_estoque, cd_cod_origem, cd_cod_cep, cd_cod_cidade;
        Button bt_registo_registar;
        Button bt_cadastrar_cancelar;
    }
}

