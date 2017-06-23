package me.jojigarcia.view;

import me.jojigarcia.model.Conexion;
import me.jojigarcia.model.Email;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by joaquinjimenezgarcia on 29/5/17.
 */
public class Controls extends JPanel {
    JLabel usuarioLbl;
    JTextField usuarioTxtLbl;
    JLabel passLbl;
    JTextField passTxtLbl;
    JLabel ddbbLbl;
    JTextField ddbbTxtLbl;
    JButton validateBtn;

    public Controls(){
        usuarioLbl = new JLabel("Usuario: ");
        usuarioTxtLbl = new JTextField(18);
        passLbl = new JLabel("Contraseña: ");
        passTxtLbl = new JTextField(18);
        ddbbLbl = new JLabel("Base de Datos: ");
        ddbbTxtLbl = new JTextField(18);


        validateBtn = new JButton("Validate");

        validateBtn.addActionListener(new ValidateAction());

        add(usuarioLbl);
        add(usuarioTxtLbl);
        add(passLbl);
        add(passTxtLbl);
        add(ddbbLbl);
        add(ddbbTxtLbl);
        add(validateBtn);
    }

    public class ValidateAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Conexion conexion = new Conexion();

            try {
                if (conexion.conectar(usuarioTxtLbl.getText(), passTxtLbl.getText(), ddbbTxtLbl.getText())){
                    JOptionPane.showMessageDialog(null,
                            "Welcome to your database " + ddbbTxtLbl.getText(),
                            "Conection done",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Compruebe que ha insertado bien sus datos.",
                            "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException x) {
                System.out.println(x);
                JOptionPane.showMessageDialog(null,
                        "Ha habido algún problema con la conexión.",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
