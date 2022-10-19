package AulaMetodos.Sobrecarga;

public class Quadrilatero {

    // são exemplos de como fazer uma sobrecagar de uma classe
    public static void area (double lado){

        System.out.println("Área de um quadrado: " + lado * lado);


    
    }
    //esse seria o tipo de sobrecaga que se repitiria e daria erro neste exemplo.
    public static void area (double lado1, double lado2){

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio : " + ((baseMaior + baseMenor)*altura)/2);
    }

    /*Lembra que por ser uma sobrecarga não podemos colocar o mesmo tipo 
    por isso nao pode colocar um double e sim um float para continuar*/
    public static void area (float diagonal1, float diagonal2){
        System.out.println("Área do losango: " + (diagonal1 + diagonal2)/2);
    }
}
