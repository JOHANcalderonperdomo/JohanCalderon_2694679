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
public class New4 {
     public static void main(String[] args) {
         int num, opcion, suma_llan;
         double presi, volu, tem, masa,  pro, sumatotal;
         double llan;
         double llan1;
         double suma1=0;
         double suma2=0;
         int car=0;
         int moto=0;
         Scanner scan = new Scanner(System.in);
         do{
         System.out.println("que tipo de vehiculo tienes ");
         System.out.println("1. para vehiculo  ");
         System.out.println("2. para moto  ");
         num= scan.nextInt();
             System.out.println("deme la presion presion");
             presi=scan.nextDouble();
             System.out.println("deme el volumen");
             volu=scan.nextDouble();
             System.out.println("deme la temperatura");
             tem=scan.nextDouble();
             masa =(presi*volu)/0.37*(tem+460);
             System.out.println("la masa de su vehiculo es de:"+masa);
             if (num==1){
                 llan=masa*4;
                 suma1+=(float)llan;
                 car+=4;
             }else{
                 llan1=masa*2;
                 suma2+=(float)llan1;
                 moto+=2;
             }
               System.out.println("quiere continuar  1");
            System.out.println("quiere salir 2");
            opcion = scan.nextInt();
            if (opcion==1){
            }
         }while(opcion==1);
         suma_llan=car+moto;
         sumatotal=suma1+suma2;
         pro=sumatotal/suma_llan;

         System.out.println("numero total de llantas:"+suma_llan);
         System.out.println("suma total masa:"  +sumatotal);
         System.out.println("el promedio es :"+pro);
     }
}
