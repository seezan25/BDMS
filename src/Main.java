import AdminPages.*;
import DBConnect.DoConnection;
import DonorPages.DonorDonate;
import DonorPages.DonorHome;
import MyFrame.Myframe;
import ReceiverPages.ReceiverBloodRequest;
import ReceiverPages.ReceiverHome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
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
        DonorDonate donorDonate=new DonorDonate();
        DonorHome donorHome=new DonorHome();

        //Receiver Pages
        ReceiverBloodRequest receiverBloodRequest=new ReceiverBloodRequest();
        ReceiverHome receiverHome=new ReceiverHome();

        //login window
        LoginWindow login = new LoginWindow();
        frame.add(login);

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
//                       frame.getContentPane().add(adminNavbar, BorderLayout.NORTH);
                       frame.getContentPane().add(adminHome, BorderLayout.CENTER);
                       frame.getContentPane().revalidate();
                       frame.getContentPane().repaint();
                       foundMatch = true;

                   }
                   if(!foundMatch == false){
                       login_username.setText("");
                       login_password.setText("");
                       JOptionPane.showMessageDialog(frame,"Username or password incorrect","Error Message",JOptionPane.ERROR_MESSAGE);
                   }

               }

           } catch (SQLException ex) {
               throw new RuntimeException(ex);
           }
        });


        frame.setVisible(true);
    }
}