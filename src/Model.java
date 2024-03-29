import java.io.*;

/**
 * Created by lb685 on 02/12/2016.
 */
public class Model {

    public static final int HAUT = 7;
    public static final int BAS = 8;
    public static final int GAUCHE = 9;
    public static final int DROITE = 10;
    private Vehicule[][] vehicule = new Vehicule[6][6];

    public Model(int niveau) {
        init(niveau);
    }

    public boolean isNull(int i, int j) {

        if (i < 0 || i > 5 || j < 0 || j > 5) {
            return false;
        }
        return vehicule[i][j] == null;
    }

    public void deplacer(Vehicule v, int direction) {
        int[] position = getPosition(v);
        if ((direction == GAUCHE && position[1] != 0)) {
            if (isNull(position[0], position[1] - 1)) {
                vehicule[position[0]][position[1] - 1] = v;
                vehicule[position[0]][position[1] + v.taille - 1] = null;
            }
        }
        if ((direction == DROITE && position[1] < (5 - v.taille + 1))) {
            if (isNull(position[0], position[1] + v.taille)) {
                vehicule[position[0]][position[1] + v.taille] = v;
                vehicule[position[0]][position[1]] = null;
            }
        }
        if ((direction == BAS && position[0] < (5 - v.taille + 1))) {
            if (isNull(position[0] + v.taille, position[1])) {
                vehicule[position[0] + v.taille][position[1]] = v;
                vehicule[position[0]][position[1]] = null;
            }
        }
        if ((direction == HAUT && position[0] != 0)) {
            if (isNull(position[0] - 1, position[1])) {

                vehicule[position[0] - 1][position[1]] = v;
                vehicule[position[0] + v.taille - 1][position[1]] = null;
            }
        }
    }


    public int[] getPosition(Vehicule v) {
        int[] tab = new int[2];
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                if (v.equals(vehicule[i][j])) {
                    tab[0] = i;
                    tab[1] = j;
                }
            }
        }
        return tab;
    }

    public Vehicule[][] getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule[][] vehicule) {
        this.vehicule = vehicule;
    }

    public Vehicule getVehiculeIndex(int i,int j){
        if (vehicule[i][j]!=null){
            return vehicule[i][j];
        }
        return null;
    }

    public void init(int niveau) {
        //lecture dans un fichier la position des vehicule en fct du niv passer en param

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vehicule[i][j] = null;
            }
        }
        try {
            loadBin("niveau"+niveau);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (vehicule[i][j] == null) {
                    ret += "| ";
                } else {
                    ret += "|" + vehicule[i][j].getCouleur();
                }
            }
            ret += "|\n";
        }
        return ret;
    }

    public void saveBin(String fileName) throws IOException {
        ObjectOutputStream oos = null;
        FileOutputStream file = new FileOutputStream(fileName);
        oos = new ObjectOutputStream(file);
        oos.writeObject(vehicule);
    }
    public void loadBin(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = null;
        FileInputStream file = new FileInputStream(fileName);
        ois = new ObjectInputStream(file);
        if (ois!=null) vehicule= (Vehicule[][]) ois.readObject();
    }

}