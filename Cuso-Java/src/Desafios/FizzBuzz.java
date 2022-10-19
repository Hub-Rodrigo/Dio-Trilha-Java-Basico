package Desafios;

import java.util.Scanner;

public class FizzBuzz {
    
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = number.nextInt();
        
          
        
          if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
          }

          else if(num % 3 == 0){
            System.out.println("Fizz");
           
          }
          else if(num % 5 == 0){
            System.out.println("Buzz");
          }
          else{
            
          System.out.println(num);
          }

        
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    
    }
    
    
        
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

}

    

