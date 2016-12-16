import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quent on 25/11/2016.
 */
public class Controller implements ActionListener {
    protected Fenetre fenetre;
    private Chrono chrono;
    protected Model model;
    public Controller(Fenetre f){
        fenetre=f;
        chrono=new Chrono(fenetre.getChrono());
    }
    public void setModel(Model m){
        model=m;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("test");
       //fenetre.setVisible(false);
        if (e.getSource()==fenetre.getBouton1()){
            fenetre.creerMenuJouer();
            fenetre.creerMenu2();
        }
        if (e.getSource()==fenetre.getJouer()[0]) {
            fenetre.creerJouer();
            chrono.start();
        }
        if (fenetre.nouvellePartie==(e.getSource())){
            chrono.stopChrono();
            chrono=new Chrono(fenetre.chrono);
            fenetre.creerMenuJouer();
        }
        if (fenetre.menuPrincipale==e.getSource()){
            System.out.println("test");
            fenetre.creerMenu();

        }
        Vehicule v=null;
        int k=0,l=0;
        JButton[][] tabBouton=fenetre.getTabBoutonvehicule();
        for (int i = 0; i < tabBouton.length; i++) {
            for (int j = 0; j < tabBouton[0].length; j++) {
                if (e.getSource()==tabBouton[i][j]){
                    v=model.getVehiculeIndex(i,j);
                    k=i;
                    l=j;
                }
            }
        }
        if (v!=null){
            if(k<5){
                if (v==model.getVehiculeIndex(k+1,l))
                    model.deplacer(v,Model.HAUT);

            }
            if (k>0){
                if (v==model.getVehiculeIndex(k-1,l))
                    model.deplacer(v,Model.BAS);
            }
            if (l<5){
                if (v==model.getVehiculeIndex(k,l+1))
                    model.deplacer(v,Model.GAUCHE);
            }
            if (l>0){
                if (v==model.getVehiculeIndex(k,l-1))
                    model.deplacer(v,Model.DROITE);
            }
            System.out.println(model);
            fenetre.niveau(1,model);

        }
        fenetre.setVisible(true);
    }
}
