import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VehiculUnitTest {
    @Test
    public void isCamionTest(){
        Vehicule c=new Camion(Vehicule.BLEU);
        Assert.assertTrue(c.isCamion());
    }
    @Test
    public void isVoitureTest(){
        Vehicule v=new Voiture(Vehicule.BLEU);
        Assert.assertTrue(v.isVoiture());
    }
    @Test
    public void isNotCamionTest(){
        Vehicule v=new Voiture(Vehicule.BLEU);
        Assert.assertFalse(v.isCamion());
    }
    @Test
    public void isNotVoitureTest(){
        Vehicule c=new Camion(Vehicule.BLEU);
        Assert.assertFalse(c.isVoiture());
    }



}
