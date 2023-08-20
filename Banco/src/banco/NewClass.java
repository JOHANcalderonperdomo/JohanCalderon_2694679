/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.*;

class CuentaBancaria {
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldoActual;

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoActual = saldoInicial;
    }

    public double verificarSaldo() {
        return saldoActual;
    }

    public boolean retirarDinero(double monto) {
        if (saldoActual >= monto) {
            saldoActual -= monto;
            return true;
        }
        return false;
    }

    public void actualizarSaldo(double nuevoSaldo) {
        saldoActual = nuevoSaldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
}

class Cliente {
    private String nombre;
    private String tipoCuenta;
    private String banco;
    private double saldoInicial;

    public Cliente(String nombre, String tipoCuenta, String banco, double saldoInicial) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.banco = banco;
        this.saldoInicial = saldoInicial;
    }

    public String normalizarNombre() {
        return nombre.toLowerCase();
    }

    public String normalizarBanco() {
        return banco.toLowerCase();
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldo) {
        saldoInicial = saldo;
    }
}

class RegistroRetiros {
    private Cliente cliente;
    private Date fechaRetiro;
    private double montoRetirado;

    public RegistroRetiros(Cliente cliente, Date fechaRetiro, double montoRetirado) {
        this.cliente = cliente;
        this.fechaRetiro = fechaRetiro;
        this.montoRetirado = montoRetirado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public double getMontoRetirado() {
        return montoRetirado;
    }
}

class CajeroAutomatico {
    private List<Cliente> clientes;
    private List<RegistroRetiros> registrosRetiros;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

   
    
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

    // Agregar otros métodos para normalizar nombres de clientes, normalizar nombres de bancos y mantener registros de retiros
}


