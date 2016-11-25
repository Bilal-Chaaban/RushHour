
public class Appli {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                Fenetre fenetre=new Fenetre();
                Controller controller=new Controller(fenetre);
                fenetre.setButtonControler(controller);
                fenetre.setVisible(true);

            }
        });
    }
}