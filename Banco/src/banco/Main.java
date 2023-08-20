/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;
public class Main {
   
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();

        cajero.registrarNuevoCliente("Alice", "crédito", "Bank A", 1000);
        cajero.registrarNuevoCliente("Bob", "débito", "Bank B", 500);

        cajero.realizarRetiro(cajero.getClientes().get(0), 300);
        cajero.realizarRetiro(cajero.getClientes().get(1), 200);
    }
}

