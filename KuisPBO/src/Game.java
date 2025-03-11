import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {
    JLabel labelPlayer = new JLabel("Player 1:");
    JLabel labelPlayer2 = new JLabel("Player 2:");
    JLabel labelSerangan = new JLabel("Serangan :");
    JTextField playerTextField = new JTextField();
    JRadioButton rbBatu = new JRadioButton("Batu");
    JRadioButton rbKertas = new JRadioButton("Kertas");
    JRadioButton rbGunting = new JRadioButton("Gunting");
    JButton battleButton = new JButton("Battle");
    
        Game() {
        setVisible(true);
        setSize(480,360);
        setTitle("Halaman Game");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        labelPlayer.setBounds(20,60,150,30);
        labelPlayer2.setBounds(480,60,150,30);
        playerTextField.setBounds(100,60,280,30);
        labelSerangan.setBounds(20,110,150,30);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbBatu);
        group.add(rbKertas);
        group.add(rbGunting);
        
        setLayout(null);
        add(labelPlayer);
        add(labelPlayer2);
        add(playerTextField);
        add(labelSerangan);
        add(rbBatu);
        add(rbKertas);
        add(rbGunting);
            
        }
}


