package br.com.senai.model;

public class Carro extends Veiculo
{
    private int portas;

    public int getPortas(int i) {
        return portas;
    }

    public void setPortas(int portas)
    {
        this.portas = portas;
    }

    public Carro(String nome)
    {
        super(nome);
    }

    @Override
    public String toString() {
        return super.toString() + ", numero porta " + portas ;
    }
}
