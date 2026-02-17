package Polimorfismo;

public class Main {

    public static void main(String[] args) {

        Studente s1 = new Studente("Mario", "Rossi");
        Studente s2 = new Studente("Giuseppe", "Bianchi");
        Insegnante i1 = new Insegnante("Luigi", "Verdi");   

        Persona[] classe = {s1, s2, i1 };
        
        s1.saluta();
        s2.saluta();
        i1.saluta();

        for(Persona p : classe){
            p.saluta();
        }
    }
    
}
