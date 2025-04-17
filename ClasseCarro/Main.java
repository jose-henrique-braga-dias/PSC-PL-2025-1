public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 50.0, 60.0);
        carro1.ligarMotor();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.exibirInfo();
    }
}
