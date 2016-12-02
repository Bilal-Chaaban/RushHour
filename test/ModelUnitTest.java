import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lb685 on 02/12/2016.
 */
public class ModelUnitTest {
    @Test
    public void assesseurModelTest(){
        Model model=new Model();
        Vehicule[][] vehicule=new Vehicule[6][6];
        model.setVehicule(vehicule);
        Assert.assertArrayEquals(vehicule,model.getVehicule());
    }
    @Test
    public void initModelTest(){
        Model model=new Model();
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
    public void printTest(){
        Model model=new Model();
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
        System.out.println(model);
    }

}
