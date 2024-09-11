package src;

import src.classes.Animal;
import src.classes.Gato;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        Set<Animal> animaisPretos = new HashSet<>();

        Animal gato = new Gato();
        gato.setNome("Gato");
        gato.setCor("preto");
        gato.setTamanho(40L);
        gato.setFamilia("felideo");

        Animal gato2 = new Gato();
        gato2.setNome("Gato");
        gato2.setCor("preto");
        gato2.setTamanho(99L);
        gato2.setFamilia("asfdkjaskdfjsakdjfa");

        animaisPretos.add(gato);
        animaisPretos.add(gato2);

        Set<Animal> animaisBrancos = new HashSet<>();

        Animal gato3 = new Gato();
        gato3.setNome("Gato branco");
        gato3.setCor("preto");
        gato3.setTamanho(40L);
        gato3.setFamilia("felideo");

        Animal gato4 = new Gato();
        gato4.setNome("Gato");
        gato4.setCor("branco");
        gato4.setTamanho(99L);
        gato4.setFamilia("asfdkjaskdfjsakdjfa");

        animaisBrancos.add(gato3);
        animaisBrancos.add(gato4);

        System.out.println("Conjunto de animais pretos: " + animaisPretos);
        System.out.println("Conjunto de animais brancos: " + animaisBrancos);

        boolean b = animaisPretos.retainAll(animaisBrancos);

        System.out.println("Intersec: " + animaisPretos);
    }

}
