package src;

import java.util.Stack;

public class Pilhas {

    public static void main(String[] args) {

        Stack<String> comandos = new Stack<>();
        comandos.push("comando 1");
        comandos.push("comando 2");
        comandos.push("comando 3");
        comandos.push("comando 4");
        comandos.push("comando 5");

        int tamanho = comandos.size();
        for (int i = 0; i < tamanho; i++) {
            String popped = comandos.pop();
            System.out.println("Comando desempilhado: " + popped);
        }

        System.out.println("Comandos restantes: " + comandos.size());
    }

}
