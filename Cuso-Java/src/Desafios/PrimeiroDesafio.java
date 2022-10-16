package Desafios;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;
public class PrimeiroDesafio {
  
    public static void main(String[] args) {
        
        int A;
        int B;
        Scanner leitor = new Scanner(System.in);              
        System.out.println("Digite o primeiro Valor: ");
            A = leitor.nextInt();
        System.out.println("Digite o segundo Valor: ");
        
            B = leitor.nextInt();
        
        if(A==B){
            System.out.print("Sao iguais");
        }else {
            System.out.print("Nao sao iguais");
        }
     

        //TODO: Imprima se os valores numéricos passados são iguais ou não.

    }
}