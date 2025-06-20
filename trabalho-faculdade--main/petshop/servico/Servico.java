package petshop.servico;

import petshop.animal.Animal;

public abstract class Servico {
    protected String nome;
    protected double precoBase;

    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco(Animal animal);

    @Override
    public String toString() {
        return nome + " - Preço base: R$" + precoBase;
    }
}