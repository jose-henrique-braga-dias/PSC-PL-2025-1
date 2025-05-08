package Exercicio1;

public class Aviao {
    private int tempoDeAtividade;

    public Aviao() {
        this.tempoDeAtividade = 0;
    }

    public void fazVoo(int horas, Piloto piloto) {
        this.tempoDeAtividade += horas;
        piloto.adicionarHoras(horas);
    }

    public void fazRevisao() {
        this.tempoDeAtividade = 0;
    }

    public void imprime() {
        System.out.println("Tempo de Atividade do avião: " + tempoDeAtividade + " horas");
        if (tempoDeAtividade < 200) {
            System.out.println("Não é necessário fazer revisão!");
        } else {
            System.out.println("É necessário fazer revisão!");
        }
    }
}
