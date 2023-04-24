package AdminPages;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AdminDonationRequest extends JPanel {
    private DefaultTableModel model;
    private JTable table;
    public AdminDonationRequest(){
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        setLayout(null);

        //************** Center Label ****************
        JLabel centerLabel= new JLabel("Donation Request");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.BOLD,25));
        centerLabel.setBounds(440,55,270,30);

        // Define column names
        String[] columnNames = {"User Name", "Email", "Blood Type","Phone Number", "Address"};
        // Create a DefaultTableModel with the data and column names
        model = new DefaultTableModel(columnNames,0);


        // Create the table with the data and column names
        table = new JTable(model);

        //adding center label on the container
        add(centerLabel);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(350,100,400,300);
//        setLayout(new FlowLayout(FlowLayout.LEADING));
        add(scrollPane);

    }
    public DefaultTableModel getTableModel(){
        return model;
    }
    public JTable getTable(){
        return table;
    }

}