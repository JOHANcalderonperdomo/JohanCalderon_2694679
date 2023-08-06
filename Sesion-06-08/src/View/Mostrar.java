/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Utils.CelsiusFahrenheit;
import Utils.FunctionNumeric;
import Utils.FunctionString;
import Entity.moneda.Conversion;

/**
 *
 * @author ariel
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
   CelsiusFahrenheit cf = new CelsiusFahrenheit ();
    Conversion cg = new Conversion();
       cg.Pesos();
       cg.Dolares();
       cg.Bolivares();
       cg.Soles();
        //fn.InputNumericRangeScanner("Digite la nota: ",90.0,100.0);
        //fn.InputNumericposScanner("Digite un numero positivo: ");
        //fn.InputNumericnegaScanner("Digite un numero negativo: ");
        //fn.InputNumericRangeIntScanner("Digite la nota ",0, 5);
        //fn.InputNumericposIntScanner("Digite un numero positivo entero: ");
        //fn.InputNumericnegaIntScanner("Digite un numero negativo entero: ");
        
        //cf.setCelcius(fn.InputDoubleNumericScanner("ingrese la temperatura . "));
        //fs.ShowScanner("Grados Celsius a grados Fahrenheit: \n"+String.valueOf(cf.gradosCelsiusFahrenheit()));
        
        //fs.ShowScanner("Grados Celsius a grados kelvin: "+String.valueOf(cf.gradosCelsiusKelvin()));
        //fs.ShowScanner("Grados Fahrenheit a grados Celsiu: "+String.valueOf(cf.gradosFahrenheitCelsius()));
        //fs.ShowScanner("Grados Fahrenheit a grados kelvin: "+String.valueOf(cf.gradosFahrenheitKelvin()));
        //fs.ShowScanner("Grados kelvin a grados Fahrenheit:"+String.valueOf(cf.gradosKelvinFahrenheit()));
        //fs.ShowScanner("Grados kelvin a grados Celsius: "+String.valueOf(cf.gradoKelvinCelsius()));
    }
}
