import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class helpdeskUI {
    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog(
        null,
        "Enter Username"
);

String password = JOptionPane.showInputDialog(
        null,
        "Enter Password"
);

if(!username.equals("admin") ||
   !password.equals("admin123")) {

    JOptionPane.showMessageDialog(
            null,
            "Invalid Username or Password!"
    );

    System.exit(0);
}

        JFrame frame = new JFrame("Helpdesk System");

        helpdesksystem system = new helpdesksystem();

        JLabel heading = new JLabel("Ticket Management System");
        heading.setBounds(100,20,200,30);

        JLabel idLabel = new JLabel("Ticket ID :");
        idLabel.setBounds(30,60,100,30);
        JTextField idField = new JTextField();
        idField.setBounds(140, 60, 180, 30);

         JLabel titleLabel = new JLabel("Title :");
        titleLabel.setBounds(30,100,100,30);
        JTextField titleField = new JTextField();
        titleField.setBounds(140, 100, 180, 30);

          JLabel descriptionLabel = new JLabel("Description :");
        descriptionLabel.setBounds(30, 140, 100, 30);
         JTextField descriptionField = new JTextField();
        descriptionField.setBounds(140, 140, 180, 30);


        JLabel statusLabel = new JLabel("Status :");
        statusLabel.setBounds(30, 180, 100, 30);
         JTextField statusField = new JTextField();
        statusField.setBounds(140, 180, 180, 30);

          JLabel createdbyLabel = new JLabel("Created By :");
        createdbyLabel.setBounds(30, 220, 100, 30);
         JTextField createdbyField = new JTextField();
        createdbyField.setBounds(140, 220, 180, 30);



        JButton addButton = new JButton("Add Ticket");
        addButton.setBounds(20,280,120,30);

        JButton viewButton = new JButton("View Ticket");
        viewButton.setBounds(150,280,120,30);

        JButton searchButton = new JButton("search Ticket");
        searchButton.setBounds(20,320,120,30);

        JButton updateButton = new JButton("update Ticket");
        updateButton.setBounds(150,320,120,30);

        JButton deleteButton = new JButton("Delete Ticket");
        deleteButton.setBounds(85,360,120,30);

        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                int ticketId = Integer.parseInt(idField.getText());
                String title = titleField.getText();
                String description = descriptionField.getText();
                String status = statusField.getText();
                String createdBy = createdbyField.getText();

                ticket t =  new ticket(ticketId, title, description, status, createdBy);
                system.addTicket(t);
                JOptionPane.showMessageDialog(frame,"Ticket Created successfully!") ;
            System.out.println(t);       }

        });
        viewButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        String data = system.viewTicket();

        JOptionPane.showMessageDialog(
                frame,
                data
        );
    }
});
searchButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        int searchId =
                Integer.parseInt(idField.getText());

        String result =
                system.searchTicket(searchId);

        JOptionPane.showMessageDialog(
                frame,
                result
        );
    }
});
updateButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        int updateId =
                Integer.parseInt(idField.getText());

        String newStatus =
                statusField.getText();

        String result =
                system.updateTicketStatus(updateId, newStatus);

        JOptionPane.showMessageDialog(
                frame,
                result
        );
    }
});

deleteButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        int deleteId =
                Integer.parseInt(idField.getText());

        String result =
                system.deleteTicket(deleteId);

        JOptionPane.showMessageDialog(
                frame,
                result
        );
    }
});

        frame.add(heading);
        frame.add(idLabel);
        frame.add(idField);
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(descriptionLabel);
        frame.add(descriptionField);
        frame.add(statusLabel);
        frame.add(statusField);
        frame.add(createdbyLabel);
        frame.add(createdbyField);
        frame.add(addButton);
        frame.add(viewButton);
        frame.add(searchButton);
        frame.add(updateButton);
        frame.add(deleteButton);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
