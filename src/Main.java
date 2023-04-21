import AdminPages.*;
import DBConnect.DoConnection;
import DonorPages.DonorDonateRunner;
import DonorPages.DonorHomeRunner;
import DonorPages.DonorViewDonorRunner;
import DonorPages.DonorViewReceiverRunner;
import MyFrame.Myframe;
import ReceiverPages.ReceiverBloodRequestRunner;
import ReceiverPages.ReceiverHomeRunner;
import ReceiverPages.ReceiverViewDonorRunner;
import ReceiverPages.ReceiverViewReceiverRunner;
import Reusable.AdminNavigationBar;
import Reusable.DonorNavigationBar;
import Reusable.ReceiverNavigationBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Myframe frame = new Myframe();

        //admin pages
        AdminAddDonorRunner adminAddDonor = new AdminAddDonorRunner();
        AdminAddReceiverRunner adminAddReceiver=new AdminAddReceiverRunner();
        AdminHistory adminHistory=new AdminHistory();
        AdminHomeRunner adminHome=new AdminHomeRunner();
        AdminUpdateDonorRunner adminUpdateDonor=new AdminUpdateDonorRunner();
        AdminUpdateReceiverRunner adminUpdateReceiver =new AdminUpdateReceiverRunner();
        AdminViewDonorRunner adminViewDonor = new AdminViewDonorRunner();
        AdminViewReceiverRunner adminViewReceiver=new AdminViewReceiverRunner();


        //Donor Pages
        DonorDonateRunner donorDonate=new DonorDonateRunner();
        DonorHomeRunner donorHome=new DonorHomeRunner();
        DonorViewReceiverRunner donorViewReceiver = new DonorViewReceiverRunner();
        DonorViewDonorRunner donorViewDonor = new DonorViewDonorRunner();

        //Receiver Pages
        ReceiverBloodRequestRunner receiverBloodRequest = new ReceiverBloodRequestRunner();
        ReceiverHomeRunner receiverHome=new ReceiverHomeRunner();
        ReceiverViewDonorRunner receiverViewDonor =  new ReceiverViewDonorRunner();
        ReceiverViewReceiverRunner receiverViewReceiver = new ReceiverViewReceiverRunner();

        //login window
        LoginWindow login = new LoginWindow();
        frame.add(login);

        //these are the reusable components
        AdminNavigationBar adminNavbar = new AdminNavigationBar();
        DonorNavigationBar donorNavbar = new DonorNavigationBar();
        ReceiverNavigationBar receiverNavbar = new ReceiverNavigationBar();

        //these are the menu item obtained from the admin navigationbar
        JMenu ahome = adminNavbar.getHome();
        JMenu alogout = adminNavbar.getLogout();
        JMenuItem aadddonor = adminNavbar.getAddDonor();
        JMenuItem aviewdonor= adminNavbar.getViewDonor();
        JMenuItem aaddReceiver = adminNavbar.getAddReceiver();
        JMenuItem aviewReceiver = adminNavbar.getViewReceiver();

        //these are the menu item obtained from the donor navigation bar
        JMenu dhome = donorNavbar.getHome();
        JMenu dlogout = donorNavbar.getLogout();
        JMenuItem dviewDonor = donorNavbar.getViewDonor();
        JMenuItem dviewReceiver = donorNavbar.getViewReceiver();

        //these are the menu item obtained from the receiver navigation bar
        JMenu rhome = receiverNavbar.getHome();
        JMenu rlogout = receiverNavbar.getLogout();
        JMenuItem rviewDonor = receiverNavbar.getViewDonor();
        JMenuItem rviewReceiver = receiverNavbar.getViewReceiver();

        //these are the components of login panel
        JTextField login_username = login.getUserTextfield();
        JPasswordField login_password= login.getPasswordfield();
        JButton login_loginButton= login.getLoginButton();
        JButton login_resetButton=login.getResetButton();

        //connection component
        DoConnection connect = new DoConnection();
        Connection conn = connect.getConnection();

        //these are the detail obtained from the adminhomerunner
        JLabel anameDetail = adminHome.getNameDetail();
        JLabel ausernameDetail = adminHome.getUsernameDetail();
        JLabel auserTypeDetail = adminHome.getUserTypeDetail();
        JLabel acontactDetail = adminHome.getContactDetail();
        JLabel aemailDetail = adminHome.getEmailDetail();
        JLabel adiseaseDetail = adminHome.getDiseaseDetail();
        JLabel aaddressDetail= adminHome.getAddressDetail();
        JLabel abloodgroupDetail = adminHome.getBloodGroupDetail();
        JLabel abloodAmountDetail = adminHome.getBloodAmountDetail();

        //these are the details obtained from the donor home runner
        JLabel fnameDetail = donorHome.getNameDetail();
        JLabel fusernameDetail = donorHome.getUsernameDetail();
        JLabel fuserTypeDetail = donorHome.getUserTypeDetail();
        JLabel fcontactDetail = donorHome.getContactDetail();
        JLabel femailDetail = donorHome.getEmailDetail();
        JLabel fdiseaseDetail = donorHome.getDiseaseDetail();
        JLabel faddressDetail= donorHome.getAddressDetail();
        JLabel fbloodgroupDetail = donorHome.getBloodGroupDetail();
        JLabel fbloodAmountDetail = donorHome.getBloodAmountDetail();

        //these are the details of the donor Home
        JLabel rnameDetail = donorHome.getNameDetail();
        JLabel rusernameDetail = donorHome.getUsernameDetail();
        JLabel ruserTypeDetail = donorHome.getUserTypeDetail();
        JLabel rcontactDetail = donorHome.getContactDetail();
        JLabel remailDetail = donorHome.getEmailDetail();
        JLabel rdiseaseDetail = donorHome.getDiseaseDetail();
        JLabel raddressDetail= donorHome.getAddressDetail();
        JLabel rbloodgroupDetail = donorHome.getBloodGroupDetail();
        JLabel rbloodAmountDetail = donorHome.getBloodAmountDetail();


        //While Clicking on Login Button
        //actionlistener on clicking the login button
        login_loginButton.addActionListener(e -> {
           try{
               String sql="SELECT * FROM user";
               Statement stmt=conn.createStatement();
               ResultSet result=stmt.executeQuery(sql);
               int id_value=0;
               String name_value=null;
               String username_value=null;
               String password_value=null;
               String bloodGroup_value=null;
               String email_value=null;
               String contact_value=null;
               String disease_value=null;
               String address_value=null;
               int bloodAmount_value=0;
               String userType_value=null;
               boolean action_value=false;
               boolean foundMatch=false;
               while(result.next()){
                   id_value=Integer.parseInt(result.getString("ID"));
                   name_value = result.getString("Name");
                   username_value=result.getString("Username");
                   password_value=result.getString("Password");
                   userType_value=result.getString("UserType");
                   bloodGroup_value=result.getString("BloodGroup");
                   email_value=result.getString("Email");
                   contact_value=result.getString("ContactNumber");
                   disease_value=result.getString("Disease");
                   address_value=result.getString("Address");
                   bloodAmount_value=Integer.parseInt(result.getString("BloodAmount"));
                   String username = login_username.getText();
                   String Password=new String(login_password.getPassword());
                   if(Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value,"admin")){
                       login_username.setText("");
                       login_password.setText("");
                       anameDetail.setText(name_value);
                       ausernameDetail.setText(username_value);
                       auserTypeDetail.setText(userType_value);
                       acontactDetail.setText(contact_value);
                       aemailDetail.setText(email_value);
                       adiseaseDetail.setText(disease_value);
                       abloodAmountDetail.setText(String.valueOf(bloodAmount_value));
                       abloodgroupDetail.setText(bloodGroup_value);
                       aaddressDetail.setText(address_value);

                       frame.getContentPane().removeAll();
                       frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
                       frame.getContentPane().add(adminHome, BorderLayout.CENTER);
                       frame.getContentPane().revalidate();
                       frame.getContentPane().repaint();
                       foundMatch = true;

                   } else if (Objects.equals(username_value,username) && Objects.equals(password_value,Password) && Objects.equals(userType_value,"donor")) {
                       login_username.setText("");
                       login_password.setText("");
                       fnameDetail.setText(name_value);
                       fusernameDetail.setText(username_value);
                       fuserTypeDetail.setText(userType_value);
                       fcontactDetail.setText(contact_value);
                       femailDetail.setText(email_value);
                       fdiseaseDetail.setText(disease_value);
                       fbloodAmountDetail.setText(String.valueOf(bloodAmount_value));
                       fbloodgroupDetail.setText(bloodGroup_value);
                       faddressDetail.setText(address_value);
                       frame.getContentPane().removeAll();
                       frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
                       frame.getContentPane().add(donorHome, BorderLayout.CENTER);
                       frame.getContentPane().revalidate();
                       frame.getContentPane().repaint();
                       foundMatch = true;

                   } else if (Objects.equals(username_value,username) && Objects.equals(password_value,Password) && Objects.equals(userType_value,"receiver")) {
                       login_username.setText("");
                       login_password.setText("");
                       rnameDetail.setText(name_value);
                       rusernameDetail.setText(username_value);
                       ruserTypeDetail.setText(userType_value);
                       rcontactDetail.setText(contact_value);
                       remailDetail.setText(email_value);
                       rdiseaseDetail.setText(disease_value);
                       rbloodAmountDetail.setText(String.valueOf(bloodAmount_value));
                       rbloodgroupDetail.setText(bloodGroup_value);
                       raddressDetail.setText(address_value);
                       frame.getContentPane().removeAll();
                       frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
                       frame.getContentPane().add(receiverHome, BorderLayout.CENTER);
                       frame.getContentPane().revalidate();
                       frame.getContentPane().repaint();
                       foundMatch = true;
                   }


               }
               if(!foundMatch){
                   login_username.setText("");
                   login_password.setText("");
                   JOptionPane.showMessageDialog(frame,"Username or password incorrect","Error Message",JOptionPane.ERROR_MESSAGE);
               }

           } catch (SQLException ex) {
               throw new RuntimeException(ex);
           }
        });

        //clicking the reset button in  login panel
        login_resetButton.addActionListener(e->{
            login_username.setText("");
            login_password.setText("");
        });


        //event on entering the enter button in login window
        login_username.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                   login_password.requestFocus();
                }
            }
        });

        login_password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(login_username.getText().trim().isEmpty()){
                        login_username.requestFocus();
                    }else {

                        try {
                            String sql = "SELECT * FROM user";
                            Statement stmt = conn.createStatement();
                            ResultSet result = stmt.executeQuery(sql);
                            int id_value = 0;
                            String name_value = null;
                            String username_value = null;
                            String password_value = null;
                            String bloodGroup_value = null;
                            String email_value = null;
                            String contact_value = null;
                            String disease_value = null;
                            String address_value = null;
                            int bloodAmount_value = 0;
                            String userType_value = null;
                            boolean action_value = false;
                            boolean foundMatch = false;
                            while (result.next()) {
                                id_value = Integer.parseInt(result.getString("ID"));
                                name_value = result.getString("Name");
                                username_value = result.getString("Username");
                                password_value = result.getString("Password");
                                userType_value = result.getString("UserType");
                                bloodGroup_value = result.getString("BloodGroup");
                                email_value = result.getString("Email");
                                contact_value = result.getString("ContactNumber");
                                disease_value = result.getString("Disease");
                                address_value = result.getString("Address");
                                bloodAmount_value = Integer.parseInt(result.getString("BloodAmount"));
                                String username = login_username.getText();
                                String Password = new String(login_password.getPassword());
                                if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "admin")) {
                                    login_username.setText("");
                                    login_password.setText("");
                                    anameDetail.setText(name_value);
                                    ausernameDetail.setText(username_value);
                                    auserTypeDetail.setText(userType_value);
                                    acontactDetail.setText(contact_value);
                                    aemailDetail.setText(email_value);
                                    adiseaseDetail.setText(disease_value);
                                    abloodAmountDetail.setText(String.valueOf(bloodAmount_value));
                                    abloodgroupDetail.setText(bloodGroup_value);
                                    aaddressDetail.setText(address_value);

                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
                                    frame.getContentPane().add(adminHome, BorderLayout.CENTER);
                                    frame.getContentPane().revalidate();
                                    frame.getContentPane().repaint();
                                    foundMatch = true;

                                } else if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "donor")) {
                                    login_username.setText("");
                                    login_password.setText("");
                                    fnameDetail.setText(name_value);
                                    fusernameDetail.setText(username_value);
                                    fuserTypeDetail.setText(userType_value);
                                    fcontactDetail.setText(contact_value);
                                    femailDetail.setText(email_value);
                                    fdiseaseDetail.setText(disease_value);
                                    fbloodAmountDetail.setText(String.valueOf(bloodAmount_value));
                                    fbloodgroupDetail.setText(bloodGroup_value);
                                    faddressDetail.setText(address_value);
                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
                                    frame.getContentPane().add(donorHome, BorderLayout.CENTER);
                                    frame.getContentPane().revalidate();
                                    frame.getContentPane().repaint();
                                    foundMatch = true;

                                } else if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "receiver")) {
                                    login_username.setText("");
                                    login_password.setText("");
                                    rnameDetail.setText(name_value);
                                    rusernameDetail.setText(username_value);
                                    ruserTypeDetail.setText(userType_value);
                                    rcontactDetail.setText(contact_value);
                                    remailDetail.setText(email_value);
                                    rdiseaseDetail.setText(disease_value);
                                    rbloodAmountDetail.setText(String.valueOf(bloodAmount_value));
                                    rbloodgroupDetail.setText(bloodGroup_value);
                                    raddressDetail.setText(address_value);
                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
                                    frame.getContentPane().add(receiverHome, BorderLayout.CENTER);
                                    frame.getContentPane().revalidate();
                                    frame.getContentPane().repaint();
                                    foundMatch = true;
                                }


                            }
                            if (!foundMatch) {
                                login_username.setText("");
                                login_password.setText("");
                                JOptionPane.showMessageDialog(frame, "Username or password incorrect", "Error Message", JOptionPane.ERROR_MESSAGE);
                            }

                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }}
            }
        });

        //event on clicking add donor in admin section
        aadddonor.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(adminAddDonor, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

        //event on clicking view donor in admin section
        aviewdonor.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(adminViewDonor, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

        //event on clicking add receiver in admin section
        aaddReceiver.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(adminAddReceiver, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

        //event on clicking view receiver in admin section
        aviewReceiver.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(adminViewReceiver, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

//event on clicking home in the admin section
        ahome.addActionListener(e->{
                frame.getContentPane().removeAll();
            System.out.println("hello");
                frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
                frame.getContentPane().add(adminHome, BorderLayout.CENTER);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();

        });

        //event on clicking home in the admin section
        alogout.addActionListener(e->{
            frame.getContentPane().removeAll();
            frame.getContentPane().add(login, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        });

        //event on clicking view Donor in donor section
        dviewDonor.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(donorViewDonor, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });
        //event on clicking view receiver in donor section
        dviewReceiver.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(donorViewReceiver, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });
        //event on clicking home in the donor section
        dhome.addActionListener(e->{
            frame.getContentPane().removeAll();
            frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(donorHome, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        });

        //event on clicking logout in the donor section
        dlogout.addActionListener(e->{
            frame.getContentPane().removeAll();
            frame.getContentPane().add(login, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        });


        //event on clicking view Donor in receiver section
        rviewDonor.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(receiverNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(receiverViewDonor, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });
        //event on clicking view receiver in receiver section
        rviewReceiver.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(receiverNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(receiverViewReceiver, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

        //event on clicking home in the receiver section
        rhome.addActionListener(e->{
            frame.getContentPane().removeAll();
            frame.getContentPane().add(receiverNavbar, BorderLayout.NORTH);
            frame.getContentPane().add(receiverHome, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        });

        //event on clicking logout in the receiver section
        rlogout.addActionListener(e->{
            frame.getContentPane().removeAll();
            frame.getContentPane().add(login, BorderLayout.CENTER);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        });

        frame.setVisible(true);
    }
}