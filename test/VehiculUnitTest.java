import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VehiculUnitTest {

    @Test
    public void testLimiteGauche()  {
        Vehicule voiture = new Voiture(Vehicule.BLEU);
        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{voiture, voiture, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{null,null,null,null,null,null};
        tableau[5]=new Vehicule[]{null,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(voiture,Model.GAUCHE);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void testLimiteDroite()  {
        Vehicule voiture = new Voiture(Vehicule.BLEU);
        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, voiture, voiture};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{null,null,null,null,null,null};
        tableau[5]=new Vehicule[]{null,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(voiture,Model.DROITE);
        assertArrayEquals(model.getVehicule(), tableau);
    }

    @Test
    public void testLimiteHaut()  {
        Vehicule voiture = new Voiture(Vehicule.BLEU);
        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{voiture, null, null, null, null, null};
        tableau[1]=new Vehicule[]{voiture,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{null,null,null,null,null,null};
        tableau[5]=new Vehicule[]{null,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(voiture,Model.HAUT);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void testLimiteBas()  {
        Vehicule voiture = new Voiture(Vehicule.BLEU);
        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{voiture,null,null,null,null,null};
        tableau[5]=new Vehicule[]{voiture,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(voiture,Model.BAS);
        assertArrayEquals(model.getVehicule(), tableau);
    }

    @Test
    public void testVoiturePresenteHaut()  {
        Vehicule bleu = new Voiture(Vehicule.BLEU);
        Vehicule rouge = new Voiture(Vehicule.ROUGE);

        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{rouge,rouge,null,null,null,null};
        tableau[4]=new Vehicule[]{bleu,null,null,null,null,null};
        tableau[5]=new Vehicule[]{bleu,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(bleu,Model.HAUT);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void testVoiturePresenteBas()  {
        Vehicule bleu = new Voiture(Vehicule.BLEU);
        Vehicule rouge = new Voiture(Vehicule.ROUGE);

        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{rouge,null,null, null,null,null};
        tableau[3]=new Vehicule[]{rouge,null,null,null,null,null};
        tableau[4]=new Vehicule[]{bleu,null,null,null,null,null};
        tableau[5]=new Vehicule[]{bleu,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(rouge,Model.BAS);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void testVoiturePresenteGauche()  {
        Vehicule bleu = new Voiture(Vehicule.BLEU);
        Vehicule rouge = new Voiture(Vehicule.ROUGE);

        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{bleu,rouge,rouge,null,null,null};
        tableau[5]=new Vehicule[]{bleu,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(rouge,Model.GAUCHE);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void testVoiturePresenteDroite()  {
        Vehicule bleu = new Voiture(Vehicule.BLEU);
        Vehicule rouge = new Voiture(Vehicule.ROUGE);

        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,rouge,null,null,null};
        tableau[4]=new Vehicule[]{bleu,bleu,rouge,null,null,null};
        tableau[5]=new Vehicule[]{null,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        model.deplacer(bleu,Model.DROITE);
        assertArrayEquals(model.getVehicule(), tableau);
    }


}
