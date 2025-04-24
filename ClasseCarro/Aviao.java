public class Aviao extends Veiculo {
    private double limiteLitros;

    public Aviao(String marca, String modelo, int ano, double combustivel, double limiteLitros) {
        super(marca, modelo, ano, combustivel);
        this.limiteLitros = limiteLitros;
    }

    public void limiteLitros(double combustivel) {
        if ((this.limiteLitros - super.statusCombustivel()) >= combustivel) {
            super.abastecer(combustivel);
        }
    }

    @Override 
    public void acelerar() {
        if (!super.statusMotor()) {
            System.out.println("O motor está desligado, não é possível acelerar.");
        } if (super.statusCombustivel() <= 0) {
            System.out.println("Não há combustível suficiente para acelerar.");
        } else {
            super.setVelocidadeAtual(super.statusVelocidade() + 50);
            super.setCombustivel(super.statusCombustivel() - 10.0);
            System.out.println("Acelerando... Velocidade atual: " + super.statusVelocidade() + " km/h");
        }
    }

    @Override
    public void frear() {
        if (super.statusVelocidade() > 0) {
            super.setVelocidadeAtual(super.statusVelocidade() - 50);
            if (super.statusVelocidade() < 0) {
                super.setVelocidadeAtual(0);
            }
            System.out.println("Freando... Velocidade atual: " + super.statusVelocidade() + " km/h");
        } else {
            System.out.println("O veículo já está parado.");
        }
    }
    
    public void subindo() {
        if (super.statusMotor()) {
            if (super.statusVelocidade() >= 250) {
                System.out.println("O avião está subindo.");
            } else {
                System.out.println("O avião não pode subir, pois a velocidade atual é menor que 250 km/h.");
            }
        } else {
            System.out.println("O motor do avião não está ligado.");
        }
    }

    public void descendo() {
        if (super.statusMotor()) {
            if (super.statusVelocidade() < 250) {
                System.out.println("O avião está descendo.");
            } else {
                System.out.println("O avião não pode descer, pois a velocidade atual é maior que 250 km/h.");
            }
        } else {
            System.out.println("O motor do avião não está ligado.");
        }
    }
}