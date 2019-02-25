package view;

import java.awt.*;

public class Cercle extends Object {

    Cercle() {
        //tout les cercles sont de couleurs orange.
        this.color = Color.ORANGE;

    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(positionX, positionY, taille, taille);

    }
}
