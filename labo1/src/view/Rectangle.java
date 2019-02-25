package view;

import java.awt.*;

public class Rectangle extends Object {

    Rectangle(){
        //tout les rectangles sont de couleurs bleu.
        this.color = Color.BLUE;
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillRect(positionX, positionY, taille, taille);
    }
}
