package superkate;

public class Controle {
    private Kate kate;
    private BadFish bF;
    
    public void batalhaBF(Kate kate, BadFish badfish){
        System.out.println("\nBadFish aparece! Kate se prepara para lutar!");
        System.out.println("Qual golpe usar?");
        
        do{
            int botao = kate.menuKate();
            
            if(kate.getEnergia() != 0){
                switch(botao){
                    case 0:
                        badfish.setVida(badfish.getVida() - 20);
                        if(badfish.getVida() > 0){
                            badfish.statusBF();
                            
                        }else{
                            badfish.setVida(0);
                            badfish.statusBF();
                        }
                        break;
            
                    case 1:
                        badfish.setVida(badfish.getVida() - 40);
                        if(badfish.getVida() > 0){
                            badfish.statusBF();
                            
                        }else{
                            badfish.setVida(0);
                            badfish.statusBF();
                        }
                        break;
                        
                    case 2:
                        if(kate.getNivel() >= 2){
                            if(kate.getEnergia() > 180){
                                kate.setEnergia(200);
                            }
                            kate.statusKate();
                            
                        }else{
                            System.out.println("Comando não realizado...");
                        }
                        
                    case 3:
                        if(kate.getNivel() >= 4){
                            if(kate.getVida() > 190){
                                kate.setVida(100);
                            }
                            badfish.statusBF();
                            kate.statusKate();
                            
                        }else{
                            System.out.println("Comando não realizado...");
                        }
                        
                    default:
                        System.out.println("Comando não realizado...");
                }
            }else{
                System.out.println("Kate está sem energia...");
            }
            if(badfish.getVida() > 0){
                ataqueBF(kate, badfish);
            }
            
        }while(badfish.getVida() > 0 && kate.getVida() > 0);
        
        if(badfish.getVida() <= 0){
            System.out.println("Kate Venceu!!!");
            kate.nivelKate();
            
            kate.setVida(100);
            kate.setEnergia(200);
            System.out.println("\n");
            
            
        }else if(kate.getVida() <= 0){
            System.out.println("BadFish Venceu. GAME OVER\n");
            System.exit(1);
            
        }else if(kate.getVida() == 0 && badfish.getVida() == 0){
            System.out.println("Empate...\n");
        }
    }
    
    public void ataqueBF(Kate kate, BadFish badfish){
        int valor = badfish.menuBF();
        
        if(badfish.getEnergia() > 0){
            switch(valor){
                case 1:
                    kate.setVida(kate.getVida() - 10);
                    kate.statusKate();
                    break;
                
                case 2:
                    kate.setVida(kate.getVida() - 25);
                    kate.statusKate();
                    break;
            }
        }else{
            System.out.println("BadFish está sem energia...");
        }
        
    }
}
