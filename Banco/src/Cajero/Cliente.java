/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author jcald
 */
public class Cliente {
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
