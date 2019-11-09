package com.muhammedokumus;

import javax.swing.*;
import java.awt.event.*;


/**
 * Provides a GUI for testing the suit creation
 */
class MainGUI extends JFrame implements ActionListener {
    private JRadioButton rb1, rb2, rb3;
    private JButton flamethrowerButton, autoRifleButton, rocketLauncherButton, laserButton;

    private Suit decSuit = new DecSuit();
    private Suit oraSuit = new OraSuit();
    private Suit torSuit = new TorSuit();




    private MainGUI() {
        rb1 = new JRadioButton("Dec suit");
        rb1.setBounds(85, 10, 85, 30);
        rb2 = new JRadioButton("Ora suit");
        rb2.setBounds(2*85, 10, 85, 30);
        rb3 = new JRadioButton("Tor suit");
        rb3.setBounds(3*85, 10, 85, 30);

        ButtonGroup bg = new ButtonGroup();

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        flamethrowerButton = new JButton("Flamethrower");
        autoRifleButton = new JButton("Auto Rifle");
        rocketLauncherButton = new JButton("RPG");
        laserButton = new JButton("Laser");


        flamethrowerButton.setBounds(0, 100, 120, 30);
        flamethrowerButton.addActionListener(this);

        autoRifleButton.setBounds(120, 100, 120, 30);
        autoRifleButton.addActionListener(this);

        rocketLauncherButton.setBounds(240, 100, 120, 30);
        rocketLauncherButton.addActionListener(this);

        laserButton.setBounds(360, 100, 120, 30);
        laserButton.addActionListener(this);

        add(rb1);
        add(rb2);
        add(rb3);

        add(flamethrowerButton);
        add(autoRifleButton);
        add(rocketLauncherButton);
        add(laserButton);

        setSize(500, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            decSuit = decorateSuit(decSuit);
            suitReceiptPopUp(decSuit);
        }
        if (rb2.isSelected()) {
            oraSuit = decorateSuit(oraSuit);
            suitReceiptPopUp(oraSuit);
        }
        if (rb3.isSelected()) {
            torSuit = decorateSuit(torSuit);
            suitReceiptPopUp(torSuit);
        }
    }

    private Suit decorateSuit(Suit suit){
            if (flamethrowerButton.getModel().isArmed())
                suit = new Flamethrower(suit);
            else if (autoRifleButton.getModel().isArmed())
                suit = new AutoRifle(suit);

            else if (rocketLauncherButton.getModel().isArmed())
                suit = new RocketLauncher(suit);

            else if (laserButton.getModel().isArmed())
                suit = new Laser(suit);

        return suit;
    }

    private void suitReceiptPopUp(Suit s){
        JOptionPane.showMessageDialog(this, s.getDescription() + "\nCost: " +s.cost() + "₺" + "\nWeight: " + s.weight() + "KG",
                "Suit Receipt",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
