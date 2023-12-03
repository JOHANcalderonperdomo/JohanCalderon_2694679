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
public class new3 {
      public static void main(String[] args) {
    int precio=100;
    int edad;
    double des1;
    int opcion;
    double suma1=0;
    double suma2=0;
    double suma3=0;
    double suma4=0;
    double suma5=0;
    double sumatotal;
     Scanner scan = new Scanner(System.in);
    do{
            System.out.println("ingre la edad");
            edad= scan.nextInt();
            if(edad<5){
                System.out.println("El niño no puede entrar ");
            }else{
                if(edad> 5 && edad<14){
                    des1=precio*0.35;
                    System.out.println("el precio de su entrada es de:"+des1);
                    suma1+=(float)des1;
                }else{
                    if (edad>15 && edad<19){
                         des1=precio*0.25;
                         suma2+=(float)des1;
                    System.out.println("el precio de su entrada es de:"+des1);
                    }else{
                        if (edad>20 && edad<45){
                             des1=precio*0.10;
                             suma3+=(float)des1;
                    System.out.println("el precio de su entrada es de:"+des1);
                        }else{
                            if (edad>46 && edad<65){
                                 des1=precio*0.25;
                                 suma4+=(float)des1;
                    System.out.println("el precio de su entrada es de:"+des1);
                            }else{
                                 des1=precio*0.35;
                                 suma5+=(float)des1;
                    System.out.println("el precio de su entrada es de:"+des1);
                            }
                        }
                    }
                }
            } 
           
            System.out.println("quiere continuar  1");
            System.out.println("quiere salir 2");
            opcion = scan.nextInt();
            if (opcion==1){
              
            }
} while (opcion != 2);    
    sumatotal=suma1+suma2+suma3+suma4+suma5;
          System.out.println("el precio de su compra total es de:"+suma1);
          System.out.println("el precio de su compra total es de:"+suma2);
          System.out.println("el precio de su compra total es de:"+suma3);
          System.out.println("el precio de su compra total es de:"+suma4);
          System.out.println("el precio de su compra total es de:"+suma5);
          System.out.println("_________________________________");
          System.out.println("la suma total de la perdida es de:"+sumatotal);
}
}
