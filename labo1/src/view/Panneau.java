package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
/*        //creer un rond
        g.setColor(Color.ORANGE);
        g.fillOval(20, 20, 75, 75);
        g.fillOval(100, 30, 10, 10);

        g.setColor(Color.CYAN);
        g.fillRect(100,100,10,10);

        //creer un rond
        g.setColor(Color.ORANGE);
        g.fillOval(30, 40, 75, 75);
        g.fillOval(1, 24, 10, 10);*/

        Carre c = new Carre(10, 15, 50, Color.ORANGE);

        c.dessine(g);
    }


}
