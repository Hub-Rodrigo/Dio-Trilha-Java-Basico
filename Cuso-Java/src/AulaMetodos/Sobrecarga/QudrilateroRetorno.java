package AulaMetodos.Sobrecarga;

public class QudrilateroRetorno {

    //agora sera feito o exercio sobre retorno usando como base o quadrilatero do exercio de sobrecarga
    public static double area (double lado){    
        
        return lado * lado; 
            
    }
   
    public static double area (double lado1, double lado2){

        return lado1 * lado2;
        
    }

    public static double area(double baseMaior, double baseMenor, double altura){


        return ((baseMaior + baseMenor)*altura)/2;
        
    }

    
  
}