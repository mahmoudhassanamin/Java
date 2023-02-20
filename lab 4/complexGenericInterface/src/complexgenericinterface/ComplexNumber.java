/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package complexgenericinterface;
import java.math.BigDecimal;
/**
 *
 * @author eng. mahmoud hassan
 * @param <R>
 * @param <I>
 */
public class ComplexNumber<R extends Double,I extends Double> implements ComplexOperations<R,I>{
    private R r;
    private I i;
    
    public ComplexNumber(R real,I img){
        r=real;
        i=img;
    }
    @Override
    public R getReal() {
        return r;
    }

    @Override
    public I getImg() {
        return getI();
    }

    @Override
    public void setReal(R real) {
        r=real;
    }

    @Override
    public void setImg(I img) {
        i=img;
    }

    /**
     * @return the i
     */
    public I getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(I i) {
        this.i = i;
    }
    @Override
    public String getString(){
        return r.toString()+"+"+i.toString()+"i";
    }
    
}
