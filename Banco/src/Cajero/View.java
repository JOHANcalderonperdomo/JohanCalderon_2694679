/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;
  import java.util.Scanner;
/**
 *
 * @author jcald
 */
public class View {

    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();

        // Simulando acciones del cajero automático
        cajero.registrarNuevoCliente("Alice", "crédito", "Bank A", 1500);
        cajero.registrarNuevoCliente("Alice", "débito", "Bank A", 800);
        cajero.registrarNuevoCliente("Bob", "crédito", "Bank B", 1000);
        cajero.registrarNuevoCliente("Bob", "débito", "Bank B", 600);

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("1. Realizar retiro");
            System.out.println("2. Registrar nuevo cliente");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                realizarRetiro(cajero, scanner);
            } else if (opcion == 2) {
                registrarNuevoCliente(cajero, scanner);
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void realizarRetiro(CajeroAutomatico cajero, Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();

        Cliente cliente = cajero.getCliente(nombreCliente);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.println("Cliente: " + cliente.normalizarNombre());
        System.out.println("Tipo de cuenta: " + cliente.getTipoCuenta());
        System.out.println("Saldo antes de retiro: " + cliente.getSaldoInicial());

        System.out.print("Ingrese la cantidad de dinero que desea retirar: ");
        double montoRetiro = scanner.nextDouble();

        if (montoRetiro <= cliente.getSaldoInicial()) {
            cajero.realizarRetiro(cliente, montoRetiro);
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("El monto ingresado excede el saldo disponible.");
        }

        System.out.println("Saldo después de retiro: " + cliente.getSaldoInicial());
        System.out.println("====================");
    }

    public static void registrarNuevoCliente(CajeroAutomatico cajero, Scanner scanner) {
        // Código para registrar nuevo cliente, similar al código anterior
    }
}

















