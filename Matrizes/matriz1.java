package Matrizes;

public class matriz1 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetor1 = {2, 8, 16, 26};
        String[] nomes = new String[4];
        String[] sobrenomes = {"Braga", "Gomes", "Santos", "Dias"};
        vetor[0] = 14;
        vetor[4] = 28;
        System.out.println("Vetor valor " + vetor[0]);
        nomes[0] = "josé";
        nomes[1] = "joão";
        nomes[2] = "juberto";
        nomes[3] = "jaqueline";
        System.out.println("Nomes valor " + nomes[3] + " " + sobrenomes[3]);
        System.out.println("Tamanho " + vetor1.length);
        System.out.println("Elemento " + vetor1[0]);
        System.out.println("Elemento " + vetor1[1]);
        System.out.println("Elemento " + vetor1[2]);
        System.out.println("Elemento " + vetor1[3]);
    }

}
