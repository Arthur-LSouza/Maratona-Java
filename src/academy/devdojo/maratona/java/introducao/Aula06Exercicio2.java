package academy.devdojo.maratona.java.introducao;

public class Aula06Exercicio2 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax ; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
