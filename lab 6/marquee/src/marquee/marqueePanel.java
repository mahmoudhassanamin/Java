/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquee;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author eng. mahmoud hassan
 */
public class marqueePanel extends JPanel implements Runnable{
    private int x;
    public marqueePanel(){
        this.setBackground(Color.GRAY);
        x=0;
        new Thread(this).start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(x>this.getWidth()){
                x=-22;
        }
        g.drawString("Hello", x, (this.getHeight()/2));
    }
    @Override 
    public void run() {
        while (true) { 
        try {
            repaint();
            sleep(1000);  
            x+=12;
        } catch (UnsupportedOperationException e) {
            System.err.println("an UnsupportedOperationException happen");
        }catch (InterruptedException ex) {
            Logger.getLogger(marqueePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    }

    
    
}
