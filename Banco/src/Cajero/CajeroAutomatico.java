/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CajeroAutomatico {
    private List<Cliente> clientes;
    private List<RegistroRetiros> registrosRetiros;

    public CajeroAutomatico() {
        clientes = new ArrayList<>();
        registrosRetiros = new ArrayList<>();
    }

    public void registrarNuevoCliente(String nombre, String tipoCuenta, String banco, double saldoInicial) {
        Cliente nuevoCliente = new Cliente(nombre, tipoCuenta, banco, saldoInicial);
        clientes.add(nuevoCliente);
    }

    public void realizarRetiro(Cliente cliente, double monto) {
        CuentaBancaria cuenta = null;

        for (Cliente c : clientes) {
            if (c.normalizarNombre().equals(cliente.normalizarNombre())) {
                cuenta = new CuentaBancaria(c.normalizarNombre(), c.getTipoCuenta(), c.getSaldoInicial());
                break;
            }
        }

        if (cuenta != null) {
            if (cuenta.retirarDinero(monto)) {
                for (Cliente c : clientes) {
                    if (c.normalizarNombre().equals(cliente.normalizarNombre())) {
                        c.setSaldoInicial(cuenta.verificarSaldo());
                        registrosRetiros.add(new RegistroRetiros(c, new Date(), monto));
                        break;
                    }
                }
            }
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    Cliente getCliente(String nombreCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
