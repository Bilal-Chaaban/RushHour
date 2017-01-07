import java.io.IOException;

/**
 * Created by valenza-manjaro on 09/12/16.
 */
public class tmpModel {


    public static void main(String[] args) {
        int X = 1;
        Model model = new Model(X);
        Voiture v1 = new Voiture(Vehicule.BLEU);
        Voiture v2 = new Voiture(Vehicule.ORANGE);
        Voiture v3 = new Voiture(Vehicule.BRUN);
        Voiture v4 = new Voiture(Vehicule.JAUNE);
        Voiture v5 = new Voiture(Vehicule.ROUGE);
        Voiture v6 = new Voiture(Vehicule.VERT);
        Voiture v7 = new Voiture(Vehicule.VIOLET);

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
    /*   // Niveau 1
        tab[0][0] = v1;
        tab[0][1] = v1;

        tab[2][1] = v5;
        tab[2][2] = v5;

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


        // Niveau 2
        tab[0][1] = v1;
        tab[1][1] = v1;

        tab[0][2] = v2;
        tab[0][3] = v2;

        tab[0][4] = v3;
        tab[1][4] = v3;

        tab[0][5] = v4;
        tab[1][5] = v4;

        tab[2][1] = v5;
        tab[2][2] = v5;

        tab[1][3] = v6;
        tab[2][3] = v6;

        tab[2][5] = v7;
        tab[3][5] = v7;




      //Niveau 3
        tab[0][0] = v1;
        tab[1][0] = v1;

        tab[0][1] = v2;
        tab[0][2] = v2;

        tab[2][0] = v5;
        tab[2][1] = v5;

        tab[4][4] = v4;
        tab[5][4] = v4;

        tab[1][2] = c1;
        tab[2][2] = c1;
        tab[3][2] = c1;

        tab[0][5] = c2;
        tab[1][5] = c2;
        tab[2][5] = c2;

        tab[3][3] = c3;
        tab[3][4] = c3;
        tab[3][5] = c3;

        tab[5][0] = c4;
        tab[5][1] = c4;
        tab[5][2] = c4;
*//*
       // Nveau 4
        tab[0][2] = v1;
        tab[1][2] = v1;

        tab[0][3] = v2;
        tab[0][4] = v2;

        tab[2][1] = v3;
        tab[3][1] = v3;

        tab[2][2] = v5;
        tab[2][3] = v5;


        tab[1][4] = v6;
        tab[2][4] = v6;

        tab[3][2] = v7;
        tab[3][3] = v7;

        tab[3][4] = v4;
        tab[4][4] = v4;

        tab[4][1] = c1;
        tab[4][2] = c1;
        tab[4][3] = c1;
*//*
     //Niveau 5

          tab[0][0] = v1;
        tab[1][0] = v1;

        tab[1][1] = v2;
        tab[1][2] = v2;

        tab[2][0] = v5;
        tab[2][1] = v5;

        tab[4][4] = v4;
        tab[5][4] = v4;

        tab[4][2] = v3;
        tab[5][2] = v3;

        tab[1][3] = v6;
        tab[2][3] = v6;

        tab[3][4] = v7;
        tab[4][4] = v7;

        tab[0][3] = c1;
        tab[0][4] = c1;
        tab[0][5] = c1;

        tab[2][5] = c2;
        tab[3][5] = c2;
        tab[4][5] = c2;

        tab[5][3] = c3;
        tab[5][4] = c3;
        tab[5][5] = c3;


        //Niveau 6

        tab[0][0] = v1;
        tab[1][0] = v1;

        tab[0][1] = v7;
        tab[0][2] = v7;

        tab[1][1] = v2;
        tab[1][2] = v2;

        tab[2][0] = v5;
        tab[2][1] = v5;

        tab[2][2] = v4;
        tab[3][2] = v4;

        tab[4][2] = v3;
        tab[5][2] = v3;

        tab[3][3] = v6;
        tab[3][4] = v6;

        tab[0][3] = c1;
        tab[1][3] = c1;
        tab[2][3] = c1;

        tab[2][5] = c2;
        tab[3][5] = c2;
        tab[4][5] = c2;

        tab[5][3] = c3;
        tab[5][4] = c3;
        tab[5][5] = c3;
*/
        model.setVehicule(tab);
        System.out.println(model);
       /* try {
            model.saveBin("niveau"+X);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Model m2 = new Model(X);
        try {
            m2.loadBin("niveau"+X);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(m2);
        //m2.deplacer(c3,Model.BAS);
        //System.out.println(m2);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Fenetre fenetre = new Fenetre();
                Controller controller = new Controller(fenetre);
                fenetre.setModel(m2);
                controller.setModel(m2);
                fenetre.niveau(X);
                fenetre.setButtonControler(controller);
                fenetre.menuReset();

            }
        });

    }

}
