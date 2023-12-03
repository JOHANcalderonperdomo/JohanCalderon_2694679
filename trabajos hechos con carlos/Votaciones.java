/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votaciones;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Votaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int opcionv;
        int votaciones = 0;

        for (int can = 0; can <= 2500000; can++) {
            votaciones++;
            System.out.println("vote por su candidato elegido: ");
            System.out.println("1. alex calderon");
            System.out.println("2. fernando zapata");
            System.out.println("3.juan miguel montero");
            opcionv = scan.nextInt();
            
            if (opcionv == 1) {
                voto1 += opcionv;
            } else {
                if (opcionv == 2) {
                    voto2 += opcionv;
                } else {
                    if (opcionv == 3) {
                        voto3 += opcionv;
                    }
                }
            }
        }
        System.out.println("el total de votociones: ");
        System.out.println(votaciones);
        System.out.println("el primer candidato alex calderon tiene: "); System.out.println(voto1);
        System.out.println("el segundo candidato fernando zapata tiene:");System.out.println(voto2);
        System.out.println("el tercer candidato juan miguel tiene:");System.out.println(voto3);
         if(voto1==voto2 && voto1==voto3 && voto2==voto3){
             System.out.println("los candidatos estan empatados.");
             
         }else{
           if   (voto1==voto2 && voto1>voto3){
             System.out.println("los candidatos 1 y 2 estan empatados.");
         }else{
               if(voto1==voto3 && voto1>voto2){
                   System.out.println("los candidatos 1 y 3 estan empatados.");
               }else{
                   if(voto2==voto3 && voto2>voto1){
                       System.out.println("los candidatos 2 y 3 estan empatados.");
                   }else{
                       if(voto1>voto2){
                           if(voto1>voto3){
                               System.out.println("el candidato 1 gana.");
                           }else {
                               System.out.println("el candidato 3 gana.");
                           }
                       } else{
                           System.out.println("el candidato 2 gana.");
                       }
                   }
               }
           }
         }
    }

}
