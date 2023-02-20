/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepionhandling;

/**
 *
 * @author eng. mahmoud hassan
 */
public class MyMethods {
    public void method1 (String s)throws NewException{
        if (s.equals("mahmoud")){
            System.out.println("hay mahmoud");
        }
        else {
            throw new NewException("enter the correct Name");
        }
    }
    public void method2 (Integer s)throws NewException{
        if (s == 10){
            System.out.println("it is ok");
        }
        else {
            throw new NewException("enter the correct Number");
        }
    }
    public void method3 (Boolean s)throws NewException{
        if (s){
            System.out.println("it is True ya bro");
        }
        else {
            throw new NewException("the argument must be true");
        }
    }
}
