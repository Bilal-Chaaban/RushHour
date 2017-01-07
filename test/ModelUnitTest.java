import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by lb685 on 02/12/2016.
 */
public class ModelUnitTest {
    @Test
    public void assesseurModelTest(){
        Model model=new Model(1);
        Vehicule[][] vehicule=new Vehicule[6][6];
        model.setVehicule(vehicule);
        Assert.assertArrayEquals(vehicule,model.getVehicule());
    }
    @Test
    public void initModelTest(){
        Model model=new Model(1);
        Vehicule[][] vehicule=new Vehicule[6][6];
        model.init(1);
        Vehicule bleu=new Voiture(Vehicule.BLEU);
        Vehicule rouge=new Voiture(Vehicule.ROUGE);
        Vehicule[][] v=model.getVehicule();
            v[0]= new Vehicule[]{bleu, null, null, null, null, null};
            v[1]=new Vehicule[]{bleu,null,null,null,null,null};
            v[2]=new Vehicule[]{null,null,rouge,rouge,null,null};
            v[3]=new Vehicule[]{null,null,null,null,null,null};
            v[4]=new Vehicule[]{null,null,null,null,null,null};
            v[5]=new Vehicule[]{null,null,null,null,null,null};
    }
    @Test
    public void limiteGaucheTest()  {
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
        System.out.println(model);
        model.deplacer(voiture,Model.GAUCHE);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void limiteDroiteTest()  {
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
        System.out.println(model);
        model.deplacer(voiture,Model.DROITE);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }

    @Test
    public void limiteHautTest()  {
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
        System.out.println(model);
        model.deplacer(voiture,Model.HAUT);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void limiteBasTest()  {
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
        System.out.println(model);
        model.deplacer(voiture,Model.BAS);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }

    @Test
    public void voiturePresenteHautTest()  {
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
        System.out.println(model);
        model.deplacer(bleu,Model.HAUT);
        assertArrayEquals(model.getVehicule(), tableau);
        System.out.println(model);
    }
    @Test
    public void voiturePresenteBasTest()  {
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
        System.out.println(model);
        model.deplacer(rouge,Model.BAS);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void voiturePresenteGaucheTest()  {
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
        System.out.println(model);
        model.deplacer(rouge,Model.GAUCHE);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void voiturePresenteDroiteTest()  {
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
        System.out.println(model);
        model.deplacer(bleu,Model.DROITE);
        System.out.println(model);
        assertArrayEquals(model.getVehicule(), tableau);
    }
    @Test
    public void deplacementDroiteTest()  {
        Vehicule bleu = new Voiture(Vehicule.BLEU);


        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{bleu,bleu,null,null,null,null};
        tableau[5]=new Vehicule[]{null,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        Vehicule[][] tableau2=new Vehicule[6][6];
        tableau2[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau2[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau2[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau2[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau2[4]=new Vehicule[]{null,bleu,bleu,null,null,null};
        tableau2[5]=new Vehicule[]{null,null,null,null,null,null};
        model.deplacer(bleu,Model.DROITE);

        assertArrayEquals(model.getVehicule(), tableau2);
    }
    @Test
    public void deplacementGaucheTest()  {
        Vehicule bleu = new Voiture(Vehicule.BLEU);


        Vehicule[][] tableau=new Vehicule[6][6];
        tableau[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau[4]=new Vehicule[]{null,bleu,bleu,null,null,null};
        tableau[5]=new Vehicule[]{null,null,null,null,null,null};
        Model model = new Model(1);

        model.setVehicule(tableau);
        Vehicule[][] tableau2=new Vehicule[6][6];
        tableau2[0]= new Vehicule[]{null, null, null, null, null, null};
        tableau2[1]=new Vehicule[]{null,null,null,null,null,null};
        tableau2[2]=new Vehicule[]{null,null,null, null,null,null};
        tableau2[3]=new Vehicule[]{null,null,null,null,null,null};
        tableau2[4]=new Vehicule[]{bleu,bleu,null,null,null,null};
        tableau2[5]=new Vehicule[]{null,null,null,null,null,null};
        model.deplacer(bleu,Model.GAUCHE);

        assertArrayEquals(model.getVehicule(), tableau2);
    }
    @Test
    public void printTest(){
        Model model=new Model(1);
        Vehicule[][] vehicule=new Vehicule[6][6];
        Vehicule bleu=new Voiture(Vehicule.BLEU);
        Vehicule rouge=new Voiture(Vehicule.ROUGE);
        vehicule[0]= new Vehicule[]{bleu, null, null, null, null, null};
        vehicule[1]=new Vehicule[]{bleu,null,null,null,null,null};
        vehicule[2]=new Vehicule[]{null,null,rouge,rouge,null,null};
        vehicule[3]=new Vehicule[]{null,null,null,null,null,null};
        vehicule[4]=new Vehicule[]{null,null,null,null,null,null};
        vehicule[5]=new Vehicule[]{null,null,null,null,null,null};
        model.setVehicule(vehicule);
        System.out.println(model);
    }

    @Test
    public void positionTest(){
        Model model=new Model(1);
        Vehicule[][] vehicule=new Vehicule[6][6];
        Vehicule bleu=new Voiture(Vehicule.BLEU);
        Vehicule rouge=new Voiture(Vehicule.ROUGE);
        Vehicule[][] v=model.getVehicule();
        v[0]= new Vehicule[]{bleu, null, null, null, null, null};
        v[1]=new Vehicule[]{bleu,null,null,null,null,null};
        v[2]=new Vehicule[]{null,null,rouge,rouge,null,null};
        v[3]=new Vehicule[]{null,null,null,null,null,null};
        v[4]=new Vehicule[]{null,null,null,null,null,null};
        v[5]=new Vehicule[]{null,null,null,null,null,null};

    }


}
