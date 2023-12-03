/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package censo;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Censo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int edad, sexo, estado;
  
        int numcenso;

        for (int p = 1; p <= 1000; p++) {

            System.out.println("numero de censo: ");
            numcenso = scan.nextInt();
            System.out.println("edad: ");
            edad = scan.nextInt();
            System.out.println("sexo: ");
            System.out.println("1. masculino  ");
            System.out.println("2. femenino ");
            sexo = scan.nextInt();
            if (sexo < 1 || sexo > 2) {
                System.out.println("ingrese un numero valido");
                System.out.println("sexo: ");
                System.out.println("1. masculino  ");
                System.out.println("2. femenino ");
                sexo = scan.nextInt();
            }
            System.out.println("estado sivil: ");
            System.out.println("1. Soltera/o");
            System.out.println("2. Casada/o");
            System.out.println("3. Viuda/o");
            System.out.println("4Divorciado");
            estado = scan.nextInt();
            if (estado < 1 || estado > 4) {
                System.out.println("ingrese un numero valido");
                System.out.println("estado sivil: ");
                System.out.println("1. Soltera/o");
                System.out.println("2. Casada/o");
                System.out.println("3. Viuda/o");
                System.out.println("4Divorciado");
                estado = scan.nextInt();
            }
            if (sexo == 2 & estado == 1) {
                if (edad > 15 & edad < 22) {
                
                    System.out.println("el numero de censo de la mujer soltera y menor de 21 pero mayor de 16  es: ");
                    System.out.println(numcenso);
                }

            }
            {

            }
        }

    }
}
