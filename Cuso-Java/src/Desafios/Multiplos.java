package Desafios;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        A = input.nextInt();
        System.out.println("Digite outro numero: ");
        N = input.nextInt();
        
        int soma = 0;
        
        for(int i = A; i <= N; i++){
          if(i % A == 0){
          soma += i;
          }
          
        }
        
      System.out.println("O Resultado dos multiplos dos dois valores é : " + soma);
        

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}