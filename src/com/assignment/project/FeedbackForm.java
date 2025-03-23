package com.assignment.project;
//Imports
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
// Feedback Form
class FeedbackForm extends JFrame implements ActionListener {
    JTextField emailField, firstNameField, lastNameField;
    JTextArea commentArea;
    JComboBox<String> genderBox;
    JButton submitButton, displayButton;
    JTable table;
    DefaultListModel<String> listModel;

    FeedbackForm() {
        setTitle("Feedback Form");
        setSize(400, 400);
        setLayout(new GridLayout(6, 2));
        
        add(new JLabel("Email:"));
        emailField = new JTextField();
        emailField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { validateEmail(); }
            public void removeUpdate(DocumentEvent e) { validateEmail(); }
            public void insertUpdate(DocumentEvent e) { validateEmail(); }
        });
        add(emailField);
        
        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);
        
        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);
        
        add(new JLabel("Gender:"));
        genderBox = new JComboBox<>(new String[]{"Male", "Female"});
        add(genderBox);
        
        add(new JLabel("Comment:"));
        commentArea = new JTextArea();
        add(commentArea);
        
        submitButton = new JButton("Submit");
        submitButton.setEnabled(false);
        submitButton.addActionListener(this);
        add(submitButton);
        
        setVisible(true);
    }

    void validateEmail() {
        submitButton.setEnabled(MasterClass.checkEmail(emailField.getText()));
    }

    public void actionPerformed(ActionEvent e) {
        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || commentArea.getText().length() < 50) {
            JOptionPane.showMessageDialog(this, "All fields must be filled and comment must be 50+ characters.");
        } else {
            new ResultPage(firstNameField.getText(), lastNameField.getText(), emailField.getText(), commentArea.getText());
        }
    }
}