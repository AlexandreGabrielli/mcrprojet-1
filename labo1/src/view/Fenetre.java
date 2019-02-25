package view;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {


    Fenetre() {
        //taille de la fenetre
        this.setSize(500,200);
        //met un titre à la fenetre
        this.setTitle("Bouncers");
        //rend la fenenetre resisable (par defaut??)
        //this.setResizable(true);
        //met la fenetre pas au bord de l'écran
        this.setLocation(500,500);
        //fermeture de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creation d'un panel
        Panneau panel = new Panneau();

        //attachement du panel
        this.setContentPane(panel);


        //rend la fenetre affichable
        this.setVisible(true);
    }

    /**
     *
     * class permetant de tester la fenetre.
     */
    public static void main(String[] args) {
       Fenetre f = new Fenetre();

    }




}
