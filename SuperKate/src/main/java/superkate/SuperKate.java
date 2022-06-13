package superkate;

import java.util.Scanner;

public class SuperKate {

    public static void main(String[] args) {
        Controle c = new Controle();
        BadFish b1 = new BadFish();
        BadFish b2 = new BadFish();
        BadFish b3 = new BadFish();
        Kate k = new Kate();
        
        //1° BadFish
        if(pollutedBeach_1()){ k.setVida(k.getVida() - 10); }
        if(pollutedBeach_2()){ k.setVida(k.getVida() - 10); }
        c.batalhaBF(k, b1);
        
        //2° BadFish
        if(pollutedBeach_3()){ k.setVida(k.getVida() - 20); }
        if(pollutedBeach_4()){ k.setEnergia(k.getEnergia() - 20); }
        c.batalhaBF(k, b2);

        //3° BadFish
        if(pollutedBeach_5()){ k.setVida(k.getVida() - 40); }
        if(pollutedBeach_6()){ k.setVida(k.getVida() + 10); }
        c.batalhaBF(k, b3);
    }
    
    public static boolean pollutedBeach_1(){
        Scanner scan = new Scanner(System.in);
        boolean red = false;
        
        String ordem = "";
        System.out.println("1° Fase/Parte 1 - Polluted Beach");
        System.out.println("Kate começa sua jornada!!! [andar/pular]: ");
        while(!"pular".equalsIgnoreCase(ordem) && !"andar".equalsIgnoreCase(ordem)){
            ordem = scan.nextLine();
            if("pular".equalsIgnoreCase(ordem)){
                System.out.println("Kate escorregou e perdeu 10 de vida...");
                red = true;
                
            }else if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate seguiu andando...\n");
                red = false;
            }
        }
        
        return red;
    }
    
    public static boolean pollutedBeach_2(){
        Scanner scan = new Scanner(System.in);
        boolean red = false;
        
        String ordem = "";
        System.out.println("\nHá um buraco no seu caminho! [andar/pular]: ");
        while(!"pular".equalsIgnoreCase(ordem) && !"andar".equalsIgnoreCase(ordem)){
            ordem = scan.nextLine();
            if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate caiu no buraco e perdeu 10 de vida...");
                red = true;
                
            }else if("pular".equalsIgnoreCase(ordem)){
                System.out.println("Kate pulou o buraco e seguiu em frente...");
                red = false;
            }
        }
        
        return red;
    }
    
    public static boolean pollutedBeach_3(){
        Scanner scan = new Scanner(System.in);
        boolean red = false;
        
        String ordem = "";
        System.out.println("1° Fase/Parte 2 - Polluted Beach");
        System.out.println("Kate vê espinho do chão!!! [andar/pular]: ");
        while(!"pular".equalsIgnoreCase(ordem) && !"andar".equalsIgnoreCase(ordem)){
            ordem = scan.nextLine();
            if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate se espetou nos espinhos e perdeu 20 de vida...");
                red = true;
                
            }else if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate pulou os espinhos e saiu em segurança...\n");
                red = false;
            }
        }
        
        return red;
    }
    
    public static boolean pollutedBeach_4(){
        Scanner scan = new Scanner(System.in);
        boolean red = false;
        
        String ordem = "";
        System.out.println("Kate avistou um chão coberto de corais... [andar/pular]: ");
        while(!"pular".equalsIgnoreCase(ordem) && !"andar".equalsIgnoreCase(ordem)){
            ordem = scan.nextLine();
            if("pular".equalsIgnoreCase(ordem)){
                System.out.println("Kate pulou e corais saltaram e a atingiram...");
                System.out.println("Os corais sugaram 20% de sua energia");
                red = true;
                
            }else if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate andou e percorreu os corais sem probremas...\n");
                red = false;
            }
        }
        
        return red;
    }
    
    public static boolean pollutedBeach_5(){
        Scanner scan = new Scanner(System.in);
        boolean red = false;
        
        String ordem = "";
        System.out.println("1° Fase/Parte 3 - Polluted Beach");
        System.out.println("Kate avistou um chão de gelo... [andar/pular]: ");
        while(!"pular".equalsIgnoreCase(ordem) && !"andar".equalsIgnoreCase(ordem)){
            ordem = scan.nextLine();
            if("pular".equalsIgnoreCase(ordem)){
                System.out.println("Kate pulou e o chão quebrou...");
                System.out.println("Kate perdeu 40 de vida...");
                red = true;
                
            }else if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate andou e deslizou sobre o chão sem probremas...\n");
                red = false;
            }
        }
        
        return red;
    }
    
    public static boolean pollutedBeach_6(){
        Scanner scan = new Scanner(System.in);
        boolean red = false;
        
        String ordem = "";
        System.out.println("Kate encotrou uma porta a sua frente e buraco acima... [andar/pular]: ");
        while(!"pular".equalsIgnoreCase(ordem) && !"andar".equalsIgnoreCase(ordem)){
            ordem = scan.nextLine();
            if("pular".equalsIgnoreCase(ordem)){
                System.out.println("Kate pulou no buraco e encontrei elixir...");
                System.out.println("Kate curou 10 de vida...");
                red = true;
                
            }else if("andar".equalsIgnoreCase(ordem)){
                System.out.println("Kate abriu na porta, mas não havia nada...\n");
                red = false;
            }
        }
        
        return red;
    }
}
