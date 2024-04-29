public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual o canal aa TV atual: " +  smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Qual o canal aa TV atual: " +  smartTv.canal);
        System.out.println("Qual o volume atual: " + smartTv.volume); 
        System.out.println("Tv ligada? " +smartTv.ligado);
        System.out.println("Qual o canal aa TV atual: " +  smartTv.canal);
        

        smartTv.ligar();
        System.out.println("novo Status -> Tv ligada? " +smartTv.ligado);
        
        smartTv.desligar();
        System.out.println("novo Status -> Tv ligada? " +smartTv.ligado);
        
    }
}
