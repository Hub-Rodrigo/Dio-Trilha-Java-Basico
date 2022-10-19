package AulaMetodos.Aula01;
public class SmartTv {

        //atrbuindo valor as varias para mudar canal,volume e deligar e ligar tv.
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        //comando para mudar para novo canal.
        public void mudarCanal(int novoCanal){
            canal = novoCanal;
        }
        //comando para acrencentar mas um canal
        public void aumentarCanal(){
            canal++;
        } 
        //comando para diminuir mas um canal
        public void diminuirCanal(){
            canal--;
        }
        //comando para acrencentar mas um volume e imprimir na tela
        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando o volume para :  " + volume);
        }
        //comando para diminuir mas um volume e imprimir na tela
        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo o volume para :  " + volume);
        }
        //comando para mudar status tv.
        public void ligar(){
            ligada = true;
        }
        //comando para mudar status tv.
        public void desligar(){
            ligada = false;
        }
    }
    
        
   