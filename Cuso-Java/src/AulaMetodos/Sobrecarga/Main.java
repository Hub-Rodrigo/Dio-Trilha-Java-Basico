package AulaMetodos.Sobrecarga;

public class Main {

    public static void main (String[] args){

        //como fazer o chamada da classe de sobrecarga
        System.out.println("Execicio de Sobrecarga:");        
        Quadrilatero.area(5);
        Quadrilatero.area(8, 4, 6);
        
        //Está seria a chamada que daria erro caso estevise repedito a sobrecarga
        Quadrilatero.area(6d, 6d);
        //Esté foi tipo de sobrecarga que foi mudado na classe para da continuidade no programa.
        Quadrilatero.area(6f, 6f);



        //Retorno da classe para o Main
        System.out.println("Execicio de Retorno: ");
        
        double areaQuadrado = QudrilateroRetorno.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QudrilateroRetorno.area( 4, 6);
        System.out.println("Área do Retangulo é: " + areaRetangulo);

        double areaTrapezio = QudrilateroRetorno.area(8, 4,6);
        System.out.println("Área do trapazio : " + areaTrapezio);

    }
    
}
