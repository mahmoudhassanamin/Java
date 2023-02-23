/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec.pkg6;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eng. mahmoud hassan
 */
public class MyClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("mahmoud hassan's Clock");
        myFrame.setContentPane(new MyPanel("Clock"));
        myFrame.setSize(1000,300);
        myFrame.setVisible(true);
        
    }
    
}
