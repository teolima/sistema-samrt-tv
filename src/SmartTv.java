public class SmartTv {
    boolean ligado=false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void diminuirVolume (){
        volume--;
        System.out.println("diminuindo o  volume para " + volume);
    }

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
   


}