/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg4;
import java.util.Scanner;
/**
 *
 * @author Ambiente 209-3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num;
         int par=0;
         int impar=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros que desea");
        num=scan.nextInt();
    int[] numeros = new int[num]; 

        for (int i = 0; i < num; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < num; i++) {
System.out.println("numero "+"["+i+"]"+" "+numeros[i]);
        }
/*
        for (int i = 0; i < num; i++) {
            if (numeros[i]% 2!=0){
                par =par+par;
            }else{
                impar=impar+impar;
            }
        }
        System.out.println("los numeros pares son: "+par);
        System.out.println("los numeros impares son: "+impar);
*/
    }
    
}
