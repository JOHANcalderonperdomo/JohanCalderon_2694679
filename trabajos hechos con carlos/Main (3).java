/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg5;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int base;
    int exponente;
    int resultado= 1;
        System.out.print("Introduzca la base: ");
        base = scan.nextInt();

        System.out.print("Introduzca el exponente: ");
        exponente = scan.nextInt();
       
              
      for (int i=1; i<exponente;i++){
      resultado = ( base * resultado);
      System.out.println(base+" ^ "+i+ " = "+ resultado);
    }

        
    }
}
