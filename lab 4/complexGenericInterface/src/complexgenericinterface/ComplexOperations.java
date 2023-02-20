/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexgenericinterface;

import java.math.BigDecimal;



/**
 *
 * @author eng. mahmoud hassan
 * @param <R>
 * @param <I>
 */
public interface ComplexOperations<R extends Double,I extends Double> {
    R getReal();
    I getImg();
    void setReal(R r);
    void setImg(I i);
    String getString();
    
}
