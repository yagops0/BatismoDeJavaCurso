package TiposDeDados;

public class DadosNãoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, array, class, enum
        * Obejtivo: criar um ninja, e atribuir métodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOCK
        System.out.println( "Este texto está em CAPSLOCK: " + nomeUpperCase);
        System.out.println( "Este texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caix baixa/minúsculo
        System.out.println(aldeiaEmCaixaBaixa);



    }
}
