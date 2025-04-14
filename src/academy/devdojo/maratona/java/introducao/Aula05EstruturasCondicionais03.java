package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Ainda não tenho condições:(";

        //Operador ternario(condição ? verdadeiro : falso)
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
