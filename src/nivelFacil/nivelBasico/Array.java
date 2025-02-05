package nivelFacil.nivelBasico;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipos referência!
        // strings inicializam com null
        String[] ninja = new String[6];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[5]);

        // Redeclarar ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        // For para fazer um loop no Array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // int inicializa com 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        // booelean inicializam com false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[2]);

        // doubles inicializam com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

        // redeclarar
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);


    }
}
