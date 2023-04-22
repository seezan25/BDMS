package AdminPages;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AdminDonationRequest extends JPanel {
    public AdminDonationRequest(){
        setBounds(400,400,getWidth(),getHeight());
        // Define column names
        String[] columnNames = {"Full Name", "Email", "Blood Type", "Blood Amount", "Phone Number", "Address", "Disease", "Action"};

        // Define data for each row
        String[] data = {
                "John Smith", "john.smith@example.com", "O+", "500 ml", "555-1234", "123 Main St", "", "Donate"

        };
        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(columnNames,0);


        // Create the table with the data and column names
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);
        model.addRow(data);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        add(scrollPane);

    }
}
