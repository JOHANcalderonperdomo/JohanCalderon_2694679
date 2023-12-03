/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria;
import java.util.Scanner;
/**
 *
 * @author Jennifer
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        int num;
        int numero=0;
        
        System.out.println("escriba el  numero hasta el cual desea hacer la suma:");
        num=scan.nextInt();
        
        for (int n = 1; n <= num; n++) {
            numero+=n;
            System.out.println("los numeros son:"+numero);
        }
            
        }
    }
    

