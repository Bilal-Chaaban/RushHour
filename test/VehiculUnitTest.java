import org.junit.Test;

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
        assertEquals(model.getVehicule(), tableau);
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
        assertEquals(model.getVehicule(), tableau);
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
        assertEquals(model.getVehicule(), tableau);
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
        assertEquals(model.getVehicule(), tableau);
    }
}
