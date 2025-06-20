import petshop.animal.*;
import petshop.servico.*;
import java.util.Scanner;

public class GerenciadorPetshop {

    public static boolean textoValido(String texto) {
        return texto.matches("[a-zA-ZÀ-ÿ\\s]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo;
        do {
            System.out.print("Tipo de animal (cachorro/gato/outro): ");
            tipo = sc.nextLine().trim().toLowerCase();
            if (!tipo.equals("cachorro") && !tipo.equals("gato") && !tipo.equals("outro")) {
                System.out.println("Por favor, informe um tipo válido: cachorro, gato ou outro.");
            }
        } while (!tipo.equals("cachorro") && !tipo.equals("gato") && !tipo.equals("outro"));

        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();

        String raca;
        do {
            System.out.print("Raça/Tipo (somente letras): ");
            raca = sc.nextLine().trim();
            if (!textoValido(raca)) {
                System.out.println("Por favor, informe somente letras para raça/tipo.");
            }
        } while (!textoValido(raca));

        int idade = -1;
        do {
            System.out.print("Idade (número inteiro): ");
            try {
                idade = Integer.parseInt(sc.nextLine().trim());
                if (idade < 0) {
                    System.out.println("Idade não pode ser negativa.");
                    idade = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, informe um número inteiro válido para idade.");
            }
        } while (idade < 0);

        String dono;
        do {
            System.out.print("Proprietário (somente letras): ");
            dono = sc.nextLine().trim();
            if (!textoValido(dono)) {
                System.out.println("Por favor, informe somente letras para o nome do proprietário.");
            }
        } while (!textoValido(dono));

        Animal animal = null;

        switch (tipo) {
            case "cachorro":
                String porte;
                do {
                    System.out.print("Porte (pequeno/medio/grande): ");
                    porte = sc.nextLine().trim().toLowerCase();
                    if (!porte.equals("pequeno") && !porte.equals("medio") && !porte.equals("grande")) {
                        System.out.println("Informe um porte válido: pequeno, medio ou grande.");
                    }
                } while (!porte.equals("pequeno") && !porte.equals("medio") && !porte.equals("grande"));
                animal = new Cachorro(nome, raca, idade, dono, porte);
                break;
            case "gato":
                String olhos;
                do {
                    System.out.print("Cor dos olhos (somente letras): ");
                    olhos = sc.nextLine().trim();
                    if (!textoValido(olhos)) {
                        System.out.println("Por favor, informe somente letras para a cor dos olhos.");
                    }
                } while (!textoValido(olhos));
                animal = new Gato(nome, raca, idade, dono, olhos);
                break;
            case "outro":
                String pelo;
                do {
                    System.out.print("Densidade do pelo (fina/media/grossa): ");
                    pelo = sc.nextLine().trim().toLowerCase();
                    if (!pelo.equals("fina") && !pelo.equals("media") && !pelo.equals("grossa")) {
                        System.out.println("Informe uma densidade válida: fina, media ou grossa.");
                    }
                } while (!pelo.equals("fina") && !pelo.equals("media") && !pelo.equals("grossa"));
                animal = new OutroAnimal(nome, raca, idade, dono, pelo);
                break;
        }

        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Servico consulta = new ConsultaVeterinaria();

        System.out.println("\n=== Animal Cadastrado ===");
        System.out.println(animal);

        System.out.println("\n=== Serviços Disponíveis ===");
        System.out.printf("Banho: R$%.2f%n", banho.calcularPreco(animal));
        System.out.printf("Tosa: R$%.2f%n", tosa.calcularPreco(animal));
        System.out.printf("Consulta Veterinária: R$%.2f%n", consulta.calcularPreco(animal));

        sc.close();
    }
}
