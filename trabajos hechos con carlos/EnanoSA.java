/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enano.s.a;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EnanoSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
                int compra, res, total, opcion ;
                int cuenta=0;
                double descuento, valor;
                int subtotal=0;
               
                do{
          System.out.println("ingrese el valor del articulo; ");
                compra =scan.nextInt();
                    cuenta+=compra;
                    System.out.println("lleva acumulado: "+cuenta);
                System.out.println("este articulo tiene etiqueta roja: ");
                System.out.println("1. si");
                System.out.println("2. no");
                res=scan.nextInt();
                         if (res == 1){
                    descuento= compra * 0.20;
                    valor = compra - descuento;
                    subtotal+= valor;
                             System.out.println("tiene descuento, su valor queda en: "+valor);
                }else{
                    if (res==2){
                        valor = compra;
                    subtotal+= valor;
                        System.out.println("no tiene descuento su valor es: "+valor);
                    }
                     
                }
                    System.out.println("desea seguir con la compra:");
                    System.out.println("1. si");
                    System.out.println("2.no");
                    opcion=scan.nextInt();
                      
               
    }while (opcion!=2);
              
              System.out.println("la compra total de sus artiiculos son: ");  
              total= subtotal;
              System.out.println(total+"$");
    }
    
}
