package introducaoclasse;

public class pessoa {

    private double peso;
    private double altura;
    private int idade;
    public String nome;
    
    // o set não volta valor
    public void setPeso(double peso){
        this.peso = peso;
    }

    //o get tem que retornar um valor
    public double getPeso(){
        return this.peso;
    }

        public void setAltura(double altura){
            this.altura = altura;
        }

        public double getAltura(){
            return this.altura;
        }

            public void setIdade(int idade){
                this.idade = idade;
            }

            public int getIdade(){
                return this.idade;
            }

                public void setNome(String nome){
                    this.peso = peso;
                }

                public String getNome(){
                    return this.nome;
                }
    //fim
}