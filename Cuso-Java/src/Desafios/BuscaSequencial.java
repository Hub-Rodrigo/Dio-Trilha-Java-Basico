package Desafios;

    // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
    // instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
    // Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 
    
    import java.util.*;
    
    public class BuscaSequencial {
    
        public static void main(String[] args) {
    
            Scanner leitor = new Scanner(System.in);
    
            int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
            //valor que irar ser buscado no sistema
            System.out.println("Digite o valor a ser buscado: ");
            int busca = leitor.nextInt();
                      
            int i;
            //metodo a procurar  a variavel na array
            for(i = 0; i < elementos.length; i++){
              if(elementos[i] == busca){
                System.out.println("Achei " + busca + " na posicao " + i);
                break;
              }
              
            } 
              if (i == elementos.length){
                  System.out.println("Numero " + busca + " nao encontrado!");
              }
            
            
            
    
            //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
    
        }
    }
    

