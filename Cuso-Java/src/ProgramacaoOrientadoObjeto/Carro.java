package ProgramacaoOrientadoObjeto;



public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    
//Formas de como fazer um construtor o modelo vazio e o otro ccom atributos
//obs: Construtor e feita da clss e seus parametros e this é para diferencia o que pertece o objeto.
    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }
    
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;

    }
    
}