public class Carro extends Veiculo {
    private double limiteLitros;

    public Carro(String marca, String modelo, int ano, double combustivel, double limiteLitros) {
        super(marca, modelo, ano, combustivel);
        this.limiteLitros = limiteLitros;
    }

    public void limiteLitros(double combustivel) {
        if ((this.limiteLitros - super.statusCombustivel()) >= combustivel) {
            super.abastecer(combustivel);
        }
    }
}

