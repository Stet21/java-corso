import java.util.Arrays;
public class Insegnante extends Persona {

    String materia;
    String[] classiAcuiInsegno;



    Insegnante(String nome, String cognome, String materia, String[] classiAcuiInsegno){

       super(nome,cognome);
       this.materia = materia;
       this.classiAcuiInsegno = classiAcuiInsegno;

    }

    void insegna(){
        System.err.println("Sto studiando");
    }


    @Override
    void saluta() {

        System.out.println("Ciao ragazzi");

    }

    @Override

    public String toString(){

         String stringa = this.nome + " " + this.cognome + " " + this.materia + " " + Arrays.toString(classiAcuiInsegno);
         return stringa;
    }
    

}
