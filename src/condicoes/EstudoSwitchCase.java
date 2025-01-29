package condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        /*
        * SwitchCases: servem para gerar casos especificos
        *
        * objetiov: pedir para o usuario escolher entre os ninjas.
        * */


        // mostrar opções para o usuáro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");


        // pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // reacao ao escolher um personagem

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sauke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno, a personagem feminina mais legal.");
                break;
            default:
                System.out.println("Opcao invalida.");
        }

        scanner.close(); // fechar a caixa
    }
}
