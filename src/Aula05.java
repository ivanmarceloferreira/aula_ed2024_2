package src;

import src.classes.Animal;
import src.classes.Cachorro;
import src.classes.Gato;

public class Aula05 {

    public static void main(String[] args) {
//        Animal animal = new Animal("Gato", "preto", 40L, "felideo");
        Animal animal = new Gato();
        animal.setNome("Gato");
        animal.setCor("preto");
        animal.setTamanho(40L);
        animal.setFamilia("felideo");
        animal.fazerBarulho();

//        Gato gato = new Animal(); // isso dá erro

        Animal animal2 = new Animal("errado", "verde", -12L, "familia");

        Animal animal3 = new Cachorro();
        animal3.setNome("Cachorra");
        animal3.setCor("pretinha");
        animal3.setTamanho(-32L);
        animal3.setFamilia("Canideo");
        animal3.fazerBarulho();

        Animal animal4 = new Animal();
        animal4.setNome(null);
        animal4.setTamanho(-99999L);

        System.out.println("Animal criado: " + animal);
        System.out.println("Animal criado: " + animal2);
        System.out.println("Animal criado: " + animal3);
        System.out.println("Animal criado: " + animal4);
    }

}
