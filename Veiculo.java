// Cria uma classe com acesso tipo public, denominada Veiculo
public class Veiculo {

    // Declara atributos para objetos criados dessa classe, porém, com acesso do tipo private
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    // Implementa métodos getters e setters para garantir acesso aos atributos
    String getPlaca() {
        return placa;
    }
    void setPlaca(String placa) {
        this.placa = placa;
    }
    String getMarca() {
        return marca;
    }
    void setMarca(String marca) {
        this.marca = marca;
    }
    String getModelo() {
        return modelo;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    int getAno() {
        return ano;
    }
    void setAno(int ano) {
        this.ano = ano;
    }
    double getValor() {
        return valor;
    }
    void setValor(double valor) {
        this.valor = valor;
    }
    // Método para calcular o IPVA da classe Veiculo
    public double calcularIpva(){
        double impostoIpva = valor * 0.04;
        return impostoIpva;
    } 
}