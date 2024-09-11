package src.classes;

import java.util.Objects;

public class Animal {

    private String nome;

    private String cor;

    private Long tamanho;

    private String familia;

    public Animal() {
    }

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Animal(String nome, String cor, Long tamanho, String familia) {
        this.nome = nome;
        this.cor = cor;
        if (tamanho < 0) {
            this.tamanho = 0L;
        } else {
            this.tamanho = tamanho;
        }
        this.familia = familia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            this.nome = "Nome indefinido";
        } else {
            this.nome = nome;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        if (tamanho < 0) {
            this.tamanho = 0L;
        } else {
            this.tamanho = tamanho;
        }
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void fazerBarulho() {
        System.out.println("barulho do animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                ", familia='" + familia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
