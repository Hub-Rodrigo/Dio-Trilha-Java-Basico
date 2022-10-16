public class Usuario {
    public static void main (String[] args){
        SmartTv smartTv = new SmartTv();
        
        //chamada para conferir status inical do pragrama tv.
        System.out.println("Volume inicial:  " + smartTv.volume);
        System.out.println("Canal inicial:  " + smartTv.canal);
        System.out.println("TV Ligada ? " + smartTv.ligada);
            
        //comando dado para conferir novas funcionalidade para tv
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();          
        smartTv.aumentarVolume();
        smartTv.mudarCanal(20);
        System.out.println("Canal atual:  " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);
             
        //teste para ver se os comando de ligar e deligar mudirama os status.
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);
    }
    
}
