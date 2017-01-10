import java.awt.*;
import javax.swing.*;
import java.awt.*;


public class RegleJeu extends JFrame {

    protected JLabel Regle =new JLabel(new ImageIcon("image/Regle.png"));
    protected JPanel panelPano = new JPanel(new GridLayout(1,1));


    public RegleJeu() {

        setVisible(true);
        setSize(600,600);
        setResizable(true);
        setLocationRelativeTo(null);
        creerWidget();
        setTitle("Règles du jeu");

    }

    public void  creerWidget(){

        panelPano.add(Regle);


        setContentPane(panelPano);
    }
}
