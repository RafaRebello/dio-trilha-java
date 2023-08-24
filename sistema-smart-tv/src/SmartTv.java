public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void baixarVolume(){
        volume--;
        System.out.println("Baixando o volume para: " + volume);
    }

    public void subirCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Aumentando o canal para: " + canal);
    }
}