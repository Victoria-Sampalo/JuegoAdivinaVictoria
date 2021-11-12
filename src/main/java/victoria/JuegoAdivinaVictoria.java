package victoria;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/*
 *Adivinar número aleatorio
 */
/**
 *
 * @author victoria
 */
public class JuegoAdivinaVictoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---VARIABLES A USAR
        int numVidas = 3;
        //----DEFINO MÉTODO SCANNER-----
        System.out.println("num1" + num1);
        

    }

    //---MÉTODO NÚMERO RANDOM-----
    private static Random numRamdon(int num1, int num2) {

        //Creo objeto de clase tipo random
        Random numAleatorio = new Random();
        int numRandom;
        numRandom = numAleatorio.nextInt(num1 - num2 + 1) + num2;

         System.out.println("La máquina ha elegido el:  " + numRandom );
         System.out.println("\n------------------\n");
         
         return numAleatorio;
    }
       
    //MÉTODO PEDIR POR TECLADO AL USUARIO 2 NÚMEROS
      private static int leerDatos(){
        Scanner sc = new Scanner(System.in);

        //----------VARIABLES A USAR--------
        int num1 = 0;
        int num2 = 0;
        boolean seguir = true;
        
        do {
            // Bloque try. Aquí se pone el código susceptible de error
                
                try {
                    
                    System.out.println("Introduzca un número");
                    num1 =sc.nextInt();
                    num2=sc.nextInt();
                    seguir=false; 
                    

                } catch (InputMismatchException ime) {
                    //Código para tratar el error
                    System.out.println("Se ha introducido texto en lugar de números, "
                            + "inténtalo de nuevo");
                    //limpiamos el buffer
                    sc.nextLine();
                    sc.nextLine();
                    //Ahora mismo no tengo un bucle, me dice donde me equivoqué limpia el buffer y ya esta, falta do while
                } //no ;
            } while (seguir); //hasta que los datos esten correctos
            //bucle que controle la excepcion 
            
        
        return num1+num2;
    }
    
    

}
