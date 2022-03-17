package br.com.senai.model;

public class Motoca extends Veiculo
{
    private String som;

    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }

    public Motoca(String nome) {super(nome);}

    @Override
    public String toString() {
        return super.toString()  + ", motorbike goes " + som;
    }
}
