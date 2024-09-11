package src;

import src.classes.Pessoa;
import src.classes.PessoaFisica;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {

    public static void main(String[] args) {

        Queue<String> fila1 = new LinkedList<>();
        fila1.offer("mais um");
        fila1.offer("Segundo");
        fila1.offer("Primeiro");
        fila1.offer("ultimo");
        fila1.offer("depois");

        System.out.println("tamanho da fila antes " + fila1.size());

        int tamanho = fila1.size();
        for (int i = 0; i < tamanho; i++) {
            String polled = fila1.poll();
            System.out.println("Atendendo a fila: " + polled);
        }

        System.out.println("tamanho da fila depois " + fila1.size());
        System.out.println("-----------------------------------------");

        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Vitor Giese");
        pessoa1.setCpf("0000000000");

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Maycon Corinthians");
        pessoa2.setCpf("1111111111");

        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setNome("Igão do Macbook");
        pessoa3.setCpf("3333333333");

        Queue<Pessoa> filaDoBanco = new LinkedList<>();
        filaDoBanco.offer(pessoa3);
        filaDoBanco.offer(pessoa1);
        filaDoBanco.offer(pessoa2);

        System.out.println("Iniciando os atendimentos do banco: " + filaDoBanco.size());
        int tamanhoDaFila = filaDoBanco.size();
        for (int i = 0; i < tamanhoDaFila; i++) {
            Pessoa atendido = filaDoBanco.poll();
            System.out.println("Atendendo o " + atendido.getNome());
        }
//        for (Pessoa pessoa : filaDoBanco) {
//            System.out.println("Atendendo o " + filaDoBanco.poll().getNome());
//        }

        System.out.println("Finalizando os atendimentos do banco: " + filaDoBanco.size());

    }

}
