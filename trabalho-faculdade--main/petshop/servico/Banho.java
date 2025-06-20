package petshop.servico;

import petshop.animal.Animal;
import petshop.animal.Cachorro;
import petshop.animal.Gato;
import petshop.animal.OutroAnimal;

public class Banho extends Servico {

    public Banho() {
        super("Banho", 35.0);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            String porte = cachorro.getPorte().toLowerCase();
            if (porte.equals("grande")) {
                return 50.0;
            } else {
                return precoBase;
            }
        } else if (animal instanceof Gato) {
            return precoBase;
        } else if (animal instanceof OutroAnimal) {
            return precoBase;
        } else {
            return precoBase;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}