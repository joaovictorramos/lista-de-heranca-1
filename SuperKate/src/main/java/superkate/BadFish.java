package superkate;

import java.util.Random;

public class BadFish extends Personagem{
    public BadFish(){
        super();
        super.vida = 100;
        super.energia = 150;
    }
    
    public void statusBF(){
        System.out.println("\n==== Status BadFish ====" + "\nVida: " + getVida() + "\nEnergia: " + getEnergia() + "\n");
    }
    
    public int menuBF(){
        Random random = new Random();
        int valor = random.nextInt(2) + 1;
        
        switch(valor){
            case 1:
                System.out.println("BadFish usou WaterGun...");
                waterGun();
                break;
                
            case 2:
                System.out.println("BadFish usou FinStrike...");
                finStrike();
                break;
        }
        
        return valor;
    }
    
    public int waterGun(){
        int poder = 10;
        setEnergia(getEnergia() - 20);
        
        return poder;
    }
    
    public int finStrike(){
        int poder = 25;
        setEnergia(getEnergia() - 35);
        
        return poder;
    }

    @Override
    protected String pular() {
        System.out.println("BadFish pulou...");
        
        return "pular";
    }

    @Override
    protected String andar() {
        System.out.println("BadFish andou...");
        
        return "andar";
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
