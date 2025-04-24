public class Aviao extends Veiculo {
    private double altitude;
    private boolean tremDePousoBaixado;

    public Aviao(String marca, String modelo, int ano, double combustivel) {
        super(marca, modelo, ano, combustivel);
    }

    public void decolar() {
        if (this.altitude == 0) {
            this.altitude = 10000;
            this.tremDePousoBaixado = false;
            System.out.println("Subindo o trem de pouso");
            System.out.println("Decolando... Altitude atual: " + this.altitude + " metros.");
        } else {
            System.out.println("O avião já está em voo.");
        }
    }

    public void subir() {
        if (this.altitude > 0) {
            altitude += 1000;
            System.out.println("Subindo... Altitude atual: " + this.altitude + " metros.");
        } else {
            System.out.println("O avião não está em voo.");
        }
    }

    public void descer() {
        if (this.altitude > 1000) {
            this.altitude -= 1000;
            System.out.println("Descendo... Altitude atual: " + altitude + " metros.");
            if (this.altitude < 0) {
                this.altitude = 0;
                System.out.println("O avião está no solo.");
            }
        } else {
            System.out.println("O avião não pode descer mais.");
        }
    }

    public void aterrissar(){
        if(this.altitude > 0 ){
            for(;this.altitude > 0; this.altitude -= 1000){
                System.out.println("Aterrissando... Altitude atual: " + this.altitude + " metros.");
                if(this.altitude <= 1000 ){
                    this.tremDePousoBaixado = true; 
                    System.out.println("Trem de pouso baixado.");
                }
            }
        } else {
            System.out.println("Avião já está no solo.");
        }
    }
}