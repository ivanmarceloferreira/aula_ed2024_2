package src;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // declara uma variável do tipo Scanner chamada scanner
        // instancia o objeto pegando a entrada padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        // declara uma variável nome do tipo String
        // o método scanner.next() vai esperar a próxima String digitada pelo usuário
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
    }

}
