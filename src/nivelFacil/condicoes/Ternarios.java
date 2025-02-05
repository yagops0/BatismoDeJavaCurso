package nivelFacil.condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: maneiras de reduzir o código
        *
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 1;

        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);


    }
}
