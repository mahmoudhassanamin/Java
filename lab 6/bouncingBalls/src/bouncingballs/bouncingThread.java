/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bouncingballs;

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
public class bouncingThread extends JPanel implements Runnable{
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int r;
    public bouncingThread(){
        this.setBackground(Color.ORANGE);
        new Thread(this).start();
        x=11;
        y=11;
        dx=10;
        dy=10;
        r=20;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if((x+r+4)>=this.getWidth()||(x-(r/2))<=0){
            dx*=-1;
        }
        if((y+r+4)>=this.getHeight()||(y-r/2)<=0){
            dy*=-1;
        }
        g.setColor(Color.RED);
        g.fillOval(x, y, r, r);
        g.drawOval(x, y, r, r);
    }
    
    @Override
    public void run() {
        try {
            while (true) {                
                repaint();
                sleep(200);
                x+=dx;
                y+=dy;
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("an UnsupportedOperationException happen");
        } catch (InterruptedException ex) {
            Logger.getLogger(bouncingThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
