package Pacchetto1;
import Pacchetto2.*;

public class Main {


    /* incapsulamento, processo inm cui nascondiamo attribbuti di una classe all'esterno mettendoli in private
    e che quindi diventano accessibili solo tramite dei metodi getters e setters */

    public static void main(String[] args) {
    Persona p1 = new Persona("luca", "rossi");

    System.out.println(p1.getNome());
    System.out.println(p1.getCognome());

        p1.setNome("mario");
        p1.setCognome("verdi");
        System.out.println(p1.getNome());
        System.out.println(p1.getCognome());

   
    }
    

}
