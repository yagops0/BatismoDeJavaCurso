package nivelFacil.condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: vão repetir infinitamente ou até voce atingit o parâmetro desejado
        *
        * While - For
        *
        * */

        // While
        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while(numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        }*/

        // For
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto estás e clonando e já se clonou " + i);
        }
    }
}
