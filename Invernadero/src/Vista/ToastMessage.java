/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author saint
 */
class ToastMessage extends JFrame {
   public ToastMessage(final String message) {
      setUndecorated(true);
      setLayout(new GridBagLayout());
      setBackground(new Color(240,240,240,250));
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x, y);
      setSize(300, 50);
      add(new JLabel(message)); 
       
      addComponentListener(new ComponentAdapter() {
         @Override
         public void componentResized(ComponentEvent e) {
            setShape(new  RoundRectangle2D.Double(0,0,getWidth(),
            getHeight(), 20, 20));                      
         }
      });        
   }

   public void display() {
      try {
         setOpacity(1);
         setVisible(true);
         Thread.sleep(2000);

         for (double d = 1.0; d > 0.2; d -= 0.1) {
            Thread.sleep(100);
            setOpacity((float)d);
         }

         setVisible(false);
      }catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
