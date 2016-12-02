/**
 * Created by lb685 on 01/12/2016.
 */
public class Camion extends Vehicule {
    public Camion(int couleur) {
        super(couleur);
        taille=3;
    }
    public boolean isCamion() {
        return true;
    }


}
