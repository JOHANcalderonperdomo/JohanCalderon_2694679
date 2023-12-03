/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
        int num = 2;
        int numk = 1;
        int numl = 3;
        if (num > numk && num > numl) {
            System.out.print("el numero 1 es el mayor " + num);
        } else {
            if (numk > num && numk > numl) {
                System.out.print("el numero 2 es el mayor  " + numk);
            } else {
                if (numl > num && numl > numk) {
                    System.out.print("el numero tres es el mayor  " + numl);
                } else {
                    System.out.print("los numeros son iguales  ");
                }
            }
        }
         */
 /*
        Scanner scan = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float per;
        System.out.println("ingrese la primera nota");
        num1 = scan.nextFloat();
        System.out.println("ingrese la segunda nota");
        num2 = scan.nextFloat();
        System.out.println("ingrese la tercera nota");
        num3 = scan.nextFloat();
        per = (num1 + num2 + num3)/3;
    per=per*100;
    per=per/100;
    per=Math.round(per);
        System.out.println("la nota de su periodo es de: " + per);
        
        if (per > 3.0) {
            System.out.println("usted aprobo la materia");
        } else {
            System.out.println("usted reprobo la matreria");
        }
         */
 /*
        Scanner scan = new Scanner(System.in);
        int num;
        int con=1;
        int con2=1;
        double num1;
        double num2;
        double resp;
        System.out.println("Calculadora");
        System.out.println("1.para sumar");
        System.out.println("2.para restar ");
        System.out.println("3.para multiplicar");
        System.out.println("4.para dividir ");
        num = scan.nextInt();
          if (num>=1&& num<=4){
              System.out.println("ingrese el primer numero");
                num1 = scan.nextDouble();
                System.out.println("ingrese el segundo numero ");
                num2 = scan.nextDouble();
        switch (num) {
            case 1:
                resp= num1 + num2;
                System.out.println("El resultado de su operacion es de:");
                System.out.println("" + resp);
                break;
            case 2:
                resp = num1 - num2;
                System.out.println("El resultado de esta operacion es de:");
                System.out.println("" + resp);
                break;
            case 3:
                resp = num1 * num2;
                resp = resp * 100;
                resp = resp / 100;
                resp = Math.round(resp);
                System.out.println("El resultado de esta operacion es de:");
                System.out.println("" + resp);
                break;
            case 4:
                     if (num2==0){
                    System.out.println("no se puede dividir por cero (0)");
                    while (con==1){
                         System.out.println("tecle el numero uno (1) para repetir el numero");
                         con=scan.nextInt();
                         System.out.println("ingrese el segundo numero ");
                          num2 = scan.nextDouble();
         System.out.println("tecle el numero cero (0) ");
                         con=scan.nextInt();
                }
                }
                resp= num1/num2;
                System.out.println("El resultado de esta operacion es de:");
                System.out.println("" + resp);
                break;
        }
          }
          else {
              System.out.println("ese numero no sirve");
          }
         */
 /*
int num;
for (int i=1; i<=10;i++){
    num=5*i;
    
        System.out.println("5 * "+i+"="+num);
    }
         */
        int opcion;
     
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("1. opcion=a");
            System.out.println("2. opcion=b");
            System.out.println("3. opcion=c");
            System.out.println("4. opcion=d");
            System.out.println("5. salir");
            opcion = scan.nextInt();

            if (opcion > 5 || opcion < 1) {
                System.out.println("ese numero no sirve ");
            }
            switch (opcion) {
                case 1:
                    System.out.println("hola 1");
                    break;
                case 2:
                    System.out.println("hola 2");
                    break;
                case 3:
                    System.out.println("hola 3");
                    break;
                case 4:
                    System.out.println("hola 4");
                    break;
                case 5:
                    break;

            }
        } while (opcion !=5);
    }
}
