import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quent on 25/11/2016.
 */
public class Controller implements ActionListener {
    protected Fenetre fenetre;
    private Chrono chrono;

    public Controller(Fenetre f){
        fenetre=f;
        chrono=new Chrono(fenetre.getChrono());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("test");
        fenetre.setVisible(false);
        if (e.getSource()==fenetre.getBouton1()){
            fenetre.creerMenuJouer();
        }
        if (e.getSource()==fenetre.getJouer()[0]) {
            fenetre.creerJouer();
            fenetre.creerMenu2();
            chrono.start();
        }
        if (fenetre.nouvellePartie.equals(e.getSource())){
            chrono.stopChrono();
            chrono=new Chrono(fenetre.chrono);
            fenetre.creerMenuJouer();
        }
        fenetre.setVisible(true);
    }


}
