/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg6;

import java.util.Scanner

,
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
        int num1, num2;
        int x = 0;
        int maximo = 1;
        System.out.println("digite el primer numero: ");
        num1 = scan.nextInt();
        System.out.println("digite el segundo numero: ");
        num2 = scan.nextInt();
        if (num1 > 0 && num2 > 0) {
            while (x <= num1) {
                if (num1 % x == 0 && num2 % x == 0) {
                    if (x > maximo) {
                        maximo = x;
                    }
                }
                x = x + 1;
            }
            System.out.println("el maximo comun divisor  es: ");
            System.out.println(maximo);
        }else{
            System.out.println("escriba numeros mayores a cero.");
        }

    }

}
