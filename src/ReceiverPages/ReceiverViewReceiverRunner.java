package ReceiverPages;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ReceiverViewReceiverRunner extends JPanel {
    private DefaultTableModel model;
    private JTable table;
    public ReceiverViewReceiverRunner(){
        setLayout(null);
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));

        //************** Center Label ****************
        JLabel centerLabel= new JLabel("Receiver Information");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.BOLD,25));
        centerLabel.setBounds(440,55,270,30);

        // Define column names
        String[] columnNames = {"User Name", "Email", "Blood Type","Phone Number", "Address"};
        // Create a DefaultTableModel with the data and column names
        model = new DefaultTableModel(columnNames,0);


        // Create the table with the data and column names
        table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(330,100,450,300);
        //Adding center label and scrollPane to container
        add(centerLabel);
        add(scrollPane);}
    public DefaultTableModel getTableModel(){
        return model;
    }
    public JTable getTable(){
        return table;
    }
}
