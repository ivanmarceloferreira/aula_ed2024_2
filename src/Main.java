package src;

public class Main {

    public static void main(String[] args) {

        int[][] numeros = {{1, 2, 3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        boolean variavel = true;
        if (variavel) {
            System.out.println("é true");
        }

    }
}
