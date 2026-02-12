import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


      Persona persona1 = new Persona("Stefano", "melchiorre Ricci");
      Persona persona2 = new Persona("Sole", "melchiorre Ricci");
      Persona persona3 = new Persona("Domenico", "melchiorre Ricci");

      Studente studente1 = new Studente("Stefano", "rossi", "matematica", "2D", new int[]{9, 9, 8});
      Studente studente2 = new Studente("Stefano", "verdi", "fisica", "3d", new int[]{8,7,6});


      System.out.println(studente2.toString());

      Insegnante insegnante1 = new Insegnante("Giordano", "rossi", "Architettura", new String[]{"3d", "4r", "6e"});
      Insegnante insegnante2 = new Insegnante("Gioro", "rossa", "Architettura", new String[]{"1d", "3r", "7e"});

     System.out.println(insegnante1.toString());




       }
 /* EREDITARIETA : è quel meccaniscmo che permette ad una classe di derivare da un'altra classe e ereditarne metodi e attributi  */
   /*    Persona persona1 = new Persona("Stefano", "ricci", 34, 1.82);
      Persona persona2 = new Persona("Sole", "ricci", 0, 0.82);

      System.out.println(" numero persona: " +  Persona.numeroPersone);
      persona1.saluta(persona2);
      persona2.saluta(persona1);
      Persona.mostraNumPersone();
 */

      

     

      /* final e static final è una variabile che non può essere variata , quindi se viene messa prima di una variabile essa non puo essere riassegnata( sarebeb una costante in JS) static è invece serve per condividere un attributo per tutti gli oggetti */
      /* metodo toString è un metodo che tutti gli oggetti ereditano , pratiucamente andiamo a creare un metedo che impostaimo noi che va a sovrascreiver eil toString e quindi ci permette di fare quello che gli diciamo noi*/
      /* Pizza pizza1 = new Pizza("Integrale", "pomodoro","Pecorino","patatine");
      Pizza pizza2 = new Pizza("5 Cereali", "alle verdure","Stracchino","zucchine griliate");

      System.out.println(pizza1.formaggio);
      System.out.println(pizza2.formaggio); */

       
      /* lo scoper delle varibili è globale quando viene definita  fuori dai metodi e solitamente sono variabili da 'riempire'
      mentre lo scope locale è quello delle variabili che sono state definite quindi non possono essere lette fuori dal metodo */
      /* grazie al costruttore creato dall'altra parte possiamo 'costruire una persona immettendo solo i parametri'
      e successivamente grazie al this. che in questo caso è persona1. possiamo andare a vere i vari attributi dell'oggetto creato */
    /* Persona persona1 = new Persona("Stefano", "melchiorre Ricci", 34, 1.82);
    Persona persona2 = new Persona("Sole", "melchiorre Ricci", 0, 0.63);

     System.out.println(persona1.nome);
     System.out.println(persona2.nome); */

   

      /* questo è un esempio di istanza di classe, si crea una classe in un altro foglio di codice( praticamnete uno stampino)
      e poi viene istanzata in altri fogli, per creare nuovi oggetti questo sotto è un esempio di persona creata con la classe persona
       */

     /*  Persona persona1 = new Persona();
      Persona persona2 = new Persona();


      persona1.nome = "Giovanni";
      persona1.cognome = "Rossi";

      persona1.saluta();
      persona1.cammina();
  
      persona2.nome = "Gigi";
      persona2.cognome = "bianchi";

    } 
     */
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


