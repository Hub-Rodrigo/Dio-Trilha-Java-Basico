public class Operadores {
    public static void main (String[] args){
        String nome1 = "Rodrigo";
        String nome2 = "Rodrigo";

        //equals compara conteudo e é o mas recomendado objetos.
        System.out.println(nome1.equals(nome2));

        //treinando as comparações para boolean sobre duas variaveis
        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1 == n2;

        if(n1 < n2){
            System.out.println("A nossa condição é Verdadeira");
        }

        System.out.println("n1 é igual a n2 ? " + simNao);
        
            simNao = n1 != n2;

        System.out.println("n1 é diferente do n2 ? " + simNao);
            
            simNao = n1 > n2;

        System.out.println("n1 é maior que n2? " + simNao);

    }
}