package atividade_inicial.com.atividade_inicial.models;


public class Produto {

    public Long id;
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(Long id,String nome,double preco, int quantidade){
        this.id=id;
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public Produto() {

    }
}
