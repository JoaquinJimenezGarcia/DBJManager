package me.jojigarcia.view;

import me.jojigarcia.model.Email;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joaquinjimenezgarcia on 29/5/17.
 */
public class Controls extends JPanel {
    JLabel emailLbl;
    JTextField emailTxtLbl;
    JButton validateBtn;

    public Controls(){
        emailLbl = new JLabel("Email: ");
        emailTxtLbl = new JTextField(18);
        validateBtn = new JButton("Validate");

        validateBtn.addActionListener(new ValidateAction());

        add(emailLbl);
        add(emailTxtLbl);
        add(validateBtn);
    }

    public class ValidateAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Email email = new Email(emailTxtLbl.getText());

            if (email.validate()){
                JOptionPane.showMessageDialog(null,
                        "Valid Email",
                        "Right Email",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "More invalid than Clarita (Heidi's friend)",
                        "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
