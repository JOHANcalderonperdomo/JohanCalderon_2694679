/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg2;
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
        Scanner scan = new Scanner (System.in);
        int suma=0;
        int num1, num2;
        System.out.println("escriba el primer numero: ");
        num1=scan.nextInt();
        System.out.println("escriba el segundo numero: ");
        num2= scan.nextInt();
        for(int i=1;i<= num2 ;i++){
            suma = suma+num1;
        }
        System.out.println("el producto de estos dos numeros es: ");
        System.out.println(suma);
    }
    
}
