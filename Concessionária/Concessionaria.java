/* UPE - Licenciatura em Ciências da Computação 2025

   Programação 02 - Webquest 02 
   
     Ana Patrícia Monteiro Guimarães
     Francisco Tiago Bezerra Da Silva
     Hercílio Barbosa Teixeira
     Wellbya Bruna De Melo Souza*/


import java.util.ArrayList; // Importa utilitário para manipulação de listas de array
import java.util.Scanner;   // Importa utilitário para inserção de dados pelo teclado

// Cria uma classe com acesso tipo public, denominada Concessionaria
public class Concessionaria {
   /* Atributos comuns (Classe Veiculo): String placa, String marca, String modelo, int ano, double valor
         Dentre os comuns, o método para calcular IPVA está subscrito individualmente em cada classe
      Atributos individuais: Classe Carro - int numeroPortas , Classe Moto - int cilindradas, Classe Caminhao - double capacidadeCarga (em toneladas) */
   public static void main(String[] args){
   // Declaração da lista em Array cria uma Arraylist denominada veiculo que armazena objetos da classe Veiculo
      ArrayList <Veiculo> veiculo = new ArrayList<>(); 
    
   // Cria 03 objetos do tipo Carro e os instancia declarando seus atributos
   Carro carro1 = new Carro(); 
   carro1.setPlaca("KLB1245");
   carro1.setMarca("Chevrolet");
   carro1.setModelo("Corsa Hatch 1.4");
   carro1.setAno(2012);
   carro1.setValor(26300.00);
   carro1.setNumeroPortas(4);
   
   Carro carro2 = new Carro(); 
   carro2.setPlaca("KMY2713");
   carro2.setMarca("BYD");
   carro2.setModelo("Dolphin Mini 75CV");
   carro2.setAno(2025);
   carro2.setValor(119990.00);
   carro2.setNumeroPortas(4);
   
   Carro carro3 = new Carro();
   carro3.setPlaca("OPL2627");
   carro3.setMarca("Volkswagen");
   carro3.setModelo("Golf GTI 2.0");
   carro3.setAno(2015);
   carro3.setValor(135990.00);
   carro3.setNumeroPortas(4);
   
   // Cria 02 objetos do tipo Caminhao e os instancia declarando seus atributos
   Caminhao caminhao1 = new Caminhao(); 
   caminhao1.setPlaca("GMC1L45");
   caminhao1.setMarca("Volvo");
   caminhao1.setModelo("FMX 4X4R");
   caminhao1.setAno(2024);
   caminhao1.setValor(1075470.00);
   caminhao1.setCapacidadeCarga(22.000);

   Caminhao caminhao2 = new Caminhao();
   caminhao2.setPlaca("RLK2J37");
   caminhao2.setMarca("Volkswagen");
   caminhao2.setModelo("VW Delivery 13.180 6x2");
   caminhao2.setAno(2022);
   caminhao2.setValor(260000.00);
   caminhao2.setCapacidadeCarga(4.800);

   // Cria 02 objetos do tipo Moto e os instancia declarando seus atributos
   Moto moto1 = new Moto(); 
   moto1.setPlaca("KMT2Y64");
   moto1.setMarca("Yamaha");
   moto1.setModelo("Fazer FZ15 ABS Connected");
   moto1.setAno(2025);
   moto1.setValor(22026.00);
   moto1.setCilindradas(149);

   Moto moto2 = new Moto();
   moto2.setPlaca("GTS5I39");
   moto2.setMarca("Honda");
   moto2.setModelo("GL 1800 Gold Wing");
   moto2.setAno(2025);
   moto2.setValor(304450.00);
   moto2.setCilindradas(1833);

   // Método que salva os objetos criados para a ArrayList veiculo
   veiculo.add (carro1);
   veiculo.add (carro2);
   veiculo.add (carro3);
   veiculo.add (caminhao1);
   veiculo.add (caminhao2);
   veiculo.add (moto1);
   veiculo.add (moto2);

   /* COMANDOS PARA PRINTAR OBJETOS DA ARRAYLIST

   #Primeira tentativa
   A primeira escolha de opção de impressão tava muito longa com repetições, porque 
   havia encontrado dificuldades com o for, usando lenght em vez de size.

   System.out.println(carro1.toString());
   System.out.println(carro2.toString());
   System.out.println(carro3.toString());
   System.out.println(caminhao1.toString());
   System.out.println(caminhao2.toString());
   System.out.println(moto1.toString());
   System.out.println(moto2.toString()); */
   
   /* #Segunda tentativa
   Depois implementamos esse comando de impressão: 
   System.out.println(veiculo);
   Porém ele exibe como resultado, uma lista iniciando e finalizando com colchetes [].*/
   
   /* Terceira tentativa
   Ainda foi implementado este comando:

   for(int i=0; i < veiculo.size(); i++) {
      System.out.println(veiculo.get(i) + " \n") 
   }

   Havia adicionado \n porque não havia o percebido que um espaço entre aspas já era suficiente 
   para cada item ficar em linhas próprias sem continuar da mesma onde o objeto anterior termina.
   Após correção, chegamos no:
   
   //for(int i=0; i < veiculo.size(); i++) {
      //System.out.println(veiculo.get(i) + " "); 
   } */
      
   /* No fim das contas, optou-se por uma opção para selecionar e printar 
   apenas um objeto ou o catálogo inteiro usando IF e FOR: */
   System.out.printf("Por favor digite 0 para exibir o catálogo inteiro \n" + "de veículos disponíveis, ou tecle: \n\n" + "1 - para exibir informações sobre o Corsa \n" + "2 - sobre o Dolphin \n" + "3 - sobre o Golf \n" + "4 - do o caminhão Volvo FMX \n" + "5 - Do caminhão Volkswagen VW \n" + "6 - moto Yamaha Fazer FZ15 \n" + "7 - Moto Honda GL1800 \n");
   Scanner entradaDados = new Scanner(System.in);
   int dadoInserido = entradaDados.nextInt();
   
   if (dadoInserido == 0) {
      for (int i=0; i < veiculo.size(); i++) {
         System.out.println(veiculo.get(i) + " ");
         System.out.println("Fim do programa! \n");
      }
   }else if (dadoInserido <= 7) {
      System.out.println(veiculo.get(dadoInserido - 1));
      System.out.println("Fim do programa! \n");
   }else if (dadoInserido > 7){ // Quando removo o if dessa linha, o comando apresenta erro
      System.out.printf("Número inesperado. Por favor, tente novamente! \n" + "Fim do programa! \n");
   }
   entradaDados.close();
   }
}
   

