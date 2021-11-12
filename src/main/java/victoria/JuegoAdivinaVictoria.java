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
        Scanner sc = new Scanner(System.in);
       
        
        String opcion;
        do {
            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                   
            //    leerDatos(numUser);
                
                   
                
                    
                    
                    
                    
                    
                    
                    

                    break;
                case "2":
                    System.out.println("Adios");

                    break;
              
                default:
                    System.out.println("Opción no válida");
            }
           
        } while (!opcion.equals("2"));

    }
    
    private static void mostrarMenu() {
        System.out.println("Juego de Adivinar");
        System.out.println("1 - Jugar");
        System.out.println("2 - salir");   
    }

    //---MÉTODO NÚMERO RANDOM-----
    private static int numRandom(int num1, int num2) {

        //Creo objeto de clase tipo random
        Random numAleatorio = new Random();
        int numRandom;
        numRandom = numAleatorio.nextInt(num1 - num2 + 1) + num2;

         System.out.println("La máquina ha elegido el:  " + numRandom );
         System.out.println("\n------------------\n");
         
         return numRandom;
    }
       
    //MÉTODO PEDIR POR TECLADO AL USUARIO 2 NÚMEROS
      private static int leerDatos(int numUser){
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;
        
        do {
            // Bloque try. Aquí se pone el código susceptible de error
                
                try {
                    
                    System.out.println("Introduzca un número");
                    numUser =sc.nextInt();
                    
                    seguir=false; 
                    

                } catch (InputMismatchException ime) {
                    //Código para tratar el error
                    System.out.println("Se ha introducido texto en lugar de números, "
                            + "inténtalo de nuevo");
                    //limpiamos el buffer
                    sc.nextLine();
                    
                    //Ahora mismo no tengo un bucle, me dice donde me equivoqué limpia el buffer y ya esta, falta do while
                } 
            } while (seguir); //hasta que los datos esten correctos
            //bucle que controle la excepcion 
            
        
        return numUser;
    }
    
    

}
