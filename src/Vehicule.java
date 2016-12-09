import java.io.Serializable;
import java.util.Objects;

/**
 * Created by lb685 on 01/12/2016.
 */
public abstract class Vehicule implements Serializable {
    protected int couleur;
    protected int taille;
    public static final int BLEU=0;
    public static final int VERT=1;
    public static final int ROUGE=2;
    public static final int JAUNE=3;
    public static final int ORANGE=4;
    public static final int VIOLET=5;
    public static final int BRUN=6;

    public boolean equals(Vehicule v){
        if (this==null||v==null){
            return false;
        }
        if (v.isVoiture()&&this.isVoiture()){
            return v.couleur==this.couleur;
        }else if (v.isCamion()&&this.isCamion()){
            return v.couleur==this.couleur;
        }else return false;
    }
    public Vehicule(int couleur){
        this.couleur=couleur;
    }


    public int getCouleur() {
        return couleur;
    }

    public boolean isVoiture() {
        return false;
    }
    public boolean isCamion() {
        return false;
    }
}
