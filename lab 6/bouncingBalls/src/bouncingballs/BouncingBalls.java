/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bouncingballs;

import javax.swing.JFrame;

/**
 *
 * @author eng. mahmoud hassan
 */
public class BouncingBalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("bouncing balls");
        f.setContentPane(new bouncingThread());
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
