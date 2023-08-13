/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class procedimiento {

    Double total, des, total2;
    int ma;
    private Double promedio;
    private Double Destino;

    public Double getDestino() {
        return Destino;
    }

    public void setDestino(Double Destino) {
        this.Destino = Destino;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    FunctionNumeric fn = new FunctionNumeric();

    FunctionString fs = new FunctionString();

    public void resultado() {

        this.setPromedio(fn.InputDoubleNumericScanner("Digite el promedio : "));
        if (this.getPromedio() >= 9.5) {
            fs.ShowScanner("Usted es de preparatoria \nEntonces este podrá cursar 55 unidades \nSe le hará un 25% de descuento.\n");
            total = 180.0 * 11.0;
            des = total * 0.25;
            total2 = total - des;
            fs.ShowScanner("El total que tendrá que pagar por su colegiatura es: " + total2 + "\n");

        } else {
            if (this.getPromedio() >= 9.0 || this.getPromedio() < 9.5) {
                fs.ShowScanner("Usted es de preparatoria \nEntonces este podrá cursar 50 unidades \nSe le hará un 10% de descuento.\n");
                total = 180.0 * 10.0;
                des = total * 0.10;
                total2 = total - des;
                fs.ShowScanner("El total que tendrá que pagar por su colegiatura es: " + total2 + "\n");
            } else {
                if (this.getPromedio() > 7.0 || this.getPromedio() < 9.0) {
                    fs.ShowScanner("Usted es de preparatoria \nEntonces este podrá cursar 50 unidades \nNo se le hará descuento.\n");
                    total = 180.0 * 10.0;
                    fs.ShowScanner("El total que tendrá que pagar por su colegiatura es: " + total + "\n");
                } else {
                    if (this.getPromedio() == 7.0 || this.getPromedio() < 7.0) {
                        ma = fn.InputIntegerNumericScanner("Número de materias reprobadas es: ");
                        if (ma > 0 || ma < 3) {
                            fs.ShowScanner("Usted es de preparatoria \nEntonces este podrá cursar 45 unidades \n.\n");
                            total = 180.0 * 10.0;
                            des = total * 0.10;
                            total2 = total - des;
                            fs.ShowScanner("El total que tendrá que pagar por su colegiatura es: " + total2 + "\n");
                        }

                    }
                }
            }
        }
    }
}
