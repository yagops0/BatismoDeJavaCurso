package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados Primitivos
        * Boolean - Boolean
        * Character - char
        * Integer - byte, short, int, long
        * Float - float, double
        *
        * Objetivo da aula: Criar um ninja - Naruto -
        * */

        int idade = 17; // valor máximo int = 2 147 483 647
        double altura = 1.66;
        char inicial = 'n';
        boolean vivoOuMorto = true;
        Long saldoBancario = 3333333333214748364L; // valor maximo Long = 9.223.372.036.854.775.807

        System.out.println(idade);// comando para mostrar para o usuário
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo Bancario é: " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
        
    }
}
