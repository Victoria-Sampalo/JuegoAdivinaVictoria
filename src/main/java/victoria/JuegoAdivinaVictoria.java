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
        int num1, num2 = 0, numRango = 0, numRandom; 
        int numGenerado;
        boolean mayorQue = true; 
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
                    num1 = leerNumero(numRango);
                    System.out.println("Introduce el 2º número para finalizar el rango");
                    
                do{
                    num2 = leerNumero(numRango);
                    //condición si num1 es menor que  num2, ejemplo 1-10
                    if(num1 < num2){ 
                    mayorQue = true; 
                    
                    System.out.println("Has definido el rango de " + num1 + "-" + num2);
                   }else {
                        System.out.println("El número 2 debe de ser mayor que 1\n"
                                + "Vuelve a definir un fin del rango");
                       // mayorQue = false;
                       
                    }
                } while (!mayorQue); //
                    
                    
                    System.out.println("Ha continuado el programa"); 
                  //  System.out.println(numAleatorio(numRandom));
                //FALLO LÍNEA 65 illegal argumentException
                    numRandom = numAleatorio(num1, num2);
                      System.out.println(numRandom);
                    
                    
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
        System.out.println("Juego de Adivinar");
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
       
    //MÉTODO PEDIR POR TECLADO AL USUARIO 2 NÚMEROS
      private static int leerNumero(int numRango){
        Scanner sc = new Scanner(System.in);

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
