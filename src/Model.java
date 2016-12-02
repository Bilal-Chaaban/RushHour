/**
 * Created by lb685 on 02/12/2016.
 */
public class Model {

    private Vehicule[][] vehicule =new Vehicule[6][6];

    public static final int HAUT=7;
    public static final int BAS=8;
    public static final int GAUCHE=9;
    public static final int DROITE=10;

    public Model(int niveau){
        init(niveau);
    }

    public boolean isNull(int i,int j){
        return vehicule[i][j]==null;
    }

    public int[] getPosition(Vehicule v){
        int[] tab=new int[2];
        for (int i = 5; i >=0 ; i++) {
            for (int j = 0; j < 6; j++) {
                if (v.equals(vehicule[i][j])){
                    tab[0]=i;
                    tab[1]=j;
                }
            }
        }
        return tab;
    }

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

    public String toString(){
        String ret="";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (vehicule[i][j] == null) {
                    ret+="| ";
                }else {
                    ret+="|"+vehicule[i][j].getCouleur();
                }
            }
            ret+="\n";
        }
        return ret;
    }
}
