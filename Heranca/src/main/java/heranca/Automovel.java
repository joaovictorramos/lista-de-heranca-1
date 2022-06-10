package heranca;

public class Automovel extends Veiculo{
    private long numRenavam;
    private String placa;
    
    private static boolean keyParar = false;
    private static int numMarcha;
    private boolean keyOnOff = false;
    
    public Automovel(long numRenavam, String placa) {
        this.numRenavam = numRenavam;
        this.placa = placa;
        
        System.out.println(statusAuto());
    }
    
    public String statusAuto(){
        return "Número de Renavam: " + getNumRenavam() +
               "\nPlaca do automóvel: " + getPlaca() +
               "\n";
    }
    
    public String frear(){
        String frase = "";
        
        if(keyOnOff){
            keyParar = false;
            frase = "Automóvel freiou...";
            
        }else if(!keyOnOff){
            frase = "O automóvel está desligado...";
            
        }else{
            frase = "O automóvel está desligado...";
        }
        
        return frase;
    }
    
    public String marcha(){
        String frase = "";
        
        if(keyOnOff && !keyParar){
            numMarcha++;
            switch(numMarcha){
                case 1:
                    frase = "Marcha 1";
                    break;
                
                case 2:
                    frase = "Marcha 2";
                    break;
                    
                case 3:
                    frase = "Marcha 3";
                    break;
                    
                case 4:
                    frase = "Marcha 4";
                    break;
                 
                case 5:
                    frase = "Marcha 5";
                    break;
                    
                case 6:
                    frase = "Marcha 6";
                    break;
                    
                default:
                    numMarcha = 1;
                    frase = "Marcha 1";
            }
        }else if(!keyOnOff){
            frase = "O automóvel está desligado...";
            
        }else if(keyParar){
            frase = "O automóvel está parado...";
            
        }else{
            frase = "O automóvel está desligado...";
        }
        
        return frase;
    }

    @Override
    public boolean ligar() {
        if(keyOnOff){
            System.out.println("O automóvel já está ligado...");
            
        }else{
            keyOnOff = true;
            System.out.println("Automóvel ligado...");
        }
        
        return keyOnOff;
    }

    @Override
    public boolean desligar() {
        keyOnOff = false;
        System.out.println("Automóvel desligado...");
        
        return keyOnOff;
    }

    @Override
    public String moverFrente() {
        String frase = "";
        
        if(keyOnOff){
            keyParar = false;
            frase = "O automóvel está se movendo para frente...";
            
        }else if(!keyOnOff){
            frase = "O automóvel está desligado...";
            
        }else{
            frase = "O automóvel está desligado";
        }
        
        return frase;
    }

    @Override
    public String re() {
        String frase = "";
        
        if(keyOnOff){
            keyParar = false;
            frase = "O automóvel está dando ré...";
            
        }else if(!keyOnOff){
            frase = "O automóvel está desligado...";
            
        }else{
            frase = "O automóvel está desligado...";
        }
        
        return frase;
    }

    @Override
    public String parar() {
        String frase = "";
        
        if(keyOnOff){
            keyParar = true;
            frase = "O automóvel está parando...";
            
        }else if(!keyOnOff){
            keyParar = false;
            frase = "O automóvel está desligado...";
            
        }else{
            keyParar = false;
            frase = "O automóvel está desligado...";
        }
        
        return frase;
    }
    
    public long getNumRenavam() {
        return numRenavam;
    }

    public void setNumRenavam(long numRenavam) {
        this.numRenavam = numRenavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
