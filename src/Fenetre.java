import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {
    protected JPanel panelBouton = new JPanel(new GridLayout(4, 1, 2, 10));
    protected JPanel panelJeu = new JPanel(new GridLayout(6, 6));
    protected JPanel panelPrincipale = new JPanel();
    protected JButton bouton1 = new JButton(new ImageIcon("image/Boutton_Jouer.png"));
    protected JButton bouton2 = new JButton(new ImageIcon("image/Boutton_Option.png"));
    protected JButton bouton3 = new JButton(new ImageIcon("image/Boutton_Score.png"));
    protected JButton bouton4 = new JButton(new ImageIcon("image/Boutton_Aide.png"));

    protected JButton[][] tabBoutonvehicule;

    protected JButton[] jouer = new JButton[6];
    protected JPanel panelBoutonJouer = new JPanel(new GridLayout(4, 3, 2, 10));

    protected JMenuBar barMenu;
    protected JMenuItem nouvellePartie = new JMenuItem("Nouvelle Partie");
    protected JMenuItem reset = new JMenuItem("Reset");
    protected JMenu menu1;
    protected JMenuItem menuPrincipale = new JMenuItem("menu Princpale");
    protected JLabel chrono = new JLabel("0.00");
    protected Model model;
    protected JMenuItem regles = new JMenuItem("Règles du jeu");

    public Fenetre() {
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setTitle("Rush Hour");
        creerMenu();
        for (int i = 0; i < 6; i++) {
            jouer[i] = new JButton(new ImageIcon("image/" + (i+1) +".png"));
            jouer[i].setPreferredSize(new Dimension(75,50));
            //jouer[i] = new JButton("" + (i+1));
        }
         tabBoutonvehicule= new JButton[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tabBoutonvehicule[i][j]=new JButton();
            }
        }

    }

    public JButton[][] getTabBoutonvehicule() {
        return tabBoutonvehicule;
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


    public void creerJouer() {

        setSize(800, 700);
        panelPrincipale = new JPanel();
        panelPrincipale.add(chrono);
        setContentPane(panelPrincipale);
    }

    public void creerMenuJouer() {
        for (int i = 0; i < 6; i++) {
            panelBoutonJouer.add(jouer[i]);
        }
        panelPrincipale = new JPanel();
        panelPrincipale.add(panelBoutonJouer);
        setContentPane(panelPrincipale);
    }

    public void creerMenu() {
        barMenu = new JMenuBar();
        setJMenuBar(barMenu);
        panelPrincipale = new JPanel();
        bouton1.setPreferredSize(new Dimension(360, 100));
        bouton2.setPreferredSize(new Dimension(360, 100));
        bouton3.setPreferredSize(new Dimension(360, 100));
        bouton4.setPreferredSize(new Dimension(360, 100));
        panelBouton.add(bouton1);
        panelBouton.add(bouton2);
        panelBouton.add(bouton3);
        panelBouton.add(bouton4);
        panelPrincipale.add(panelBouton);
        setContentPane(panelPrincipale);

    }

    public void creerMenu2() {
        barMenu = new JMenuBar();
        menu1 = new JMenu("Partie");
        menu1.add(nouvellePartie);
        menu1.add(menuPrincipale);
        menu1.add(regles);

        barMenu.add(menu1);
        setJMenuBar(barMenu);
    }

    public void menuReset(){
        barMenu = new JMenuBar();
        barMenu.add(reset);
        setJMenuBar(barMenu);
    }

    public void affiche(){
        panelPrincipale = new JPanel();
        panelJeu = new JPanel(new GridLayout(6, 6));
        Vehicule[][] tabVehicule;
        tabVehicule = model.getVehicule();
        tabBoutonvehicule = new JButton[6][6];
        boolean fait[][] = new boolean[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                fait[i][j] = false;
            }
        }
        for (int i = 0; i < tabVehicule.length; i++) {
            for (int j = 0; j < tabVehicule[0].length; j++) {

                if (fait[i][j] == false) {
                    if (tabVehicule[i][j] != null) {

                        if (tabVehicule[i][j].isVoiture()) {
                            if (j + 1 < 6) {
                                if (tabVehicule[i][j].equals(tabVehicule[i][j + 1])) {
                                    tabBoutonvehicule[i][j] = new JButton(new ImageIcon("image/Voiture_Av_" + tabVehicule[i][j].getCouleur()+"_h.png"));               //voiture_arr_
                                    tabBoutonvehicule[i][j + 1] = new JButton(new ImageIcon("image/Voiture_Arr_" + tabVehicule[i][j + 1].getCouleur()+"_h.png"));
                                    fait[i][j + 1] = true;
                                }
                            }
                            if (i + 1 < 6) {
                                if (tabVehicule[i][j].equals(tabVehicule[i + 1][j])) {
                                    tabBoutonvehicule[i][j] = new JButton(new ImageIcon("image/Voiture_Av_" + tabVehicule[i][j].getCouleur()+".png"));
                                    tabBoutonvehicule[i + 1][j] = new JButton(new ImageIcon("image/Voiture_Arr_" + tabVehicule[i + 1][j].getCouleur()+".png"));
                                    fait[i + 1][j] = true;
                                }
                            }

                        } else if (tabVehicule[i][j].isCamion()) {
                            if (j + 2 < 6) {
                                if (tabVehicule[i][j].equals(tabVehicule[i][j + 2])) {
                                    tabBoutonvehicule[i][j] = new JButton(new ImageIcon("image/Camion_Arr_" + tabVehicule[i][j].getCouleur()+"_h.png"));
                                    tabBoutonvehicule[i][j + 1] = new JButton(new ImageIcon("image/Camion_mi_" + tabVehicule[i][j + 1].getCouleur()+"_h.png"));
                                    tabBoutonvehicule[i][j + 2] = new JButton(new ImageIcon("image/Camion_Av_" + tabVehicule[i][j + 2].getCouleur()+"_h.png"));
                                    fait[i][j + 1] = true;
                                    fait[i][j + 2] = true;
                                }
                            }

                            if (i + 2 < 6) {
                                if (tabVehicule[i][j].equals(tabVehicule[i + 2][j])) {
                                    tabBoutonvehicule[i][j] = new JButton(new ImageIcon("image/Camion_Av_" + tabVehicule[i][j].getCouleur()+".png"));
                                    tabBoutonvehicule[i + 1][j] = new JButton(new ImageIcon("image/Camion_mi_" + tabVehicule[i + 1][j].getCouleur()+".png"));
                                    tabBoutonvehicule[i + 2][j] = new JButton(new ImageIcon("image/Camion_Arr_" + tabVehicule[i + 2][j].getCouleur()+".png"));
                                    fait[i + 1][j] = true;
                                    fait[i + 2][j] = true;
                                }
                            }
                        }
                    } else {
                        tabBoutonvehicule[i][j] = new JButton();
                        //tabBoutonvehicule[i][j].setVisible(false);

                    }

                    //tabBoutonvehicule[i][j].setBorder(null);


                }
                fait[i][j] = true;
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //if (i == 0/*||i==1||i==2)*/ && j == 5) {
                //  panelJeu.add(pan);
                //} else
                tabBoutonvehicule[i][j].setPreferredSize(new Dimension(100, 100));
                panelJeu.add(tabBoutonvehicule[i][j]);
            }
        }
        panelPrincipale.add(panelJeu);
        setContentPane(panelPrincipale);
        setVisible(true);
    }



    public void niveau(int niveau) {
        model=new Model(niveau);
        Controller c=new Controller(this);
        //c.setModel(model);
        affiche();
        setButtonControler(c);



    }


    public void setButtonControler(ActionListener listener) {

        bouton1.addActionListener(listener);
        /*bouton2.addActionListener(listener);
        bouton3.addActionListener(listener);*/
        bouton4.addActionListener(listener);
        for (int i = 0; i < 6; i++) {
            jouer[i].addActionListener(listener);
        }

        nouvellePartie.addActionListener(listener);
        reset.addActionListener(listener);
        menuPrincipale.addActionListener(listener);
        regles.addActionListener(listener);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tabBoutonvehicule[i][j].addActionListener(listener);
            }
        }
    }


    public void setModel(Model model) {
        this.model = model;
    }
}
