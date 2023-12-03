/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg4;
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
        int res, num;
        System.out.println("escriba el numero que quiere multiplicar: ");
        num=scan.nextInt();
        for (int i=1;i<=10;i++){
            res= num*i;
            System.out.println(num+" * "+i+" = "+res);
        }
    }
    
}
