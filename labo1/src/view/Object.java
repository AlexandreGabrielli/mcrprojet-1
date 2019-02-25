package view;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Object extends JComponent {
    Color color;
    static Random rand = new Random();
    int taille;
    int positionX;
    int positionY;
    private static Dimension limite;

    Object(){
        taille = rand.nextInt(40) + 10;
        positionX = rand.nextInt(250);
        positionY = rand.nextInt(250);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
    }

    public void uptdateLimite(Dimension dimension){
        limite = dimension;
    }



}
