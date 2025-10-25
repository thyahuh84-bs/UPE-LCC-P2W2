// Cria uma classe com acesso tipo public, denominada Caminhao, que herda atributos e métodos da classe Veiculo
public class Caminhao extends Veiculo { 
    private double capacidadeCarga; // Cria atributo privado em variável do tipo double
    
    // Implementa getter como forma de garantir acesso ao atributo capacidadeCarga
    double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    // Implementa setter como meio de inserir valores ao atributo capacidadeCarga
    void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    // Método para calcular o IPVA da classe Caminhão, subscrevendo o método herdado da classe Veiculo   
    public double calcularIpva(){
        double ipvaTax;
        if(capacidadeCarga > 5) {
            ipvaTax = 0.03;
        }else{
            ipvaTax = 0.02;
        }
        double impostoIpva = getValor() * ipvaTax;
        return impostoIpva;
    }
    // Método para converter objetos do tipo Caminhao, salvos na ArrayList veiculo, em uma String "printável"
    public String toString() {
        // Métodos para estabelecer quantidade de duas ou três casas decimais, para as variáveis do tipo double
        String valorCaminhao = String.format("%.2f", getValor());                  
        String ipvaCaminhao = String.format("%.2f", calcularIpva());             
        String capacidadeCaminhao = String.format("%.3f", getCapacidadeCarga());   
        return ("Caminhão " + getModelo() + "\n") + ("O " + getMarca() + " " + getModelo() + " com placa " + getPlaca() + " possui capacidade de transportar até " + capacidadeCaminhao + " toneladas.\n") + ("Fabricado no ano de " + getAno() + ", este modelo está custando R$" + valorCaminhao + " Reais e o valor do IPVA anual está em R$ " + ipvaCaminhao + " Reais.\n");
    }
}