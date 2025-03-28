public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
             p1.idade = 19;
             p1.nome = "José";
             p1.apresentar();

        ContaBancaria cb = new ContaBancaria();
            cb.setSaldo(0);
        System.out.println(cb.getSaldo());

        Calculadora cal = new Calculadora();
        cal.somar(2, 18);
        int res = cal.multiplicar(3, 9);
    }
}
