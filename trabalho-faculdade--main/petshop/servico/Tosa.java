package petshop.servico;

import petshop.animal.Animal;
import petshop.animal.Cachorro;
import petshop.animal.Gato;
import petshop.animal.OutroAnimal;

public class Tosa extends Servico {

    public Tosa() {
        super("Tosa", 50.0);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            String porte = cachorro.getPorte().toLowerCase();
            switch (porte) {
                case "grande":
                    return 90.0;
                case "medio":
                case "pequeno":
                    return 50.0;
                default:
                    return precoBase;
            }
        } else if (animal instanceof Gato) {
            return 50.0;
        } else if (animal instanceof OutroAnimal) {
            OutroAnimal outro = (OutroAnimal) animal;
            String densidade = outro.getDensidadePelo().toLowerCase();
            if (densidade.equals("media") || densidade.equals("grossa")) {
                return 80.0;
            } else {
                return 50.0;
            }
        } else {
            return precoBase;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}