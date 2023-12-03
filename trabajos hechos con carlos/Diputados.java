/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diputados;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Diputados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int  opcion, opcion2, total1, total2;
        int ndeputados = 0;
        int afavor = 0;
        int encontra = 0;
        do {
            ndeputados++;
            System.out.println("primer deputado" + ndeputados);
            System.out.println("porfavor eliga: ");
            System.out.println("1. a favor del tratado.");
            System.out.println("2. en contra del tratado");
            opcion = scan.nextInt();
           if (opcion == 1) {
                afavor += opcion;
            } 
                if (opcion == 2) {
                    encontra += opcion;
                }
            

       
            System.out.println("si quiere terminar la encuesta marque 3 sino  marque 2.");
            opcion2 = scan.nextInt();
            if(opcion2<1 || opcion2>3){
                System.out.println("opcion no validad");
            }

        } while (opcion2 != 3);
 
        System.out.println("los diputados que votaron fueron: " + ndeputados);
        System.out.println("el porcentaje de los diputados que estan deacuerdo es: ");
         total1 =     (afavor *100) / ndeputados;
         System.out.println(total1+"%");
        
        System.out.println("el porcentaje de los diputados que estan en contra es: ");
         total2 = (encontra *100) /ndeputados;

      System.out.println(total2+"%");

    }

}
