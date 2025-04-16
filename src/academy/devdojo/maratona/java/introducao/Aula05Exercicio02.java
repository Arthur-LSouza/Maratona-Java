package academy.devdojo.maratona.java.introducao;

public class Aula05Exercicio02 {
    public static void main(String[] args) {
        //dado os numero de 1 á 7, imprima se o dia é fim de semana ou dia util
        //considere domingo como 1, segunda como 2,...,sabado 7
        byte diaUtil = 4;
        switch (diaUtil){
            case 1:
                System.out.println("Hoje é Domingo, Fim se semana ebaa!");
                break;
            case 2:
                System.out.println("Hoje é Segunda, trabaiar :(");
                break;
            case 3:
                System.out.println("Hoje é Terça, trabaiar :(");
                break;
            case 4:
                System.out.println("Hoje é Quarta, trabaiar :(");
                break;
            case 5:
                System.out.println("Hoje é Quinta, trabaiar :(");
                break;
            case 6:
                System.out.println("Hoje é Sexta, trabair :(");
                break;
            case 7:
                System.out.println("Hoje é sábado, Fim de semana ebaa!");
                break;
            default:
                System.out.println("Isso não é um dia valido");
        }
    }
}
