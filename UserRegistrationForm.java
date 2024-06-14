import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationForm extends JFrame implements ActionListener {
    private Container container;
    private JLabel titleLabel;
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JButton registerButton;
    private JLabel resultLabel;

    public UserRegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 400); // Set the size of the JFrame

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Register");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        titleLabel.setBounds(150, 10, 100, 30);
        container.add(titleLabel);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 60, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 60, 150, 30);
        container.add(userTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        container.add(passwordField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 140, 100, 30);
        container.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(150, 140, 150, 30);
        container.add(emailTextField);

        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 180, 100, 30);
        container.add(phoneLabel);

        phoneTextField = new JTextField();
        phoneTextField.setBounds(150, 180, 150, 30);
        container.add(phoneTextField);

        registerButton = new JButton("Register");
        registerButton.setBounds(150, 220, 100, 30);
        registerButton.addActionListener(this);
        container.add(registerButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 260, 300, 30);
        container.add(resultLabel);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the frame is closed
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());
        String email = emailTextField.getText();
        String phone = phoneTextField.getText();
        resultLabel.setText("Registered: " + username + ", " + email + ", " + phone);
    }

    public static void main(String[] args) {
        new UserRegistrationForm();
    }
}
