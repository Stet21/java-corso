package Polimorfismo;

public class Insegnante extends Persona {   

    Insegnante(String nome, String cognome){
        super(nome, cognome);
    }

    @Override
    public void saluta(){
        System.out.println("Salve, sono " + this.getNome() + " " + this.getCognome() + " e sono un insegnante");
    }
        
}
