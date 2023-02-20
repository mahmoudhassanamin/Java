/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generics1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author eng. mahmoud hassan
 */
public class Generics1 {

    public static void drawShapes (List<?extends Shape> elm){
        for(Shape s : elm){
            s.draw();
        }
    }
    public static void main(String[] args) {
        List<Rectangle> R = new ArrayList<Rectangle>();
        R.add(new Rectangle());
        R.add(new Rectangle());
        
        List<Circle> C = new ArrayList<Circle>();
        C.add(new Circle());
        C.add(new Circle());
        
        drawShapes(C);
        drawShapes(R);
        String x ="dd";
        // drawShapes(x); // error because x is incompatible types
    }
    
}
