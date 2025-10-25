// Cria uma classe com acesso tipo public, denominada Moto, que herda atributos e métodos da classe Veiculo
public class Moto extends Veiculo {
    private int cilindradas; // Cria atributo privado em variável do tipo int
    
    // Implementa getter como forma de garantir acesso ao atributo cilindradas
    int getCilindradas() {
        return cilindradas;
    }
    // Implementa setter como meio de inserir valores ao atributo cilindradas
    void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    // Método para calcular o IPVA da classe Moto, subscrevendo o método herdado da classe Veiculo
    public double calcularIpva(){
        double impostoIpva = getValor() * 0.025;
        return impostoIpva;
    }
    // Método para converter objetos do tipo Moto, salvos na ArrayList veiculo, em uma String "printável"
    public String toString() {
        // Métodos para estabelecer quantidade de duas casas decimais nas variáveis do tipo double
        String valorMoto = String.format("%.2f", getValor());
        String ipvaMoto = String.format("%.2f", calcularIpva());
        return ("Moto " + getMarca() + " " + getModelo() + "\n") + ("A " + getMarca() + " " + getModelo() + " com placa " + getPlaca() + ", tem motor com incríveis " + getCilindradas() + " cilindradas.\n") + ("Este modelo fabricado em " + getAno() + " está disponível a partir de R$" + valorMoto + " Reais.\n") + ("O valor do IPVA anual está em em torno de R$" + ipvaMoto + " Reais.\n");
    }
}