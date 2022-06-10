package heranca;

public class Barco extends Veiculo{
    private String regEmbarc;

    private boolean keyOnOff = false;
    private boolean keyAncora = false;
    //private static int contAncora = 1;

    public Barco(String regEmbarc) {
        this.regEmbarc = regEmbarc;
        
        System.out.println(statusBarco());
    }
    
    public String statusBarco(){
        return "Registro de embarcação: " + getRegEmbarc()+
               "\n";
    }
    
   public String navegar(){
       String frase = "";
       
        if(keyOnOff && !keyAncora){
            frase = "O barco está navegando...";
            
        }else if(!keyOnOff){
            frase = "O navio está desligado...";
            
        }else if(keyAncora){
            frase = "O navio está ancorado...";
            
        }else{
            frase = "O navio está desligado...";
        }
        
        return frase;
   }
   
   public String ancorar(){
       String frase = "";
       
       if(keyOnOff){
           if(!keyAncora){
               frase = "O barco está ancorado...";
               keyAncora = true;
               parar();
               
           }else if(keyAncora){
               frase = "O barco está desancorado...";
               keyAncora = false;
           }
       }else if(!keyOnOff){
           frase = "O barco está desligado...";
           
       }else{
           frase = "O barco está desligado...";
       }
       
       return frase;
   }

    @Override
    public boolean ligar() {
        if(keyOnOff){
            System.out.println("O navio já está ligado...");
            
        }else{
            keyOnOff = true;
            System.out.println("O navio está ligado...");
        }
        
        return keyOnOff;
    }

    @Override
    public boolean desligar() {
        keyOnOff = false;
        System.out.println("O navio está desligado...");
        
        return keyOnOff;
    }

    @Override
    public String moverFrente() {
        String frase = "";
        
        if(keyOnOff && !keyAncora){
            frase = "O barco está se movendo para frente";
            
        }else if(!keyOnOff){
            frase = "O barco está desligado...";
            
        }else if(keyAncora){
            frase = "O barco está ancorado...";
            
        }else{
            frase = "O barco está desligado...";
        }
        
        return frase;
    }

    @Override
    public String re() {
        String frase = "";
        
        if(keyOnOff && !keyAncora){
            frase = "O barco está dando ré...";
                   
        }else if(!keyOnOff){
            frase = "O barco está desligado...";
            
        }else if(keyAncora){
            frase = "O barco está ancorado...";
            
        }else{
            frase = "O barco está desligado...";
        }
        
        return frase;
    }

    @Override
    public String parar() {
        String frase = "";
        
        if(keyOnOff){
            frase = "O barco está parado...";
            
        }else if(!keyOnOff){
            frase = "O barco está desligado...";
                    
        }else{
            frase = "O barco está desligado...";
        }
        
        return frase;
    }
    
    public String getRegEmbarc() {
        return regEmbarc;
    }

    public void setRegEmbarc(String regEmbarc) {
        this.regEmbarc = regEmbarc;
    }
}
