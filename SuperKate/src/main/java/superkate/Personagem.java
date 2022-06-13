package superkate;

public abstract class Personagem {
    protected int vida;
    protected int energia;
    
    protected abstract String pular();
    protected abstract String andar();
}
