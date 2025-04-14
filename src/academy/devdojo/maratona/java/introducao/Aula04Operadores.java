package academy.devdojo.maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritimetricos: +, -, *, /, %.
        int num1 = 10;
        int num2 = 20;
        int soma = num1 + num2;
        int subtracao = num2 - num1;
        int multiplicacao = num1 * num2;
        int divisao = num2 / num1;
        int resto = num2 % num1;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);
        System.out.println(resto);

        //Operadores logicos: <, >, <=, >=, ==, !=.(Sempre irão retornar valores booleanos!)

        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezIgualQueVinte = 10 == 20;
        boolean dezDiferenteQueVinte = 10 != 20;
        System.out.println("Is 10 maior que 20: "+dezMaiorQueVinte);
        System.out.println("Is 10 menor que 20: "+dezMenorQueVinte);
        System.out.println("Is 10 igual que 20: "+dezIgualQueVinte);
        System.out.println("Is 10 diferente que 20: "+dezDiferenteQueVinte);

        //Operadores logicos: &&(and), || (or), !(not).
        int age = 18;
        float salario = 2500f;
        boolean isDentroDaLei = age >= 18 && salario >= 1800f;
        System.out.println(isDentroDaLei);

        double contaCorrente = 200.0;
        double contaPoupanca = 10000.0;
        double valorPs5 = 5000;

        boolean isPlayStation5Compravel = contaCorrente >= valorPs5 || contaPoupanca >= valorPs5;
        System.out.println(isPlayStation5Compravel);

        //Operadores de Atribuição: =, +=, -=, *=, /=, %=.
        double salarioBonus = 1800;
        System.out.println(salarioBonus);
        salarioBonus += 1000;
        System.out.println(salarioBonus);



    }
}
