package view;

import java.awt.Color;
import java.awt.Graphics;

public class Carre implements Forme{

    private int hauteur, largeur;
    private int x, y;
    private Color couleur;

    public Carre (int x, int y, int cote, Color c) {
        this.x = x;
        this.y = y;

        this.hauteur = cote;
        this.largeur = cote;

        this.couleur = c;
    }

    public void dessine (Graphics g) {
        g.setColor(couleur);
        g.fillRect(x, y, largeur, hauteur);
    }
}
