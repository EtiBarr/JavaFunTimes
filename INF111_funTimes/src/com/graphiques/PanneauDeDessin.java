/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package INF111_funTimes.src.com.graphiques;

import java.awt.Graphics;
import javax.swing.JPanel;

import INF111_funTimes.src.com.composants.Cercle;

/**
 *
 * @author Usager
 */
public class PanneauDeDessin extends JPanel {

    // Représente un cercle avec ces données graphiques (pour le dessin)
    CercleGraphique gCercle;

    /**
     * Méthode appelée pour faire l'affichage graphique (le dessin) du paneau
     *
     */
    @Override
    public void paintComponent(Graphics g) {
        //Appel de paint() de la classe mère, nécessaire pour dessiner le panneau.
        super.paintComponent(g);
        gCercle.dessine(g);

    }

    public CercleGraphique gCercle() {
        return gCercle;
    }

    public void setGCercle(CercleGraphique gCercle) {
        this.gCercle = gCercle;
    }

}
