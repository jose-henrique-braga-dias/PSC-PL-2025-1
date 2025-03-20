package Matrizes;

import java.util.Scanner;

public class StudentScores {
    public static void main(String args[]) {
        double scores[] = new double[10];
        double sum = 0.0, avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Insira as pontuações de 10 estudantes");
        for (int i = 0; i < scores.length; i = i + 1) {
            System.out.println("Digite a " + (i+1) + "a nota");
            scores[i] = keyboard.nextInt();
        }
        System.out.println(" Exiba as pontuações de 10 estudantes");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            avg = sum / 10;
        }
        System.out.println(" A pontuação média da classe " + (sum/10) + " avg = " + avg);
    }
}
