/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaApplication6;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        float num;
        double des1;
        double  suma=0;
        Scanner scan = new Scanner(System.in);
        do {
          
            System.out.println("ingrese el precio de su compra ");
            num = scan.nextFloat();
            System.out.println("1. opcion=Rojo");
            System.out.println("2. opcion=Amarillo");
            System.out.println("3. opcion=Blanca");
            System.out.println("4. salir");
            opcion = scan.nextInt();                                                      
            if (opcion > 5 || opcion < 1) {
                System.out.println("ese numero no sirve ");
            }
            switch (opcion) {
                case 1:
                    des1 = num * 0.60;
                    System.out.println("El precio de su compra con el descuento es de:" + des1);
                    suma+=(float)des1;
                    break;
                case 2:
                    des1 = num * 0.75;
                    System.out.println("El precio de su compra con el descuento es de:" + des1);
                    suma+=(float)des1;
                    break;
                case 3:
                    System.out.println("no obtuviste desceunto su compra sera de:" + num);
                    suma+=(float)num;
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
        System.out.println("la suma total del dia es:"+suma);
                         
                
    }

}
