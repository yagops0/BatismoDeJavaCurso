package NivelIIntermediario;

public class Main {
    public static void main(String[] args) {
        // criar o ninja naruto

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;

        // criar nija Sasuke Uchiha = é um objeto;

        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da  Folha";
        Sasuke.idade = 27;

        // aplicando métodos ao meu objeto
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);

        System.out.println("Voce tem: " + Sasuke.idade + " anos, entao falta no minimo " + quantoTempoFalta + " anos para voce se tornar hokage.");

        // Criar Sakura Haruno
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da Folha";
        sakura.idade = 17;

    }
}
