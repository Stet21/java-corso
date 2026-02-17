public class Persona {

    String nome;
    String cognome;

    /* questo è un metodo costruttore che ci permette di creare in questo caso una persona
    dobbiamo mettere anche i paramentri che ogni volta creiamo una persona */
    /* il this. è come se richiamassero se stessa e quindi la classe dove si trovano */
     Persona(String nome, String cognome){

         this.nome = nome;
        this.cognome = cognome;

    }
    public String toString(){

          String stringa = this.nome + " " + this.cognome;
          return stringa;
    }

    void saluta(){
        System.out.println("Ciao io sono" + " " + this.nome);
    }

    static void mostraNumPersone(){
        System.out.println("il numero di persone create è :" );
    }
}

   /*  void saluta(){
        System.out.println("ciao sono: " + nome);
    
    }

    void cammina(){
        System.out.println("sto camminando...");
    }
     */
/* } */


/* Introduzione programmazione ad oggetti */

/* ogni coisa che esiste nel mondo puo essere un oggeto, come una persona, un insieme di persone formano una classe
un metodo è una funzione usata dentro ad una classe ma siccome java è un liguaggio che utilizza solo classi per lavorare
ogni funzione è un metodo */