// Cria uma classe com acesso tipo public, denominada Carro, que herda atributos e métodos da classe Veiculo
public class Carro extends Veiculo {
    private int numeroPortas; // Cria atributo privado em variável do tipo int
    
    // Implementa getter como forma de garantir acesso ao atributo numeroPortas
    int getNumeroPortas() {
        return numeroPortas;
    }
    // Implementa setter como meio de implementar valores ao atributo numeroPortas
    void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    // Método para calcular o IPVA da classe Carro, subscrevendo o método herdado da classe Veiculo
    public double calcularIpva(){
        double impostoIpva;
        impostoIpva = getValor() * 0.035;
        return impostoIpva; 
    }
    // Método para converter objetos do tipo Carro, salvos na ArrayList veiculo, em uma String "printável"
    public String toString() {
        // Métodos para estabelecer quantidade de duas decimais para as variáveis do tipo double
        String valorCarro = String.format("%.2f", getValor());
        String ipvaCarro = String.format("%.2f", calcularIpva());
        return (getModelo() + "\n") + ("O " + getMarca() + " " + getModelo() + " de " + getNumeroPortas() + " portas, com placa " + getPlaca() + ", foi fabricado no ano de " + getAno() + ".\n") + ("Atualmente, este modelo custa R$" + valorCarro + " Reais e o valor do IPVA anual está em R$" + ipvaCarro + " Reais.\n");
    }
}