import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    public LoginPage(){
        setTitle("Login Page");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Selamat Datang"
                , JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add (titleLabel, BorderLayout.NORTH);
        JButton loginButton = new JButton("Login");
        add(loginButton, BorderLayout.SOUTH);

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        add(inputPanel);
        JLabel labelUsername = new JLabel("Username :");
        inputPanel.add(labelUsername);
        JTextField usernameField = new JTextField();
        inputPanel.add(usernameField);
        inputPanel.add(new JLabel("Password :"));
        JPasswordField passwordField = new JPasswordField();
        inputPanel.add(passwordField);

        // Login Function
        loginButton.addActionListener(e ->{
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if (username.equals("Admin") && password.equals("12345")){
                JOptionPane.showMessageDialog(this, "Login Success");
                dispose();
                new Dashboard().setVisible(true);
            }
            else JOptionPane.showMessageDialog(this,
                    "Username atau password salah");
        });
    }
}
