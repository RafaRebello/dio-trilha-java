public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.baixarVolume();
        smartTv.baixarVolume();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status---> A tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status---> A tv está ligada? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(85);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}