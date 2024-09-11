package src;

import java.util.Scanner;

public class Revisao {

    public static void main(String[] args) {

        // laço de repetição
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para começar:");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) { // verifica se é par
                System.out.println("Numero par: " + i);

                if (i > 5) {
                    break; // igual o return
                }
            } else {
                System.out.println("é impar: " + i);
            }
        }

    }

}
