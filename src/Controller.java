import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quent on 25/11/2016.
 */
public class Controller implements ActionListener {
    protected Fenetre fenetre;
    protected Model model;
    private Chrono chrono;

    public Controller(Fenetre f) {
        fenetre = f;
        chrono = new Chrono(fenetre.getChrono());
    }

    public void setModel(Model m) {
        model = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fenetre.getBouton1()) {
            fenetre.creerMenuJouer();
            fenetre.creerMenu2();
        }
        if (e.getSource() == fenetre.getJouer()[0]) {
            fenetre.creerJouer();
            chrono.start();
        }
        if (fenetre.nouvellePartie == (e.getSource())) {
            chrono.stopChrono();
            chrono = new Chrono(fenetre.chrono);
            fenetre.creerMenuJouer();
        }
        if (fenetre.menuPrincipale == e.getSource()) {
            fenetre.creerMenu();
        }

        if (fenetre.reset == e.getSource()){

        }

        Vehicule v = null;
        int k = 0, l = 0;
        JButton[][] tabBouton = fenetre.getTabBoutonvehicule();
        for (int i = 0; i < tabBouton.length; i++) {
            for (int j = 0; j < tabBouton[0].length; j++) {
                if (e.getSource() == tabBouton[i][j]) {
                    v = model.getVehiculeIndex(i, j);
                    k = i;
                    l = j;
                }
            }
        }
        if (v != null) {
            boolean valide = true;
            if (v.isVoiture()) {
                if (k < 5) {
                    if (v == model.getVehiculeIndex(k + 1, l) && valide) {
                        model.deplacer(v, Model.HAUT);
                        valide = false;

                    }

                } else if (k > 0) {
                    if (v == model.getVehiculeIndex(k - 1, l) && valide) {
                        model.deplacer(v, Model.BAS);
                        valide = false;

                    }
                }
                if (l < 5) {
                    if (v == model.getVehiculeIndex(k, l + 1) && valide) {
                        model.deplacer(v, Model.GAUCHE);
                        valide = false;
                    }
                }
                if (l > 0) {
                    if (v == model.getVehiculeIndex(k, l - 1) && valide)
                        model.deplacer(v, Model.DROITE);
                    valide = false;
                }


            } else {
                if (k < 4) {
                    if (v == model.getVehiculeIndex(k + 2, l) && valide) {
                        model.deplacer(v, Model.HAUT);
                        valide = false;

                    }

                }
                if (k > 1) {
                    if (v == model.getVehiculeIndex(k - 2, l) && valide) {
                        model.deplacer(v, Model.BAS);
                        valide = false;

                    }
                }
                if (l < 4) {
                    if (v == model.getVehiculeIndex(k, l + 2) && valide) {
                        model.deplacer(v, Model.GAUCHE);
                        valide = false;
                    }
                }
                if (l > 1) {
                    if (v == model.getVehiculeIndex(k, l - 2) && valide) {
                        model.deplacer(v, Model.DROITE);
                        valide = false;
                    }
                }
            }

            fenetre.niveau(1, model);
            fenetre.affiche();
            fenetre.setButtonControler(this);
        }

        fenetre.setVisible(true);
    }

}
