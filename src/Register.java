import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Register {


    private JTextField txtUsername;
    private JPanel panelRegister;
    private JTextField txtPassword;
    private JTextField txtConfirmPassword;
    private JButton btRegister;
    private JButton btCancel;

    public Register(){
        btRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame();
        Register register = new Register();
        frame.setContentPane(register.panelRegister);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        frame.setVisible(true);

        String serverName = "sql12.freemysqlhosting.net";
        String mydatabase = "sql12255832";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "sql12255832";
        String password = "VqusRaY3qH";
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.createStatement();


    }
}
