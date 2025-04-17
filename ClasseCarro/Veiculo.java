public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public Veiculo(String marca, String modelo, int ano, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.motorLigado = false;
        this.combustivel = combustivel;
    }

    public void ligarMotor() {
        if (this.motorLigado) {
            System.out.println("O motor já está ligado.");
        } else {
            motorLigado = true;
            System.out.println("O motor foi ligado.");
        }
    }

    public void desligarMotor() {
        if (this.motorLigado) {
            this.motorLigado = false;
            System.out.println("O motor foi desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }
    public void acelerar() {
        if (!this.motorLigado) {
            System.out.println("O motor está desligado, não é possível acelerar.");
        } if (this.combustivel <= 0) {
            System.out.println("Não há combustível suficiente para acelerar.");
        } else {
            this.velocidadeAtual += 10;
            this.combustivel -= 0.5;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual);
        }
    }
    public void frear() {
        if (this.velocidadeAtual > 0) {
            this.velocidadeAtual -= 10;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
            System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual);
        } else {
            System.out.println("O veículo já está parado.");
        }
    }

    public void abastecer(double combustivel) {
        if (this.velocidadeAtual <= 0) {
            if (!this.motorLigado) {
                System.out.println("Abastecendo...");
                this.combustivel += combustivel;
                System.out.println("Abastecido com " + combustivel + " litros." + "\n" + "Combustível atual: " + this.combustivel);    
            } else {
                System.out.println("Desligue o motor antes de abastecer.");
            }
        }
        }

    public void exibirInfo() {
        System.out.println(
                "Marca:           " + this.marca + "\n" + 
                "Modelo:          " + this.modelo + "\n" +
                "Ano:             " + this.ano + "\n" +
                "Velocidade Atual:" + this.velocidadeAtual + "\n" +
                "Motor Ligado:    " + (this.motorLigado ? "Sim" : "Não") + "\n" +
                "Combustível:     " + this.combustivel);
    }

    public double statusCombustivel() {
        return this.combustivel;
    }
}