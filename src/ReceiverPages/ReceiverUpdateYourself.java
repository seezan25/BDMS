package ReceiverPages;

import javax.print.attribute.standard.MediaTray;
import javax.swing.*;
import java.awt.*;

public class ReceiverUpdateYourself extends JPanel {
    JTextField emailField,contactField,addressField;
    JLabel usernameField;
    JComboBox<String> combo;
    JButton saveButton,deleteButton;
    public ReceiverUpdateYourself(){
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        setLayout(null);

        //****************CENTER LABEL********************
        JLabel centerLabel= new JLabel("Edit Your Information");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.BOLD,25));
        centerLabel.setBounds(430,40,270,30);

        //***********Edit Information Field******************
        JLabel userName=new JLabel("Username");
        userName.setFont(new Font("",Font.PLAIN,20));
        userName.setBounds(400,140,150,50);
        userName.setForeground(Color.WHITE);

        usernameField=new JLabel();
        usernameField.setFont(new Font("",Font.PLAIN,20));
        usernameField.setBounds(580,150,150,30);

        JLabel email=new JLabel("Email");
        email.setFont(new Font("",Font.PLAIN,20));
        email.setBounds(400,190,150,50);
        email.setForeground(Color.WHITE);

        emailField=new JTextField();
        emailField.setFont(new Font("",Font.PLAIN,20));
        emailField.setBounds(580,200,150,30);

        JLabel contact=new JLabel("Contact no");
        contact.setFont(new Font("",Font.PLAIN,20));
        contact.setBounds(400,240,150,50);
        contact.setForeground(Color.WHITE);

        contactField=new JTextField();
        contactField.setFont(new Font("",Font.PLAIN,20));
        contactField.setBounds(580,250,150,30);

        JLabel address=new JLabel("Address");
        address.setFont(new Font("",Font.PLAIN,20));
        address.setBounds(400,290,150,50);
        address.setForeground(Color.WHITE);

        addressField=new JTextField();
        addressField.setFont(new Font("",Font.PLAIN,20));
        addressField.setBounds(580,300,150,30);

        JLabel bloodGroup=new JLabel("Blood Group");
        bloodGroup.setFont(new Font("",Font.PLAIN,20));
        bloodGroup.setBounds(400,340,150,50);
        bloodGroup.setForeground(Color.WHITE);

        combo=new JComboBox<String>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        combo.setBounds(580,350,150,30);

        //******************* Save BUTTON**************
        saveButton =new JButton("Save");
        saveButton.setBackground(Color.decode("#DBC137"));
        saveButton.setBounds(450,440,100,50);

        deleteButton = new JButton("Delete");
        deleteButton.setBackground(Color.decode("#DBC137"));
        deleteButton.setBounds(570,440,100,50);

        add(centerLabel);
        add(userName);
        add(usernameField);
        add(email);
        add(emailField);
        add(contact);
        add(contactField);
        add(address);
        add(addressField);
        add(bloodGroup);
        add(combo);
        add(saveButton);
        add(deleteButton);

    }
    public JLabel getUsernameField(){return usernameField;}
    public JTextField getEmailField(){return emailField;}
    public JTextField getContactField(){return contactField;}
    public JTextField getAddressField(){return addressField;}
    public JComboBox<String> getCombo(){return combo;}
    public JButton getSaveButton(){return saveButton;}
    public JButton getDeleteButton(){return  deleteButton;}
}
