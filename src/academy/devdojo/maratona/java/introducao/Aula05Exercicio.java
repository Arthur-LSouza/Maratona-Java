package academy.devdojo.maratona.java.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        double salario = 34713;
        String imposto;
        if (salario <= 34712) {
            imposto = "9,70";
        } else if (salario <= 68507) {
            imposto = "37,35";
        } else {
            imposto = "49,50";
        }
        System.out.println("Você irá pagar " + imposto + " de imposto.");
    }
}