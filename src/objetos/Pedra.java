package objetos;

import interfaces.Arremessavel;

public class Pedra implements Arremessavel {
    @Override
    public void arremessar() {
        System.out.println("Arremessando uma Pedra");
    }
}
