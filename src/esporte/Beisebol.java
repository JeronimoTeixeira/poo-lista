package esporte;

import objetos.Bola;

public class Beisebol extends Bola {
    public Beisebol(String marca) {
        super(marca);
    }

    @Override
    public void arremessar() {
        System.out.println("Arremessando a bola de beisebol");
    }

    @Override
    public void quicar() {
        System.out.println("Quicando a bola de beisebol");
    }
}
