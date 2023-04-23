package DonorPages;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DonorViewReceiverRunner extends JPanel {
    private DefaultTableModel model;
    private JTable table;
    public DonorViewReceiverRunner(){
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        // Define column names
        String[] columnNames = {"User Name", "Email", "Blood Type","Phone Number", "Address"};
        // Create a DefaultTableModel with the data and column names
        model = new DefaultTableModel(columnNames,0);


        // Create the table with the data and column names
        table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        add(scrollPane);
    }
    public DefaultTableModel getTableModel(){
        return model;
    }
    public JTable getTable(){
        return table;
    }
}
