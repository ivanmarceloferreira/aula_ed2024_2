package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Revisao {

    public static void main(String[] args) {

        // laço de repetição
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um valor para começar:");
//        int numero = scanner.nextInt();
//
//        for (int i = 0; i <= numero; i++) {
//            if (i % 2 == 0) { // verifica se é par
//                System.out.println("Numero par: " + i);
//
//                if (i > 5) {
//                    break; // igual o return
//                }
//            } else {
//                System.out.println("é impar: " + i);
//            }
//        }

        // i++ é igual a i = i + 1;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Imprimindo..." + i);
//
//            // condição de parada
//            if (i == 7) {
//                break;
//            }
//
//        }

//        // fila = FIFO
        Queue<String> fila = new LinkedList<>();
        // adiciona um elemento na fila
        fila.offer("Primeiro cliente");
        fila.offer("Segundo cliente");
        fila.offer("Terceiro cliente");
        // remove um elemento da fila
        fila.poll();

        for (String cliente : fila) {
            System.out.println(cliente);
        }

        // pilha = LIFO
//        Stack<String> pilha = new Stack<>();
//        // adiciona um elemento na pilha
//        pilha.push("Primeiro livro");
//        pilha.push("Segundo livro");
//        pilha.push("Terceiro livro");
//        // remove um elemento da pilha
//        pilha.pop();
//
//        for (String cliente : pilha) {
//            System.out.println(cliente);
//        }


    }

}
