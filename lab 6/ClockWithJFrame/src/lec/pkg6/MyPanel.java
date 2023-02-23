/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec.pkg6;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author eng. mahmoud hassan
 */
public class MyPanel extends JPanel implements Runnable{
    private String panel_name ;
    public MyPanel(String name){
        panel_name =name;
        this.setBackground(Color.GRAY);
        new Thread(this).start();
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toString(),400 ,50);
    }
    @Override
    public void run() {
        while (true) {            
            try {
                repaint();
                sleep(1000);
            } catch (UnsupportedOperationException e) {
                System.out.println("an UnsupportedOperationException happen");
            } catch (InterruptedException ex) {
                Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
