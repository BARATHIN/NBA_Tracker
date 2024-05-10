package View;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.ControleurUser;


import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextPane textPane;
	
	private ControleurUser controleur;
	

	/**
	 * Create the frame.
	 */
	public Login() {
		// Configuration initiale du JFrame
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Users\\\\matth\\\\Desktop\\\\A4\\\\UML\\\\Workspace\\\\NBA_Tracker\\\\src\\\\View\\\\logo-NBA.jpg"));
        setTitle("NBA Tracker : Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 250);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("Connection");
        btnNewButton.setBounds(40, 182, 155, 21);
        btnNewButton.addActionListener(e -> controleur.Connection());
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setBounds(20, 127, 59, 13);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setBounds(20, 150, 59, 13);
        contentPane.add(lblNewLabel_1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(89, 153, 116, 19);
        contentPane.add(passwordField);
        
        textPane = new JTextPane();
        textPane.setBounds(89, 127, 116, 19);
        contentPane.add(textPane);
        
     // Créer un JLabel
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(10, 10, 215, 110); // Définir la position et la taille du JLabel

        // Charger l'image
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\matth\\Desktop\\A4\\UML\\Workspace\\NBA_Tracker\\src\\View\\logo-NBA.jpg");

        // Redimensionner l'image pour qu'elle s'adapte au JLabel
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Définir l'icône redimensionnée sur le JLabel
        lblNewLabel_2.setIcon(resizedIcon);

        // Ajouter le JLabel au content pane du JFrame
        contentPane.add(lblNewLabel_2);
	}
	
	public void setControleur(ControleurUser controleur) {
        this.controleur = controleur;
    }
	
	public String getUsername()
	{
		return textPane.getText();
	}
	public String getPassword()
	{
		char[] passwordChars = passwordField.getPassword();
	    String passwordString = new String(passwordChars);

	    java.util.Arrays.fill(passwordChars, '0');

	    return passwordString;
	}
}
