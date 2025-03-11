import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener{
    JLabel labelUsername = new JLabel("Username:");
    JLabel labelPassword = new JLabel("Password");
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    
    JButton loginButton = new JButton("Login");
     
    Login() {
        setVisible(true);
        setSize(480,360);
        setTitle("Halaman Login");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        labelUsername.setBounds(20,60,150,30);
        usernameTextField.setBounds(160,60,280,30);
        labelPassword.setBounds(20,110,150,30);
        passwordTextField.setBounds(160,110,280,30);
        
        loginButton.setBounds(20,170,420,40);
     
        System.out.println("LOGIN");
        add(labelUsername);
        add(usernameTextField);
        add(labelPassword);
        add(passwordTextField);
        add(loginButton);

        
        loginButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == loginButton) {
                String username = usernameTextField.getText();
                String password  = new String(passwordTextField.getPassword());
                if(username.equals("Fadli") && password.equals("118")) {
                    JOptionPane.showMessageDialog(this, "Login Berhasil");
                    Game game = new Game();
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(this, "Username dan atau password tidak valid");
                }
            }
    }
}
               
    