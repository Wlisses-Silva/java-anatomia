public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? :" + smartTv.canal);
        System.out.println("Volme agora ? :" + smartTv.volume);

        smartTv.mudarCanal(5);
        System.out.println("Canal atual agora ? :" + smartTv.canal);
        

        smartTv.aumentarVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);
    }
}
