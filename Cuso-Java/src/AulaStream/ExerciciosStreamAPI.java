package AulaStream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

      /* //"Primeiro metodo com Lambda deixado comentado para fazer os proximos metodos
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

    }*/
/* metodo para pegar os 5 primeiros numeros com Set e como é  um set nao aceitar numeros repetidos por isso so imprimir 4
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

       /* System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");

        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        /*System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                    .map(Integer::parseInt)
                    .filter(i -> (i % 2 == 0 && i > 2))
                    .collect(Collectors.toList());
            System.out.println(listaParesMaioresQue2);*/

        /*System.out.println("Mostra a média dos números: ");
            numerosAleatorios.stream()
                    .mapToInt(Integer::parseInt)
                    .average()
                    .ifPresent(System.out::println);*/

        System.out.println("Remova os valores impares: ");

        List<Integer> numerosAleatorisInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatorisInteger.removeIf(i -> (i % 2 != 0 ));
        System.out.println(numerosAleatorisInteger);


    }
}
