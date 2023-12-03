/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrotienda;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Registrotienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int clientes = 0;
        int compra, opcion;
        int total=0;
        do {
            clientes++;
            System.out.println("el cliente " + clientes);
            System.out.println("ingrese el valor total de su compra; ");
            compra = scan.nextInt();
           total+=compra;
            System.out.println("si desea terminar con la compra marque 1 de lo contrario presione 2.");
            opcion = scan.nextInt();
            if (opcion < 1 || opcion > 2) {

                System.out.println("esa opcion no es valida, intente de nuevo.");

            }
        } while (opcion != 1);
        System.out.println("el numero de clientes que visitaron la tienda fueron de:");
        System.out.println(clientes);
        System.out.println("la venta total del dia es: ");
        System.out.println(total);
    }

}
