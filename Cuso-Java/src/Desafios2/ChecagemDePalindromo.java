package Desafios2;

import java.util.*;
import java.lang.*;

public class ChecagemDePalindromo {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digiste uma palavra: ");
        String palavra = sc.nextLine();

        //utilizado o metodo StringBuilder para dar o inverso da String
        String inverso = String.valueOf(new StringBuilder(palavra).reverse().toString());
        //imprimido o inverso
        System.out.println(inverso);
        //criado laço para saber se é igaul ao seu inversoe assim imprimindo verdadeiro ou false
        if(palavra.equals(inverso)){
            System.out.println("TRUE");
        }else System.out.println("FALSE");


        }
    }




    //System.out.println("FALSE");


    //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.