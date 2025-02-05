package nivelFacil.scanners;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        /*
         * Scanner = é um jeito de trazer o usuário para nossa aplicação
         *
         * Obejtivo: O usuario vai criar um ninja e vamos validar os dados
         * */

        // abrir o Scanner
        Scanner caixaTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaTexto.nextLine();

        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Escreva aqui a idade o sue ninja: ");
        int idadeDoNinja = caixaTexto.nextInt();

        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos.");

        // tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade e pode ir para missões de fora da aldeia");
        }else {
            System.out.println("Esse ninja é muito novo ainda,  precisa treinar mais antes de sair da vila.");
        }

        // fechar sempre o scanner
        caixaTexto.close();
    }
}
