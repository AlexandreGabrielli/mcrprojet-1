package view;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g){
        //creer un rond
        g.setColor(Color.ORANGE);
        g.fillOval(20, 20, 75, 75);
        g.fillOval(100, 30, 10, 10);

        g.setColor(Color.CYAN);
        g.fillRect(100,100,10,10);
    }


}
