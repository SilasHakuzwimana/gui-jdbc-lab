package com.assignment.project;

import java.awt.GridLayout;
import javax.swing.*;

// Result Page
class ResultPage extends JFrame {
    ResultPage(String firstName, String lastName, String email, String comment) {
        setTitle("Result Page");
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));
        
        add(new JLabel("First Name: " + firstName));
        add(new JLabel("Last Name: " + lastName));
        add(new JLabel("Email: " + email));
        add(new JLabel("Comment: " + comment));
        
        setVisible(true);
    }
}

