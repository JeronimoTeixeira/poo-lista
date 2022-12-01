package esporte;

import objetos.Bola;

public class Futebol extends Bola {
    public Futebol(String marca) {
        super(marca);
    }

    @Override
    public void arremessar() {
        System.out.println("Arremessando a bola de futebol");
    }

    @Override
    public void quicar() {
        System.out.println("Quicando a bola de futebol");
    }
}
