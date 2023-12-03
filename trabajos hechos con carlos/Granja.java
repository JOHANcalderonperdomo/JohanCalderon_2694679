/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
         
        double  calidad, precioh, pro;
        double peso, altura, numhuevos;
        
        int opcion;
    
        double suma = 0;
        int numgallinas = 0;

        System.out.println("porfavor ingrese los siguientes datos de cada gallina que tenga: ");
        do {
            numgallinas++;
            System.out.println("van " + numgallinas + " gallinas");
            System.out.println("el peso de la gallina es: ");
            peso = scan.nextInt();
            System.out.println("la altura de la gallina es: ");
            altura = scan.nextInt();
            System.out.println("la cantidad de huevos que pone la gallina es: ");
            numhuevos = scan.nextInt();
            calidad = (peso * altura) / numhuevos;
              suma+=calidad;
            System.out.println("si desea terminar marque 1 de lo contrario digite 2");
            opcion = scan.nextInt();
            if (opcion<1 || opcion>2){
                System.out.println("opcion no validad intente de nuevo");
                System.out.println("si desea terminar marque 1 de lo contrario digite 2");
            opcion = scan.nextInt();
            }
        } while (opcion != 1);
     
        pro = suma/ numgallinas;
        System.out.println("suma total de calidad:" + suma);
        System.out.println("el promedio de la calidad de las gallinas que tiene son: " + pro);
        System.out.println("el precio de venta por cada kilo de huevo seria: ");
        if (pro >= 15) {
            precioh = 1.2 * pro;
            System.out.println(precioh);
        } else {
            if (pro > 8 && pro < 15) {
                precioh = 1.00 + pro;
                System.out.println(precioh);
            } else {
                if (pro < 8) {
                    precioh = 0.80 + pro;
                    System.out.println(precioh);
                }
            }
        }
    }

}
