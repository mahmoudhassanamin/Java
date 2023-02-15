/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package quadrequationroots.mainCalRoots;
import java.util.Scanner;
import quadrequationroots.calRoots.CalRoots;
/**
 *
 * @author eng. mahmoud hassan
 */
public class MainCalRoots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter operator a : ");
        a=obj.nextFloat();
        System.out.println("enter operator b : ");
        b=obj.nextFloat();
        System.out.println("enter operator c : ");
        c=obj.nextFloat();
        CalRoots.calRoots(a, b, c);
        
    }
    
}
