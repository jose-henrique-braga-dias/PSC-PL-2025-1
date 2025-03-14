package entrada;

import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.err.println("Olá " + nome + ", Você tem " + idade + " anos, seja bem vindo");

    }
}
