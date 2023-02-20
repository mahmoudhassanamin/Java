/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempconverterbyinnerclass;
import java.util.function.Function;
/**
 *
 * @author eng. mahmoud hassan
 */
public class TempConverterByInnerClass {
    public static void main(String[] args) {
        
        float temp_ceil = 10;
       
        Double temp_fehren = new Function<Float,Double>(){
            @Override
            public Double apply (Float temp){
               return (1.8*temp)+32;
            }    
        }.apply(temp_ceil);
         System.out.println("temperature in Celsius = "+temp_ceil+" °C"+" but in Fahrenheit = "+temp_fehren+" °F");
    }
    
}
