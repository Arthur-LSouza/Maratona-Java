package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturaDeRepetição02 {
    public static void main(String[] args) {
        //Dado o valor do carro descubra em quantas vezes ele pode ser parcelado.
        //Valor da parcela >= 1000.
        int valorDoCarro = 30000;
        for (int parcela = 1; parcela <= 30000 ; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if(valorParcela >= 1000){
                System.out.println(parcela+" parcelas de R$ "+valorParcela);
             }else{
                break;
            }
            System.out.println("fora do if mas dentro do for");
        }

    }
}
