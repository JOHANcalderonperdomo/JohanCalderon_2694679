/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg1;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] numeros = new int[100]; 

        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("numero "+"["+i+"]"+" "+numeros[i]);
        }
    }
    
}
