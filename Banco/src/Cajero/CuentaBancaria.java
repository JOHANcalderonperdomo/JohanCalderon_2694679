/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author jcald
 */
public class CuentaBancaria {
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
}
