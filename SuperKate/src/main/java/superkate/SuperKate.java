package superkate;

import java.util.Scanner;

public class SuperKate {

    public static void main(String[] args) {
        Controle c = new Controle();
        BadFish b1 = new BadFish();
        BadFish b2 = new BadFish();
        BadFish b3 = new BadFish();
        Kate k = new Kate();
        
        if(pollutedBeach_1()){
            k.setVida(k.getVida() - 10);
        }
        if(pollutedBeach_2()){
            k.setVida(k.getVida() - 10);
        }
        c.batalhaBF(k, b1);
        
        if(pollutedBeach_3()){
            k.setVida(k.getVida() - 20);
        }
        if(pollutedBeach_4()){
            k.setEnergia(k.getEnergia() - 20);
        }
        c.batalhaBF(k, b2);
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
        System.out.println("1° Fase/Parte - Polluted Beach");
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
}
