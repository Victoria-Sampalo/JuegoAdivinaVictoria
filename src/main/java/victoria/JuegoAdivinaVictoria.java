/*
 *Adivinar número aleatorio
 */
package victoria;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

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
        int num1 = 0, num2 = 0, numRango = 0, numRandom;

        int numGenerado = 0;

        //----DEFINO MÉTODO SCANNER-----
        Scanner sc = new Scanner(System.in);

        //--MÉTODO MOSTRAR MENÚ--------
        String opcion;
        do {
            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Comenzamos el juego\n"
                            + "Primero debes de definir el rango con el que quieres jugar");
                    //solicito los números por teclado llamando al MÉTODO SCANNER
                    //Los guardo en dos variables

                    System.out.println("Introduce el 1º número para empezar el rango");
                    num1 = leerNumero();
                    System.out.println("Introduce el 2º número para finalizar el rango");

                    do {   //do while que permite que se repita si el seguno digito es menor que el primero
                        num2 = leerNumero();
                        //condición si num1 es menor que  num2, ejemplo 1-10

                    } while (num1 > num2); //se sale si num2 es menor que num1    
                    
                    System.out.println("");
        

                System.out.println("Empezamos el juego");

                numGenerado = numAleatorio(num1, num2);
                System.out.println(numGenerado);

                break;

    

        case "2":
                    System.out.println("Adiós");

        break;
              
                default:
                    System.out.println("Opción no válida");
            }
           
        } while (!opcion.equals("2"));

    }
    
    private static void mostrarMenu() {
        System.out.println("\n------------------\nJuego de Adivinar\n------------------\n");
        System.out.println("1 - JUGAR");
        System.out.println("2 - SALIR");   
    }

    //---MÉTODO NÚMERO RANDOM-----
    private static int numAleatorio(int num1, int num2) {
      
        //Creo objeto de clase tipo random
        Random numAleatorio = new Random();
        
        
       
        int numRandom = numAleatorio.nextInt(num1 - num2 + 1) + num2;

         System.out.println("La máquina ha elegido el:  " + numRandom );
         System.out.println("\n------------------\n");
         
         return numRandom;
    }
       
    //MÉTODO PEDIR POR TECLADO AL USUARIO NÚMEROS ENTEROS
        private static int leerNumero(){
        Scanner sc = new Scanner(System.in);
        int numRango= 0;
        boolean seguir = true;
        
        do {
            // Bloque try. Aquí se pone el código susceptible de error
                
                try {
                    
                   // System.out.println("Introduzca un número");
                    numRango =sc.nextInt();
                    
                    seguir=false; 
                    

                } catch (InputMismatchException ime) {
                    //Código para tratar el error
                    System.out.println("No se ha introducido un número entero, "
                            + "inténtalo de nuevo por favor.\n");
                    //limpiamos el buffer
                    sc.nextLine();
                    
                    //Ahora mismo no tengo un bucle,
                } 
            } while (seguir); //hasta que los datos esten correctos
            //bucle que controle la excepcion 
            
        return numRango;
 
       
    }
    
}
