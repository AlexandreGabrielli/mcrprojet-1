package view;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    Dimension dimension;

    public void setSize() {
        dimension = this.getSize();
    }

    public void paintComponent(Graphics g) {
        //TODO : faire une liste de composant trier par taille

        Rectangle rectangle = new Rectangle();
        rectangle.paint(g);
        Cercle cercle = new Cercle();
        cercle.paint(g);
    }


}
