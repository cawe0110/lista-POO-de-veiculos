package br.com.senai;

import br.com.senai.model.Caminhao;
import br.com.senai.model.Carro;
import br.com.senai.model.Motoca;
import br.com.senai.model.Veiculo;

public class Main
{
    public static void main(String [] args)
    {
        Carro carro = new Carro("Carro");
        carro.setMarca("Honda");
        carro.setRodas(4);
        carro.setPortas(5);
        System.out.println(carro);

        Caminhao c = new Caminhao("Caminhão");
        c.setMarca("Honda");
        c.setRodas(6);
        c.setEixos(3);
        System.out.println(c);

        Motoca m = new Motoca("Moto");
        m.setMarca("Harley");
        m.setRodas(2);
        m.setSom("Brrrrrrrrrr");
        System.out.println(m);
    }
}
