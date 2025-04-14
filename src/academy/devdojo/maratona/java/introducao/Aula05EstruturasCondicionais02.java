package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade < 18){
            System.out.println("Categoria Juvenil");
        } else if(idade < 30){
            System.out.println("Categoria Adulto");
        } else{
            System.out.println("Categoria Master");
        }
    }
}
