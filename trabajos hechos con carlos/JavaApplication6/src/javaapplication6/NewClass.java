/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-1
 */
public class NewClass {
    public static void main(String[] args) {
   int cant;
       int pre;
       int total;
       int opcion;
       int suma=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("ingrese el precio del articulo");
           pre=scan.nextInt();
            System.out.println("ingrese la cantidad de productos");
           cant=scan.nextInt();
           total=pre*cant;
            System.out.println("el suptotal de estos articulos es"+total);
            suma+=(float)total;
            System.out.println("quiere continuar teclee 1");
            System.out.println("quiere salir teclee 2");
            opcion = scan.nextInt();
            if (opcion==1){
              
            }
        } while (opcion != 2);    
          System.out.println("el precio de su compra total es de:"+suma);
}
}
