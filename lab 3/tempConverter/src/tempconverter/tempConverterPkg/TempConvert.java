/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tempconverter.tempConverterPkg;
import java.util.function.Function;
/**
 *
 * @author eng. mahmoud hassan
 */
public class TempConvert implements Function<Float,Double>
{
    @Override
    public Double apply(Float tempCeil){
        return (1.8*tempCeil)+32;
    }
}
