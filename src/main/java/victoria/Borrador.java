/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victoria;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Borrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Ingrese número: ");
            n = sc.nextInt();
            // nmayor o igual que 0
            if (n >= 0) {                
                System.out.println("Es mayor que 0");
            }
        } while (n >= 0);  //si n es mayor que 0
    }
    
}
