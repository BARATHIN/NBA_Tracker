package View;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;

import Controleur.ControleurEquipe;

public class New_Equipe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	
	private JTable playerTable;
    private DefaultTableModel tableModel;
    private JTable table_1;
    
    private ControleurEquipe controleur;

	/**
	 * Create the frame.
	 */
	public New_Equipe() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Users\\\\matth\\\\Desktop\\\\A4\\\\UML\\\\Workspace\\\\NBA_Tracker\\\\src\\\\View\\\\logo-NBA.jpg"));
        setTitle("NBA Tracker : Statistiques Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 580);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(124, 10, 361, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nom équipe :");
		lblNewLabel.setBounds(10, 13, 104, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(545, 48, 163, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Ajouter Joueur");
		btnNewButton.setBounds(718, 48, 108, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(558, 103, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Position");
		lblNewLabel_2.setBounds(558, 137, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setBounds(558, 173, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Taille (en cm)");
		lblNewLabel_4.setBounds(558, 212, 64, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Poids (en kg)");
		lblNewLabel_5.setBounds(558, 254, 64, 13);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(648, 169, 154, 21);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(648, 134, 154, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(648, 100, 154, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(648, 209, 154, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(648, 251, 154, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
        table_1 = new JTable();
        String[] columnNames = {"Nom", "Position", "Age", "Taille (cm)", "Poids (kg)"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table_1.setModel(tableModel);
        table_1.setBounds(20, 36, 515, 497);
        contentPane.add(table_1);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setBounds(545, 354, 281, 165);
        
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\matth\\Desktop\\A4\\UML\\Workspace\\NBA_Tracker\\src\\View\\logo-NBA.jpg");

        // Redimensionner l'image pour qu'elle s'adapte au JLabel
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Définir l'icône redimensionnée sur le JLabel
        lblNewLabel_6.setIcon(resizedIcon);
        contentPane.add(lblNewLabel_6);
	}
	
	public void setControleur(ControleurEquipe controleur) {
        this.controleur = controleur;
    }
}
