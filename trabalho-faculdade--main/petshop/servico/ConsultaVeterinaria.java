package petshop.servico;

import petshop.animal.Animal;

public class ConsultaVeterinaria extends Servico {

    public ConsultaVeterinaria() {
        super("Consulta Veterinária", 90.0);
    }

    @Override
    public double calcularPreco(Animal animal) {
        return precoBase;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}