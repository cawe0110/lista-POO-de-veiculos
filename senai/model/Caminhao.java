package br.com.senai.model;

public class Caminhao extends Veiculo
{
    public int eixos;

    public Caminhao(String nome)
    {
        super(nome);
    }

    public int getEixos(){return eixos;}
    public void setEixos(int eixos)
    {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString() + ", numero eixos " + eixos ;
    }
}
