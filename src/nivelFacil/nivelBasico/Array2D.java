package nivelFacil.nivelBasico;

public class Array2D {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        /*
             0          1       2
        * 0 [Konoha][Naruto][Sasuke]
        * 1 [Nevoa][Zabuza][Haku]
        * 2 [Areia][Gaara][Temari]
        * */

        ninjasEAldeias[1][0] = "Névoa";
        ninjasEAldeias[1][1] = "Zabuza Momochi";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Areia";
        ninjasEAldeias[2][1] = "Gaara do Deserto";
        ninjasEAldeias[2][2] = "Temari";

        // System.out.println(ninjasEAldeias[0][0]);

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]);
            for (int j = 1; j < ninjasEAldeias[i].length; j++){
                System.out.println(" Ninja: " + ninjasEAldeias[i][j]);
            }
        }
    }
}
