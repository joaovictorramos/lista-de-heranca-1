package heranca;

public class Aviao extends Veiculo{
    private String regAero;

    //private static int cond = 0;
    private boolean keyOnOff = false;
    private boolean keyPousar = false;
    private boolean keyDecolar = false;
    
    public Aviao(String regAero) {
        this.regAero = regAero;
        
        System.out.println(statusAviao());
    }
    
    public String statusAviao(){
        return "Registro Aeronáutico: " + getRegAero() +
               "\n";
    }
    
    public String decolar(){
        String frase = "";
        
        if(keyOnOff){
            if(keyPousar){
                //cond = 1;
                keyDecolar = true;
                keyPousar = false;
                frase = "Avião decolando...";
                
            }else if(!keyPousar){
                frase = "Avião não pousou...";
            }
        }else if(!keyOnOff){
            frase = "O avião não está ligado";
            
        }else{
            frase = "O avião não está ligado";
        }
        
        return frase;
    }
    
    public String pousar(){
        String frase = "";
        
        if(keyOnOff){
            if(keyDecolar){
                //cond = 0;
                keyPousar = true;
                keyDecolar = false;
                frase = "Avião pousando...";
                
            }else if(!keyDecolar){
                frase = "Avião não decolou...";
            }
        }else if(!keyOnOff){
            frase = "O avião não está ligado...";
            
        }else{
            frase = "O avião não está ligado...";
        }
        
        return frase;
    }
    
    @Override
    public boolean ligar() {
        if(keyOnOff){
            System.out.println("O avião já está ligado...");
            
        }else{
            keyOnOff = true;
            keyPousar = true;
            System.out.println("Avião ligado...");
        }
        
        return keyOnOff;
    }

    @Override
    public boolean desligar() {
        if(!keyDecolar){
            keyOnOff = false;
            System.out.println("Avião desligado...");
            
        }else{
            System.out.println("O avião está decolando...");
        }
        
        return keyOnOff;
    }

    @Override
    public String moverFrente() {
        String frase = "";
        
        if(keyOnOff){
            frase = "O avião está movendo para frente...";
            
        }else if(!keyOnOff){
            frase = "O avião está desligador...";
            
        }else{
            frase = "O avião está desligado";
        }
        
        return frase;
    }

    @Override
    public String re() {
        String frase = "";
        
        if(keyOnOff && !keyDecolar){
            frase = "O avião está dando ré";
            
        }else if(!keyOnOff || keyDecolar){
            frase = "Esta função é impossível";
        }
        
        return frase;
    }

    @Override
    public String parar() {
        String frase = "";
        
        if(keyOnOff && !keyDecolar){
            frase = "O avião está parando";
            
        }else if(!keyOnOff || keyDecolar){
            frase = "Esta função é impossível";
        }
        
        return frase;
    }
    
    public String getRegAero() {
        return regAero;
    }

    public void setRegAero(String regAero) {
        this.regAero = regAero;
    }
}
