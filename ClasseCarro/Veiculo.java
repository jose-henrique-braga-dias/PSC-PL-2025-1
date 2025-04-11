

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado; // Boolean por natureza ja é true
    private double combustivel;

    public void ligarMotor() {
        if (!motorLigado) { // ! é negação
            motorLigado = true;
            System.out.println("O motor está ligado");
        }else {
            System.out.println("O motor ja está Ligado");
        }
    }

    public void desligarMotor() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("O motor está desligado");
        } else {
            System.out.println("O motor já está desligado");
        }
    }

    public void acelerar() {
        velocidadeAtual = velocidadeAtual + 1;
        System.out.println("Está acelerando");
    }

    public void frear() {
        velocidadeAtual = velocidadeAtual - 1;
        System.out.println("Está freando");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Ano: " + ano + "\n" + "Velocidade Atual: " + velocidadeAtual + "\n" + "Motor Ligado: " + motorLigado + "\n" + "Combustivel: " + combustivel);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
}