package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        //while, do while, for
        int cont = 10;
        while(cont >= 0){
            System.out.println(cont);
            cont -= 1;
        }
        cont = 0;
        do{
            System.out.println("Dentro do while "+ ++cont);
        }while(cont < 10);

        for(int i = 1; i <= 10; i ++){
            System.out.println("for "+i);

        }
    }
}
