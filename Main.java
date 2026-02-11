import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Persona persona1 = new Persona();
      Persona persona2 = new Persona();


      persona1.nome = "Giovanni";
      persona1.cognome = "Rossi";

      persona1.saluta();
      persona1.cammina();
  
      persona2.nome = "Gigi";
      persona2.cognome = "bianchi";





    } 
    
    /* overloaded Methods usare lo stesso metondo che usiamo in casistiche diverse
      praticemnte puopi chiamare la fdunzione in maniera uguale ma se utilizzi paramentri diversi o numero di parametri divero
      o tipo diverso di dato ( es int o double) possiamo chiamre la funzione nella stessa maniera */
    
     /*  static int addizione(int a, int b){
       int risultato = a + b;
       return risultato;
   }
   static int addizione(int c, int d, int e){
       int risultato = c + d;
       return risultato;
   }
     */
    
    /* arraylist 2d */
    /*ArrayList<ArrayList<Integer>> classi = new ArrayList();
    
    ArrayList<Integer> classe1 = new ArrayList<Integer>();

    classe1.add(1);
    classe1.add(2);
    classe1.add(3);

    ArrayList<Integer> classe2 = new ArrayList<Integer>();

    classe2.add(3);
    classe2.add(4);
    classe2.add(5);
    
    classi.add(classe1);
    classi.add(classe2);

    for( int i = 0; i< classi.size(); i++){
       System.out.println();

        for(int j = 0; j <classi.get(i).size(); j++){
          System.out.print(classi.get(i).get(j) + " ");
        }

    }*/
    /* prova funzione addizione */
    /* int totaleSpeso = addizione(23, 4);
    int provaFunzione = addizione(totaleSpeso, 25);
    System.out.println(totaleSpeso);
    System.out.println(provaFunzione); */


    

   /* funzioni o metodi ( differenza concettuale) void funzione che non trorna nessun risultato*/ 

   /* static  void faiPasta(){
   
    System.out.println("faiPasta");
     
   } */
  /* Se vuoi che un data esca da una funzione devi escludere il void ( altrimenti non ritornerà nessun data)
  e inserire static (tipo di dato ad es, int, string ecc) e nome fuznione ( aggiungere parametri che sono dei segnaposti che permettono di inserire dati diversi)
  i parametri devono essere sempre dello stesso tipo indicato dopo lo static*/

  /*  static int addizione(int a, int b){
       int risultato = a + b;
       return risultato;
   } */

}


