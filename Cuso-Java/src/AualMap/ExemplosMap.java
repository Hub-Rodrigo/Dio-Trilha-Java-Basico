package AualMap;

import java.util.*;

public class ExemplosMap {
    public static void main(String[] args){
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos ");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("palio", 16.0);
            put("uno", 16.0);
            put("hb20", 14.4);
            put("bmw", 15.4);
        }};
        System.out.println(carrosPopulares.toString());
        //obs:lembra que ne mapa nao tem como alterar a chama pq ela ja existe mais podemos alterar seu valor
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        //obs: comando .containskey é usado para localizar a chave
        System.out.println("Confira se o modelo bmw está no dicionário: " + carrosPopulares.containsKey("gol"));
        //obs: comando .get [e usado para localizar o valor da chave.
        System.out.println("Exiba o consumo do uno; " + carrosPopulares.get("uno"));

        /*obs: criado a variavel set para mostra dos as caves que represento o modelo pelo comando .keySet() que
        retorna um set*/
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //obs:comando .values retorna uma collection por isso criou uma variavel para usar o comando .values()
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        //metodo usado para trabalhar com chave e valor separado e assim informa o modelo mais econômico e seu cosumo.
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry: entries) {
            /*obs: Está dizendo o que est[a dentro do entry.getValue for igual ao consumoMaisEficiente o modelo tbm
             é e o comando usando para isso for se modeloMaisEfiente = entry.getKey*/
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                //colocado aqui dentro para caso tenha mas modelo com o mesmo cosumo
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }




    }
}
