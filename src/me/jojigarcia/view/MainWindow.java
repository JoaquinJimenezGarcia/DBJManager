package me.jojigarcia.view;

import javax.swing.*;

/**
 * Created by joaquinjimenezgarcia on 29/5/17.
 */
public class MainWindow extends JFrame{

    public MainWindow(){
        setTitle("Validate Email App");
        setLocation(200,200);

        Controls controls = new Controls();
        add(controls);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
