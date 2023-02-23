/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marquee;

import javax.swing.JFrame;

/**
 *
 * @author eng. mahmoud hassan
 */
public class Marquee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello");
        f.setContentPane(new marqueePanel());
        f.setSize(500,400);
        f.setVisible(true);
    }
    
}
