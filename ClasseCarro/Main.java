public class Main {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("Boeing", "777X", 2017, 150000.0, 0, true);
        aviao1.decolar();
        aviao1.subir();
        aviao1.descer();
        aviao1.aterrissar();
    }
}