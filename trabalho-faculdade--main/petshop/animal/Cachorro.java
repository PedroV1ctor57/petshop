package petshop.animal;

import java.util.Objects;

public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String nome, String racaTipo, int idade, String proprietario, String porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Porte: " + porte;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Cachorro)) return false;
        Cachorro cachorro = (Cachorro) o;
        return Objects.equals(porte, cachorro.porte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), porte);
    }
}