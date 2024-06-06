import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class  UserRegistrationForm extends JFrame implements ActionListener{
    private Container container;
    private JLabel titleLabel;
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel phonLabel;
    private JTextField phonTextField;
    private JButton registerButton;
    private JLabel resultLabel;
    


public  UserRegistrationForm () {
    setTitle("User Registration Form");

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

    emailTextField = new JTextField();
    emailTextField.setBounds(150, 140, 150 ,30);
    container.add(emailTextField);

    phonLabel = new JLabel("Phone:");
    phonLabel.setBounds(50, 180, 100, 30);
    container.add(phonLabel);


    phonTextField = new JTextField();
    phonTextField.setBounds(150, 180, 150, 30);
    container.add(phonTextField);

    registerButton = new JButton("Register");
    registerButton.setBounds(150, 220, 100, 30);
    registerButton.addActionListener(this);
    container.add(registerButton);

    resultLabel = new JLabel("");
    resultLabel.setBounds(50, 260, 300, 30);
    container.add(resultLabel);
    
    setLocationRelativeTo(null);
    setVisible(true);

}

@Override
public void actionPerformed(ActionEvent e) {
    String username = userTextField.getText();
    String password = new  String(passwordField.getPassword());
    String email = emailTextField.getText();
    String phone = phonTextField.getText();
    resultLabel.setText("Registered: " + username + "," + email + ", " + phone );
}
public static void main(String[] args){
    new UserRegistrationForm();
}
}

