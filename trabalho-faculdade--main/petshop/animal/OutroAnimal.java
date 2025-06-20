package petshop.animal;

import java.util.Objects;

public class OutroAnimal extends Animal {
    private String densidadePelo;

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String densidadePelo) {
        super(nome, racaTipo, idade, proprietario);
        this.densidadePelo = densidadePelo;
    }

    public String getDensidadePelo() {
        return densidadePelo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Densidade do pelo: " + densidadePelo;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof OutroAnimal)) return false;
        OutroAnimal outroAnimal = (OutroAnimal) o;
        return Objects.equals(densidadePelo, outroAnimal.densidadePelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), densidadePelo);
    }
}