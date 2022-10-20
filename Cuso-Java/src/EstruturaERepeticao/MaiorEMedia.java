package EstruturaERepeticao;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main (String[] args){
        int numero;
        
        Scanner valor = new Scanner(System.in);
                
        int maior = 0;
        int soma = 0;
        int contador = 0;

        do{
            System.out.println("Digite um numero; ");
            numero = valor.nextInt();

            soma = soma + numero;
            System.out.println("A Soma é = " + soma);

            if(numero > maior)maior = numero;
            

            contador = contador + 1;
        }while(contador < 5);

        System.out.println("O maior numero é : " + maior);
        System.out.println("A media é = " + soma/5);

    }
}        