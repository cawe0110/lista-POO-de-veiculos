package br.com.senai.model;

public abstract class Veiculo
{
    private String nome;
    private String marca;
    private int rodas;

    public Veiculo(String nome) { this.nome = nome;}
    public Veiculo(String nome, String marca, int rodas )
    {
        this.nome = nome;
        this.marca = marca;
        this.rodas = rodas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", rodas=" + rodas;
    }
}
