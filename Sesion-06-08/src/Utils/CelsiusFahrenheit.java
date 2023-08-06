/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class CelsiusFahrenheit {
 
    private Double kelvin;
    private Double celcius;
    private Double fahrenheit;

    public Double getKelvin() {
        return kelvin;
    }

    public void setKelvin(Double kelvin) {
        this.kelvin = kelvin;
    }

    public Double getCelcius() {
        return celcius;
    }

    public void setCelcius(Double celcius) {
        this.celcius = celcius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    
    
    public Double gradosCelsiusFahrenheit(){
        this.setFahrenheit(this.getCelcius()*9/5+32);
        return this.getFahrenheit();
    }
    
    public Double gradosCelsiusKelvin(){
        this.setKelvin(this.getCelcius()+273.15);
        return this.getKelvin();
    }
    
    public Double gradosFahrenheitCelsius(){
        this.setCelcius((this.getFahrenheit()-32)*(5/9));
        return this.getFahrenheit();
    }
    
    public Double gradosFahrenheitKelvin(){
        this.setKelvin((this.getFahrenheit()+459.67)*(5/9));
        return this.getFahrenheit();
    }
    
    
    public Double gradosKelvinFahrenheit(){
        this.setFahrenheit((this.getKelvin()*9/5)-459.67);
        return this.getKelvin();
    }
    
    public Double gradoKelvinCelsius(){
        this.setCelcius(this.getKelvin()-273.15);
        return this.getKelvin();
    }
}

