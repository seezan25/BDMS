import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RegisterPage extends JPanel {

    private JTextField nameField;
    private JTextField addressField;
    private JTextField contactField;
    private JTextField emailField;
    private JComboBox<String> bloodGroupComboBox;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JCheckBox healthyCheckBox;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton submitButton;

    public RegisterPage() {
        JLabel background1;

        ImageIcon img1=new ImageIcon("src/images/register_bg");


        background1=new JLabel("", (Icon) img1,JLabel.CENTER);
        background1.setBounds(0, 0, getWidth(), getHeight());
        add(background1); // Add the JLabel to the frame

        // Layout
        setLayout(new GridLayout(13, 2, 10, 10));

        // Components initialization
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        JLabel contactLabel = new JLabel("Contact Number:");
        contactField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupComboBox = new JComboBox<String>(new String[]{"A", "B", "AB", "O"});
        JLabel genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        JLabel healthLabel = new JLabel("Health Status:");
        healthyCheckBox = new JCheckBox("Healthy");
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        submitButton = new JButton("Submit");


        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressField);
        add(contactLabel);
        add(contactField);
        add(emailLabel);
        add(emailField);
        add(bloodGroupLabel);
        add(bloodGroupComboBox);
        add(genderLabel);
        add(maleRadioButton);
        add(new JLabel());
        add(femaleRadioButton);
        add(healthLabel);
        add(healthyCheckBox);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(new JLabel());
        add(submitButton);
        add(background1);


    }
}
