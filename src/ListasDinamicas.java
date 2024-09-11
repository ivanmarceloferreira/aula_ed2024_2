package src;

import java.util.*;

public class ListasDinamicas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>(); // instância de objeto

        int contador = 1;
        System.out.println("Digite o " + contador + "º nome: ");
        String nome = scanner.nextLine();
        while (!nome.equals("break")) {
            nomes.add(nome); // adiciona um item
            contador++;
            System.out.println("Digite o " + contador + "º nome: ");
            nome = scanner.nextLine();
        }

        // isso aqui -- enhanced for
//        for (String aluno : nomes) {
//            System.out.println("Nome do aluno: " + aluno);
//        }
        // é igual a isso aqui
        for (int i = 0; i < nomes.size(); i++) {
            String aluno = nomes.get(i); // pega o objeto pelo indice
            System.out.println("Nome do aluno: " + aluno);
        }

        // colocar um item em uma posicao especifica
        String nome2 = "Nome2";
        nomes.set(1, nome2);

        System.out.println("--------------------------------");
        // imprime de novo a lista
        for (int i = 0; i < nomes.size(); i++) {
            String aluno = nomes.get(i); // pega o objeto pelo indice
            System.out.println("Nome do aluno: " + aluno);
        }

        String busca = "nome44444";
        int indice = nomes.indexOf(busca); // retorna o indice
        if (indice > 0) { // verifica se encontrou o item
            String removido = nomes.remove(indice);
        }

        System.out.println("--------------------------------");
        // imprime de novo a lista
        for (int i = 0; i < nomes.size(); i++) {
            String aluno = nomes.get(i); // pega o objeto pelo indice
            System.out.println("Nome do aluno: " + aluno);
        }

        // nomes = null; // não recomendado
        nomes.clear();

        System.out.println("--------------------------------");
        // imprime de novo a lista
        for (int i = 0; i < nomes.size(); i++) {
            String aluno = nomes.get(i); // pega o objeto pelo indice
            System.out.println("Nome do aluno: " + aluno);
        }

        System.out.println("--------------------------------");

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(1);
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(3);
        inteiros.add(3);

        System.out.println("Imprima somente os diferentes: (1,2,3)");

        // for each
//        List<Integer> diferentes = new ArrayList<>();
//        for (Integer inteiro : inteiros) {
//            if (!diferentes.contains(inteiro)) {
//                diferentes.add(inteiro);
//            }
//        }

        Set<Integer> diferentes = new HashSet<>();
        diferentes.addAll(inteiros);
        System.out.println("Imprimindo os diferentes: " + diferentes);

    }

}
