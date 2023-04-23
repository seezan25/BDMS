package DonorPages;

import javax.swing.*;
import java.awt.*;

public class DonorUpdateYourself extends JPanel {
    JTextField usernameField,emailField,contactField,addressField;
    JComboBox<String> combo;
    JButton saveButton,backButton;
    public DonorUpdateYourself(){
         setBounds(270,50,1190,994);
         setBackground(Color.decode("#8C2121"));
         setLayout(null);

        //****************CENTER LABEL********************
        JLabel centerLabel= new JLabel("Edit Your Information");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.BOLD,25));
        centerLabel.setBounds(445,100,270,30);

        //***********Edit Information Field******************
        JLabel userName=new JLabel("Username");
        userName.setFont(new Font("",Font.PLAIN,20));
        userName.setBounds(400,200,150,50);
        userName.setForeground(Color.WHITE);

        usernameField=new JTextField();
        usernameField.setFont(new Font("",Font.PLAIN,20));
        usernameField.setBounds(580,210,150,30);

        JLabel email=new JLabel("Email");
        email.setFont(new Font("",Font.PLAIN,20));
        email.setBounds(400,250,150,50);
        email.setForeground(Color.WHITE);

        emailField=new JTextField();
        emailField.setFont(new Font("",Font.PLAIN,20));
        emailField.setBounds(580,260,150,30);

        JLabel contact=new JLabel("Contact no");
        contact.setFont(new Font("",Font.PLAIN,20));
        contact.setBounds(400,300,150,50);
        contact.setForeground(Color.WHITE);

        contactField=new JTextField();
        contactField.setFont(new Font("",Font.PLAIN,20));
        contactField.setBounds(580,310,150,30);

        JLabel address=new JLabel("Address");
        address.setFont(new Font("",Font.PLAIN,20));
        address.setBounds(400,350,150,50);
        address.setForeground(Color.WHITE);

        addressField=new JTextField();
        addressField.setFont(new Font("",Font.PLAIN,20));
        addressField.setBounds(580,360,150,30);

        JLabel bloodGroup=new JLabel("Blood Group");
        bloodGroup.setFont(new Font("",Font.PLAIN,20));
        bloodGroup.setBounds(400,400,150,50);
        bloodGroup.setForeground(Color.WHITE);

        String[] bloodG={"AB+","AB-","A+","A-","B+","B-","O+","O-"};
        combo=new JComboBox(bloodG);
        combo.setBounds(580,410,150,30);

        //******************* Save BUTTON**************
        saveButton =new JButton("Save");
        saveButton.setBackground(Color.decode("#DBC137"));
        saveButton.setBounds(495,500,100,50);


        backButton = new JButton("Edit");
        backButton.setBackground(Color.decode("#DBC137"));
        backButton.setBounds(595,500,100,50);

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
        add(backButton);
    }
    public JTextField getUsernameField(){return usernameField;}
    public JTextField getEmailField(){return emailField;}
    public JTextField getContactField(){return contactField;}
    public JTextField getAddressField(){return addressField;}
    public JComboBox<String> getCombo(){return combo;}
    public JButton getSaveButton(){return saveButton;}
    public JButton getBackButton(){return  backButton;}
}
