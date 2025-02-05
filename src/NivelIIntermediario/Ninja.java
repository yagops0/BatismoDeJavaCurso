package NivelIIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    // criar um método público personalizado
    /*
    * O método void não retorna valor nenhum
    * */
    public void SharinganAtivado(){
        System.out.println("O sharingan ativou!");
    }

    /*
    * um metodo string tem que retornar valor nenhum
    * */

    public String euSouUmNinja(){
        return "Oi, Eu sou um ninja";
    }

    /*
    * metodo INT vai ter que retornar um INT
    * */

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
