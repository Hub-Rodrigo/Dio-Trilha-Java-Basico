package ProgramacaoOrientadoObjeto;

public class RodarAplicacao {
    
    public static void main(String[] args){

        //exemplos para chamar construtor  objeto vazio
        Carro carro1 = new Carro();
        carro1.setModelo("BMW");
        carro1.setCor("Azul");        
        carro1.setCapacidadeTanque(60);
        
        System.out.println("Modelo do carro é: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());        
        System.out.println("Capacidade do Tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor gasto para encher o tanque = R$ " +  carro1.totalValorTanque(6.50) + "\n");

        //exemplo para chamar construtor com os parametros do objeto
        Carro carro2 = new Carro("Cinza", "Palio", 50);
        
        System.out.println("\n" +"Modelo do carro: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());        
        System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor gasto para encher o tanque = R$ " + carro2.totalValorTanque(6.50));
    }
    
}