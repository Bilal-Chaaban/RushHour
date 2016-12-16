import java.io.IOException;

/**
 * Created by valenza-manjaro on 09/12/16.
 */
public class tmpModel {


    public static void main(String[] args) {
        Model model = new Model(1);
        Voiture v1 = new Voiture(Vehicule.BLEU);
        Voiture v2 = new Voiture(Vehicule.ORANGE);
        Voiture v3 = new Voiture(Vehicule.BRUN);
        Voiture v4 = new Voiture(Vehicule.JAUNE);
        Camion  c1 = new Camion(Vehicule.VIOLET);
        Camion  c2 = new Camion(Vehicule.BRUN);
        Camion  c3 = new Camion(Vehicule.ROUGE);
        Camion  c4 = new Camion(Vehicule.VERT);
        Vehicule[][] tab = new Vehicule[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tab[i][j]=null;
            }
        }
        tab[0][0] = v1;
        tab[0][1] = v1;

        tab[2][1] = v2;
        tab[2][2] = v2;

        tab[4][0] = v3;
        tab[5][0] = v3;

        tab[4][4] = v4;
        tab[4][5] = v4;

        tab[1][0] = c1;
        tab[2][0] = c1;
        tab[3][0] = c1;

        tab[1][3] = c2;
        tab[2][3] = c2;
        tab[3][3] = c2;

        tab[0][5] = c3;
        tab[1][5] = c3;
        tab[2][5] = c3;

        tab[5][2] = c4;
        tab[5][3] = c4;
        tab[5][4] = c4;
        model.setVehicule(tab);
        System.out.println(model);
        try {
            model.saveBin("niveau1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Model m2 = new Model(2);
        try {
            m2.loadBin("niveau1");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(m2);
        Fenetre fenetre = new Fenetre();
        Controller controller=new Controller(fenetre);
        fenetre.setModel(m2);
        controller.setModel(m2);
        fenetre.niveau(1,m2);
        fenetre.setButtonControler(controller);
    }

}
