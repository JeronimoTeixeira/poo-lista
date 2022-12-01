import esporte.Beisebol;
import esporte.Futebol;
import interfaces.Arremessavel;
import objetos.Bola;
import objetos.Pedra;

public class Main {
    public static void main(String[] args) {

//        RESPOSTAS



//        Arremessavel NÃO PODE SER INSTANCIADO
//
//        BEISEBOL

//        Beisebol beisebol = new Beisebol("teste");
//        Arremessavel arremessavel = beisebol;
//        Bola bola = beisebol; ERRO
//        Pedra pedra = beisebol; ERRO
//        Futebol futebol = beisebol; ERRO


//        FUTEBOL

//        Futebol futebol = new Futebol("teste");
//        Arremessavel arremessavel1 = futebol;
//        Bola bola1 = futebol; ERRO
//        Pedra pedra1 = futebol; ERRO
//        Beisebol beisebol1 = futebol; ERRO



//          1 -    C - E
//        Bola bola = new Futebol(); FUNCIONA POIS FUTEBOL EXTEND BOLA

//          2 - C
//        Bola bola = new Futebol();
//        Beisebol beisebol = (Beisebol)bola; SÓ É COMPILAVEL MAS NÃO PODE SER EXECUTADO POIS O OBJETO AINDA PERTECEN A CLASSE FUTEBOL E ELA NÃO PODE SER CONVERTIDA

//            3 - C - E
//        Object obj = new Beisebol("TESTE"); FUNCIONA POIS OBJECT É UM TIPO GENÉRICO

//            4 - NENHUM
//        Object obj = new Beisebol("TESTE");
//        Arremessavel arremessavel = obj; NECESSÁRIO PASSAR (Arremessável) obj para funcionar

//          5 - C - E
//        Arremessavel arremessavel = new Beisebol("TESTE");
//        Object obj = arremessavel; FUNCIONA POIS BEISEBOL É "FILHO" DE ARREMESSAVEL E OBJECT É UM TIPO GENÉRICO

    }
}