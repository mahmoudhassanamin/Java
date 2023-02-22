/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcomparison;
import java.util.function.BiPredicate;
/**
 *
 * @author eng. mahmoud hassan
 */
public class StringComparison {
    public static String betterString(String str1,String str2,BiPredicate<String,String> p){
        if(p.test(str1, str2))
            return str1;
        else 
            return str2;
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s1=new String("c");
       String s2=new String("b");
       String longer_string=StringComparison.betterString(s1,s2,(str1,str2)->str1.compareTo(str2) == 1);
        System.out.println(longer_string);
        
     

                
    }
    
}
