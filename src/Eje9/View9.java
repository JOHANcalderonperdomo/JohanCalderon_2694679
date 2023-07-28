/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje9;
import java.util.Scanner;
/**
 *
 * @author jcald
 */
public class View9 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in); 
        
        try {
        System.out.println("Digite un numero entero:  ");
        Double num = scanner.nextDouble(); 
       
       if (Class9.par(num)){
           System.out.println("el numero es par");
       }else{
           System.out.println("el numero es impar");
       }
       
       if (Class9.pos(num)){
           System.out.println("el numero es positivo ");
       }else{
           System.out.println("elnumero es negativo ");
       }
        }catch (Exception e) {
            System.out.println("Error NO se aceptan letras .");
        }
           
}
}
