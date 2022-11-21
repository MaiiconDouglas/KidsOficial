package com.example.kidsoficial;

public class Cliente {

    int id;
    String descricao, codigo, preco_venda, estoque, origem, ncm, cest;

    public Cliente() {
        id = 0;
        descricao = "";
        codigo = "";
        preco_venda = "";
        estoque = "";
        origem = "";
        ncm = "";
        cest = "";
    }

    public Cliente(int id) {
        this.id = id;
        descricao = "";
        codigo = "";
        preco_venda = "";
        estoque = "";
        origem = "";
        ncm = "";
        cest = "";
    }

    public Cliente(String descricao, String codigo, String preco_venda, String estoque, String origem, String ncm, String cest ) {
        id = 0;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco_venda = preco_venda;
        this.estoque = estoque;
        this.origem = origem;
        this.ncm = ncm;
        this.cest = cest;
    }

    public Cliente(int id, String descricao, String codigo, String preco_venda, String estoque, String origem, String ncm, String cest ) {
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco_venda = preco_venda;
        this.estoque = estoque;
        this.origem = origem;
        this.ncm = ncm;
        this.cest = cest;
    }

    public Cliente(Cliente u) {
        id = u.id;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco_venda = preco_venda;
        this.estoque = estoque;
        this.origem = origem;
        this.ncm = ncm;
        this.cest = cest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {return codigo; }

    public String getPreco_venda() {return preco_venda; }

    public String getEstoque() {return estoque; }

    public String getOrigem() {return origem; }

    public String getNcm() {return ncm; }

    public String getCest() {return cest; }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", codigo='" + codigo + '\'' +
                ", preco_venda='" + preco_venda + '\'' +
                ", estoque='" + estoque + '\'' +
                ", origem='" + origem + '\'' +
                ", cest='" + cest + '\'' +
                '}';
    }
}
