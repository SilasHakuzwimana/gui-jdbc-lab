package com.assignment.project;
import javax.swing.*;
import javax.swing.text.html.CSS.Attribute;

// Login Page
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.html.CSS;
class LoginPage extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    LoginPage() {
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        usernameField.setSize(100, 50);
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        passwordField.setSize(100, 50);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String password = new String(passwordField.getPassword());
        if (password.length() >= 8 && password.length() <= 12 && password.equals(password.toUpperCase())) {
            dispose();
            new FeedbackForm();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Password! \n Must be 8-12 uppercase letters.");
        }
    }
}