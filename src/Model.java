/**
 * Created by lb685 on 02/12/2016.
 */
public class Model {

    private Vehicule[][] vehicule;

    public void setVehicule(Vehicule[][] vehicule) {
        this.vehicule=vehicule;
    }

    public Vehicule[][] getVehicule() {
        return vehicule;
    }

    public void init(int niveau) {
        //lecture dans un fichier la position des vehicule en fct du niv passer en param
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vehicule[i][j]=null;
            }
        }
    }
}
