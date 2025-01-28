package condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
        * IF e ELSE - Condições
        * else if
        * Objetivo: Passar o ninja de nivel de acordo com número de missões
        * */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;


        /*
        * if(condicao) {resultado}
        * else if (condicao) {resultado}
        * else {resultado} caso nada seja verdadeiro
        * */

        // se (condicao) {faça isso}

        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else{
            System.out.println("Rank: Gennim");
        }


    }
}
