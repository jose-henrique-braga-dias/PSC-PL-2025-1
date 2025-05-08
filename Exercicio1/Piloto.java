package Exercicio1;

public class Piloto {
    private String nome;
    private int horasDeVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.horasDeVoo = 0;
    }

    public void adicionarHoras(int horas) {
        this.horasDeVoo += horas;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Horas de Voo: " + horasDeVoo);
        if (horasDeVoo < 200) {
            System.out.println("Co-piloto!");
        } else {
            System.out.println("Comandante!");
        }
    }
}
