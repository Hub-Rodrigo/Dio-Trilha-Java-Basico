package AulaMetodos.AulaCriação;

//retorno para metodo main e os parametros a serem cumpridos no exemplo sera mensagem baseado na hora.
public class Mensagem {


    public static void obtermensagem(int hora){

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora invalida.");
                break;
        }
    }
    public static void mensagemBomDia(){
        System.out.println("Bom dia!");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde!");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite!");
    }
}


