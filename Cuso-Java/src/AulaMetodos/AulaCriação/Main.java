package AulaMetodos.AulaCriação;

public class Main {
    public static void main(String[] args){

        //Metodos para chamar as operações da class calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(9, 1);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(20, 2);
        Calculadora.divisao(18, 3);
    

        //Metodos para chamar class mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(23);

        //Metodos para chamar class emprestimo.
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }

    
}
