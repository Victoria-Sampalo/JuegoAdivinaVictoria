/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victoria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Clasecontador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numAleatorio = new Random();

        //---VARIABLES DEL SCANNER
        int numUser, numRandom;
        final int MAX_VALUE = 10, MIN_VALUE = 5;
        int vida=3;

        
        numRandom = numAleatorio.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        System.out.println("La máquina ha elegido el:  " + numRandom);
        System.out.println("\n------------------\n"
                + "JUEGO DE ADIVINAR"
                + "\n------------------\n");

        //PIDO NUMERO POR TECLADO AL USER
     //   System.out.println("Introduce el número dentro del rango 5-10");

        //DEFINO BUCLE FOR
       // for (int vidaPerdida =0; vidaPerdida <3; vidaPerdida++) {
            //for (int ronda = 0; ronda < 5; ronda++) {
         
        //uso DO WHILE
            
     do{
        System.out.println("Introduce el número dentro del rango 5-10");   
         numUser = sc.nextInt();
            System.out.println("Has elegido el nº: " + numUser);
            
            if (numUser == numRandom) {
                System.out.println("Número correcto. HAS GANADO. FIN");
                
            } else if (numUser < numRandom) {
                System.out.println("El número está por debajo del NUM SECRETO, elije uno un poco más grande");
                vida--;
            } else {
                System.out.println("El número está por encima del NUM SECRETO, elije uno un poco más PEQUEÑO");
                vida--;
            }
            
     } while ((vida >0) && (!(numUser ==numRandom ))); //se repite mientras que: vidas mayor que 0 y numrandom no sea igual
        
     if (vida ==0){
         System.out.println("Se te han agotado los intentos. Inténtalo de nuevo");
     }
     
     
        }

  }


