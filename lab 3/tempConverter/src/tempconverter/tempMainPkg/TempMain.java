/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempconverter.tempMainPkg;
import tempconverter.tempConverterPkg.*;
/**
 *
 * @author eng. mahmoud hassan
 */
public class TempMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x= 10;
        System.out.println("temperature in Celsius = "+x+" °C"+" but in Fahrenheit = "+new TempConvert().apply(x)+" °F");
    }
    
}
