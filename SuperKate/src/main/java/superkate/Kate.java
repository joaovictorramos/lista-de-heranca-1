package superkate;

import java.util.Scanner;

public class Kate extends Personagem{
    private static int nivel = 1;
    
    public Kate(){
        super();
        super.vida = 100;
        super.energia = 200;
    }
    
    public void statusKate(){
        System.out.println("\n==== Status Kate ====" + "\nVida: " + getVida() + "\nEnergia: " + getEnergia() + "\n");
    }
    
    public void nivelKate(){
        nivel++;
        if(nivel == 2){
            System.out.println("Kate atingiu o nível 2!!! \nKate desbloqueou o poder 'RestorePower'!");
            
        }else if(nivel == 4){
            System.out.println("Kate atingiu o nível 4!!! \nKate desbloqueou o poder 'StealLife'!");
        }
    }
    
    public int menuKate(){
        int valorBotao = 0;
        
        if(nivel == 1){
            valorBotao = poder();
            
        }else if(nivel == 2){
            valorBotao = poder();
            
        }
        
        return valorBotao;
    }
    
    public int eyeBeam(){
        int poder = 20;
        setEnergia(getEnergia() - 20);
        
        return poder;
    }
    
    public int rearRocket(){
        int poder = 40;
        setEnergia(getEnergia() - 50);
        
        return poder;
    }
    
    public void restorePower(){
        this.setEnergia(this.getEnergia() + 20);
        
    }
    
    public int stealLife(){
        int poder = 10;
        setVida(getVida() + 10);
        setEnergia(getEnergia() - 20);
        
        return poder;
    }
    
    public int poder(){
        int botao = 0;
        Scanner scan = new Scanner(System.in);
        
        if(nivel == 1){
            do{
                System.out.println("[0] EyeBeam\n" + "[1] RearRocket\n");
                botao = scan.nextInt();
                if(botao == 0){
                    eyeBeam();
                    System.out.println("Kate usou EyeBeam...");
                
                }else if(botao == 1){
                    rearRocket();
                    System.out.println("Kate usou RearRocket...");
                    
                    
                }else{
                    System.out.println("Informe novamente o comando!!!");
                }
            }while(botao != 0 && botao != 1);
            
        }else if(nivel == 2){
            do{
                System.out.println("[0] EyeBeam\n" + "[1] RearRocket\n" + "[2] RestorePower\n");
                botao = scan.nextInt();
                if(botao == 0){
                    eyeBeam();
                    System.out.println("Kate usou EyeBeam...");
                
                }else if(botao == 1){
                    rearRocket();
                    System.out.println("Kate usou RearRocket...");
                    
                    
                }else if(botao == 2){
                    restorePower();
                    System.out.println("Kate usou RestorePower...");
                    
                }else{
                    System.out.println("Informe novamente o comando!!!");
                }
            }while(botao != 0 && botao != 1 && botao != 2);
        }
        
        return botao;
    }
    
    @Override
    protected String pular() {
        System.out.println("Kate pulou...");
        
        return "pular";
    }

    @Override
    protected String andar() {
        System.out.println("Kate andou...");
        
        return "andar";
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getEnergia(){
        return energia;
    }
    
    public void setEnergia(int energia){
        this.energia = energia;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
