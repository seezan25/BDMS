import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JPanel {
    private JLabel userLabel, passwordLabel;
    private JTextField userTextfield;
    private JPasswordField passwordfield;
    private JButton loginButton, resetButton;
    private Image img;

    public LoginWindow(){
        setLayout(null);
        setBounds(0,0,getWidth(),getHeight());
        userLabel=new JLabel("USERNAME:");
        passwordLabel=new JLabel("PASSWORD:");
        userTextfield=new JTextField();
        passwordfield=new JPasswordField();
        loginButton=new JButton("LOGIN");

        resetButton=new JButton("Create User");

        img = new ImageIcon("src/images/login_bg.jpg").getImage();
        add(userLabel);
        add(passwordLabel);
        add(userTextfield);
        add(passwordfield);
        add(loginButton);
        add(resetButton);


        userLabel.setBounds(60,150,100,30);
        passwordLabel.setBounds(60,220,100,30);
        userTextfield.setBounds(150,150,150,30);
        passwordfield.setBounds(150,220,150,30);
        loginButton.setBounds(50,300,100,30);
        resetButton.setBounds(200,300,100,30);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image onto the panel
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
   public JTextField getUserTextfield(){
        return userTextfield;
   }
   public JPasswordField getPasswordfield(){
        return passwordfield;
   }

    public JButton getLoginButton(){
        return loginButton;
    }

    public JButton getResetButton(){
        return resetButton;
    }

}
