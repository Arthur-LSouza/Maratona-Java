package academy.devdojo.maratona.java.introducao;

public class Aula06Exercicio {
    public static void main(String[] args) {
        //imprima todos os numeros pares até 1000000.
         int par = 0;
         while(par % 2 == 0){
             System.out.println(par);
             par += 2;
             if(par == 1000000){
                 System.out.println(par);
                 break;
             }else
                 continue;

         }
    }
}
