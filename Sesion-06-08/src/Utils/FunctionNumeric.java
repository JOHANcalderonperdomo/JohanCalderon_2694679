/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author ariel
 */
public class FunctionNumeric {

    private Double numero;
    private Integer num; 

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }

    private Integer getNum() {
        return num;
    }

    private void setNum(Integer num) {
        this.num = num;
    }
    

    public Double InputDoubleNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }
    
    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
    
    public Double InputNumericRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }

    public Double InputNumericposScanner(String mensaje) {
       do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero()<0);
        
        return this.getNumero();
    }
    
    public Double InputNumericnegaScanner(String mensaje) {
       do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero()>0);
        
        return this.getNumero();
    }
    
    public Integer InputNumeriIntcScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNum();
    }

    public Integer InputNumericIntJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNum();
    }
    
    private void InputNumericInt(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNum(Integer.parseInt(fs.InputScanner(mensaje)));
                }else{
                    this.setNum(Integer.parseInt(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
     public Integer InputNumericRangeIntScanner(String mensaje, Integer min, Integer max) {
        do {            
            InputNumericInt(mensaje,1);
        } while (this.getNum() < min || this.getNum() > max);
        
        return this.getNum();
    }
     
     public Integer InputNumericposIntScanner(String mensaje) {
       do {            
            InputNumericInt(mensaje,1);
        } while (this.getNum()<0);
        
        return this.getNum();
    }
    
    public Integer InputNumericnegaIntScanner(String mensaje) {
       do {            
            InputNumericInt(mensaje,1);
        } while (this.getNum()>0);
        
        return this.getNum();
    }
}
