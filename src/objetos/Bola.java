package objetos;

import interfaces.Arremessavel;

public abstract class Bola implements Arremessavel {
    public String marca;
    public abstract void quicar();
    public Bola(String marca) {
        this.marca = marca;
    }
}
