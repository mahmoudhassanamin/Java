/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexgenericinterface;

import java.math.BigDecimal;

/**
 *
 * @author eng. mahmoud hassan
 */
public class ComplexGenericInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComplexNumber<Double,Double> myCom1 = new ComplexNumber<Double,Double>(3.0,4.0);
        System.out.println(myCom1.getString());
    }
    
}
