/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg7;
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
        int num1, num2, n1,x;
        int n2=0;
        int a=1;
        System.out.println("escriba dos numeros: ");
        num1 = scan.nextInt();
        x=scan.nextInt();
        if (num1>x ){
         num2=x;
        
    }else {
            num2=num1;
            num1= x;
        }
        x=1;
        while(x!=0){
            n1=num1*x;
            x = x + 1;
            while(n2<n1){
                n2= num2 * a;
                a = a + a;
                if(n1==n2){
                    System.out.println("el minimo comun multiplo es: ");
                    System.out.println(n1);
                    x= 0;
                }
            }
        }
    }
    
}
