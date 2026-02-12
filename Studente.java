import java.util.Arrays;


public class Studente extends Persona {

    String materiaPreferita;
    String classe;
    int[] votiStoria;    

    Studente(String nome, String cognome, String materiaPreferita, String classe, int[] votiStoria){

       super(nome,cognome);
       this.materiaPreferita = materiaPreferita;
       this.classe = classe;
       this.votiStoria = votiStoria;

    }

    void studia(){
        System.out.println("certo mamma sto studiando");
    }

    @Override

    void saluta(){

    
        System.out.println("Buongiorno prof!");
    }

   @Override
public String toString() {
    return "Nome: " + nome +
           "\nCognome: " + cognome +
           "\nMateria Preferita: " + materiaPreferita +
           "\nClasse: " + classe +
           "\nVoti Storia: " + Arrays.toString(votiStoria);
}

    
    
}
