package AulaMap;

import java.util.*;

public class ExemploOrdenacaoMap {


    public static void main(String[] args){

        //ordem aleatoria sempre vai ser HashMap
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));


        }};
        for(Map.Entry<String, Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //Ordem de Inseção sempre sera LinkedHashMap
        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro :meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //Ordem feita pelas chaves sempre sera pelo TreeMap
        System.out.println("--\tOrdem Alfabética Autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //Ordem feita pelo valor que seria os nomes dos livros usamos o TreeSet
        System.out.println("--\tOrdem Alfabética Nomes dos Livros\t--");
        //foi criado a class ComparatorNome para fazer a comparação dos nomes
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        //metodo para receber todos os valores de outro set
        meusLivros3.addAll(meusLivros.entrySet());
        //como ja esta dentro de um Set nao precisa usar o meto entrySet() junto com meusLivros3 no laço for
        for(Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    }
}
