/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadrequationroots.calRoots;
import static java.lang.Math.*;  
/**
 *
 * @author eng. mahmoud hassan
 */
public class CalRoots {
    public static void calRoots(float a,float b ,float c){
        if (a == 0)   
        {  
            System.out.println("The value of a cannot be 0.");  
            return;  
        }  

        float d = b * b - 4 * a * c;  
        double sqrtval = sqrt(abs(d));  
        if (d > 0)   
        {  
        System.out.println("The roots of the equation are real and different. \n");  
        System.out.println((float)(-b + sqrtval) / (2 * a) + "\n"+(-b - sqrtval) / (2 * a));  
        }  
        else if (d == 0)   
        {  
        System.out.println("The roots of the equation are real and same. \n");  
        System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
        }  
        // executes if d < 0  
        else   
        {  
        System.out.println("The roots of the equation are complex and different. \n");  
        System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
        }  
    }
}
