package src;

import src.classes.Pessoa;

import java.util.Date;

public class Construtores {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ivan Ferreira");
        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa("Alana");
        pessoa2.setDataNascimento(new Date());
        System.out.println(pessoa2);

        Pessoa pessoa3 = new Pessoa("Eduardo", new Date());
        pessoa3.setNome("João Paulo");
        System.out.println(pessoa3);
    }

}
