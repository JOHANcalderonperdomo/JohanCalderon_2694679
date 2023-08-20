/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;
import java.util.Date;

/**
 *
 * @author jcald
 */
public class RegistroRetiros {
    private Cliente cliente;
    private Date fechaRetiro;
    private double montoRetirado;

    public RegistroRetiros(Cliente cliente, Date fechaRetiro, double montoRetirado) {
        this.cliente = cliente;
        this.fechaRetiro = fechaRetiro;
        this.montoRetirado = montoRetirado;
    }
}
