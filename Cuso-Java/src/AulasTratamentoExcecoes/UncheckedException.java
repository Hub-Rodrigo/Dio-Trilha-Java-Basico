package AulasTratamentoExcecoes;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args){
        /* comando que cria uma caixa de dialogo para fazer os input pelo comando JOptionPane.showInputDialog e como retorna
        uma String esta dentro de uma String*/
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        //feito laço para continuar até que os valores sejam corretos
        boolean continueLooping = true;
        do{
            //feito o try on colocamos a logica para da seguimento ao programa e apresenta as exeções
            try{
            /*obs: caso nao seja digitado um numero e sim um nome o sistema mostra exeção e sempre verificar o erro de baixo
            para cima */
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
               //casso o laço seja falso o looping vai para pois todos os valores fforam corretos
                continueLooping = false;
            } catch (NumberFormatException e) {
                //metodo usado para mostra para o usuario uma nova mesagem e solicitar novo numero
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro: " + e.getMessage());
            }catch (ArithmeticException e){
                //criaado a exeção ArithmeticException caso tente dividir por 0 e mandaremos imprimir nova mensagem para usuario
                JOptionPane.showMessageDialog(null, "Impossivil dividir um número por 0: " + e.getMessage());
            }

        }while (continueLooping);


        //feito esse impressão so para verificar que deu tudo certo nas exeções e que o código ira continuar normalmente
        System.out.println("O código continua...");

    }

    public static int dividir(int a, int b){ return a/b; }
}
