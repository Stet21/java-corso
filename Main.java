import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
      String[][] classi = new String[3][3];

      classi[0][0] = "Luca";
      classi[0][1] = "Marta";
      classi[0][2] = "Giovanni";
      classi[1][0] = "Luca";
      classi[1][1] = "Marta";
      classi[1][2] = "Giovanni";
      classi[2][0] = "Luca";
      classi[2][1] = "Marta";
      classi[2][2] = "Giovanni";

      System.out.println(classi[2][1]);

      for(int classe = 0; classe < classi.length; classe++){
        System.out.println();

         for(int studente = 0; studente < classi[classe].length; studente++ ){

           System.out.print(classi[classe][studente] + " ");
         }

      }
  
}

}


