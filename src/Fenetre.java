import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame{
    protected JPanel panelBouton = new JPanel(new GridLayout(4, 1, 2, 10));
    protected JPanel panelPrincipale = new JPanel();
    protected JButton bouton1 = new JButton(new ImageIcon("image/Boutton_Jouer.png"));
    protected JButton bouton2 = new JButton(new ImageIcon("image/Boutton_Option.png"));
    protected JButton bouton3 = new JButton(new ImageIcon("image/Boutton_Score.png"));
    protected JButton bouton4 = new JButton(new ImageIcon("image/Boutton_Aide.png"));

    protected JButton[] jouer=new JButton[10];
    protected JPanel panelBoutonJouer = new JPanel(new GridLayout(4, 3, 2, 10));



    protected JLabel chrono=new JLabel("0.00");

    protected JLabel t = new JLabel("RUSH HOUR");
    public Fenetre(){
        setSize(400,590);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Rush Hour");
        creerMenu();
        for (int i = 0; i < 10; i++) {
            jouer[i]=new JButton(""+i);

        }
    }

    public JLabel getChrono() {
        return chrono;
    }

    public JButton getBouton1() {
        return bouton1;
    }

    public JButton[] getJouer() {
        return jouer;
    }

    public void creerJouer(){

        panelPrincipale=new JPanel();
        panelPrincipale.add(chrono);
        setContentPane(panelPrincipale);
    }

    public void creerMenuJouer(){
        for (int i = 0; i < 10; i++) {
            panelBoutonJouer.add(jouer[i]);
        }
        panelPrincipale=new JPanel();
        panelPrincipale.add(panelBoutonJouer);
        setContentPane(panelPrincipale);
    }

    public void creerMenu(){
        bouton1.setPreferredSize(new Dimension(360,100));
        bouton2.setPreferredSize(new Dimension(360,100));
        bouton3.setPreferredSize(new Dimension(360,100));
        bouton4.setPreferredSize(new Dimension(360,100));
        panelBouton.add(bouton1);
        panelBouton.add(bouton2);
        panelBouton.add(bouton3);
        panelBouton.add(bouton4);
        panelPrincipale.add(t);
        panelPrincipale.add(panelBouton);

        setContentPane(panelPrincipale);
    }
    public void setButtonControler(ActionListener listener) {

        bouton1.addActionListener(listener);
        /*bouton2.addActionListener(listener);
        bouton3.addActionListener(listener);
        bouton4.addActionListener(listener);
*/
        jouer[0].addActionListener(listener);
    }


}
