/**
 * Created by lb685 on 01/12/2016.
 */
public abstract class Vehicule {
    protected int couleur;
    public static final int BLEU=0;
    public static final int VERT=1;
    public static final int ROUGE=2;
    public static final int JAUNE=3;
    public static final int ORANGE=4;
    public static final int VIOLET=5;
    public static final int BRUN=6;

    public static final int HAUT=7;
    public static final int BAS=8;
    public static final int GAUCHE=9;
    public static final int DROITE=10;
    public Vehicule(int couleur){
        this.couleur=couleur;
    }
    abstract void deplacer(int direction);

    public int getCouleur() {
        return couleur;
    }
}
