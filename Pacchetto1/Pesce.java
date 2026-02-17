package Pacchetto1;

public class Pesce implements Preda, Predatore {

    @Override
    public void scappa() {
        System.out.println("Il pesce sta scappando");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce sta cacciando i pesci più piccoli");
    }
    
}
