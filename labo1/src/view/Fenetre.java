

import javax.swing.*;

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

        //creation d'un panel
        JPanel panel = new JPanel();

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
