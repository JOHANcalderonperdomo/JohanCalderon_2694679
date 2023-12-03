/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nivelacion;
import java.util.Scanner;
/**
 *
 * @author Jennifer
 */
public class Nivelacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner (System.in);
        int  ca1,ca2,ca3,ca4,ca5,pro;
        int estudiantes=0;
        int contador=0;
                    for (int a=0;a<=40;a++){
                  estudiantes++;
                     System.out.println("ingrese 5 calificaciones de estudiante: "+estudiantes );
            ca1=scan.nextInt();
              ca2=scan.nextInt();
                ca3=scan.nextInt();
                  ca4=scan.nextInt();
                    ca5=scan.nextInt();
                    pro= (ca1+ca2+ca3+ca4+ca5)/5;
                    System.out.println("el promedio es: "+pro);
               
                  if (pro >=7){
                         contador= contador+1;
                  }
            }
                    System.out.println("el numero de alumnos que no presentan nivelacion es: ");
                    System.out.println(contador);
        
        
    }
    
}
