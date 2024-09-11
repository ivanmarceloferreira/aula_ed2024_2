package src;

import src.classes.Pessoa;
import src.classes.PessoaFisica;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Ivan", 8);
        notas.put("Alana", 10);
        notas.put("João Peabiru", 5);
        notas.put("Thiago M", 5);
        notas.put("Thiago M", 2);
        // chave igual

        for (String nome : notas.keySet()) {
            System.out.print("Nota do aluno " + nome);
            System.out.println(": " + notas.get(nome));
        }
        System.out.println("-----------------------------");

        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Vitor Giese");
        pessoa1.setCpf("0000000000");

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Maycon Corinthians");
        pessoa2.setCpf("1111111111");

        Map<String, Pessoa> pessoas = new HashMap<>();
        pessoas.put("estagiario", pessoa1);
        pessoas.put("aluno", pessoa2);

        for (String tipo : pessoas.keySet()) {
            System.out.println("Pessoa tipo " + tipo + " se chama "
                    + pessoas.get(tipo).getNome());
        }




    }

}
