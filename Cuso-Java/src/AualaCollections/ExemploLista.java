package AualaCollections;

import java.util.*;
class ExemploLista {
    public static void main(String[] args){

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();

        //o add existem varias formar mas a usada foi forma double.
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.5);
        notas.add(5.0);
        notas.add(3.5);
        notas.add(0.0);
        notas.add(5.5);

        System.out.println(notas.toString());
        //metodo index0f é para mostra a posição da variavel.
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicioner na lista a nota 8.0 na posição 4: ");
        //famos usaro mesmo metodo de adicionar o "add" so que com a função de colocar posição.
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substitua  a nota 5.0 pela nota  6.0: ");
        //metodo usado para substituir o elemento e usa-se o index0f para localizar o elemento a ser substituido.
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        //metodo usado para verificar se o elemento foi realmente substituido
        System.out.println("Confira se a nota 5.0 esá na lista: " + notas.contains(5d));

        /*System.out.println("Exiba todas as notas na ordem em foram informadas: ");
        //metodo para imprir uma em baixo da outra
        for (Double nota : notas) System.out.println(nota);*/

        //metodo para localizar os elementos da lista
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //metodo para achar o menor e maior elemento da lista
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // metodo  usado para fazer a soma on o iterator vai verificando se tem mas algum elemento e vai fazendo a soma
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //modo usado para calcular a media usando a soma e o comando size que verifica quanto elementos tem na lista
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        //metodo usado para retirar um elementos baseado no seu valor
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //metodo usado para retirar a posição variavel
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        //metodo para filtra as notas maiores
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(next -> next < 7);
        System.out.println(notas);

        /*metodo para apagar
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */

        //metodo para confima se confima se a lista esta vazia
       // System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/




    }


}
