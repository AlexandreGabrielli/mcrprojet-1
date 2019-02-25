package view;

import javax.swing.JFrame;
//import java.awt.*;


public class Fenetre extends JFrame {

    private Panneau panneau;

    Fenetre() {
        this.setSize(500,200);      //taille de la fenetre
        this.setTitle("Labo1a");                  //met un titre à la fenetre

        this.setLocation(500,500);          //met la fenetre pas au bord de l'écran
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //fermeture de la fenetre
        this.setVisible(true);                     //rend la fenetre affichable


        this.panneau = new Panneau();               //creation d'un panel
        this.setContentPane(this.panneau);          //attachement du panel

    }

    /**
     *
     * fonction permetant de tester la fenetre.
     */
    public static void main(String[] args) {
       Fenetre f = new Fenetre();

    }


}
