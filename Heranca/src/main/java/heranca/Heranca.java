package heranca;

public class Heranca {

    public static void main(String[] args) {
        Automovel a1 = new Automovel(11111111, "ABCD111");
        
        System.out.println(a1.re());
        a1.ligar();
        System.out.println(a1.moverFrente());
        System.out.println(a1.re());
        System.out.println(a1.marcha());
        System.out.println(a1.marcha());
        System.out.println(a1.parar());
        System.out.println(a1.marcha());
        System.out.println(a1.frear());
        System.out.println(a1.marcha());
        a1.desligar();
        System.out.println(a1.marcha());
        
        
        System.out.println("\n");
        Aviao av1 = new Aviao("+");
        
        System.out.println(av1.pousar());
        av1.ligar();
        System.out.println(av1.pousar());
        System.out.println(av1.moverFrente());
        System.out.println(av1.decolar());
        //System.out.println(av1.parar());
        System.out.println(av1.pousar());
        //av1.desligar();
        System.out.println(av1.parar());
        System.out.println(av1.re());
        av1.desligar();
        
        
        System.out.println("\n");
        Barco b1 = new Barco("+");
        
        b1.ligar();
        System.out.println(b1.navegar());
        System.out.println(b1.ancorar());
        System.out.println(b1.ancorar());
        System.out.println(b1.re());
        System.out.println(b1.parar());
        //b1.desligar();
        System.out.println(b1.moverFrente());
        b1.desligar();
    }
}
