/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepionhandling;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/**
 *
 * @author eng. mahmoud hassan
 */
public class ExcepionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyMethods obj = new MyMethods();
      
        try {
//            Exception cases
//            obj.method1("another name is not mahmoud");
//            obj.method2(11); // must be 10 only is passed to method2
//            obj.method3(false); // must be true is passed to method3

            obj.method1("mahmoud");
            obj.method2(10);
            obj.method3(true);
        } catch (NewException ex) {
            ex.printStackTrace();
        }
    }
    
}
