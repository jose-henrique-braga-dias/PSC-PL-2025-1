public class Aviao extends Veiculo {
    private double altitude;
    private boolean tremDePousoBaixado;

    public Aviao(String marca, String modelo, int ano, double combustivel, double altitude, boolean tremDePousoBaixado) {
        super(marca, modelo, ano, combustivel);
        this.altitude = 0;
        this.tremDePousoBaixado = true;
    }

    @Override 
    public void acelerar() {
        if (!super.statusMotor()) {
            System.out.println("O motor está desligado, não é possível acelerar.");
        } if (super.statusCombustivel() <= 0) {
            System.out.println("Não há combustível suficiente para acelerar.");
        } else {
            super.setVelocidadeAtual(super.statusVelocidade() + 240);
            super.setCombustivel(super.statusCombustivel() - 10.0);
            System.out.println("Acelerando... Velocidade atual: " + super.statusVelocidade() + " km/h");
        }
    }

    public void decolar() {
        if (this.altitude == 0 && super.statusMotor()) {

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
                if(this.altitude <= 1000 ){
                    this.tremDePousoBaixado = true; 
                    System.out.println("Trem de pouso baixado.");
                    System.out.println("Aterrissando... Altitude atual: " + this.altitude + " metros.");
                }
            }
        } else {
            System.out.println("Avião já está no solo.");
        }
    }
}