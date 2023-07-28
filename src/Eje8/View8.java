/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje8;
import java.util.Scanner;
/**
 *
 * @author jcald
 */
public class View8 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in); 
        
       
        System.out.println("Digite un numero real:  ");
        Double num = scanner.nextDouble(); 
        
        if(Class8.par(num)){
            System.out.println("el numero digitado es par");
        }else{
            System.out.println("el numero digitado es impar");
        }
       
}
}
