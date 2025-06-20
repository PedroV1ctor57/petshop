package petshop.animal;

import java.util.Objects;

public class Gato extends Animal {
    private String corOlhos;

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor dos olhos: " + corOlhos;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Gato)) return false;
        Gato gato = (Gato) o;
        return Objects.equals(corOlhos, gato.corOlhos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), corOlhos);
    }
}