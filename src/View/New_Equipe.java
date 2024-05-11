package View;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import Controleur.ControleurEquipe;

public class New_Equipe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBoxPosition; // JComboBox pour les postes
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;  // Champ pour l'âge
	private JTable table_1;
	private DefaultTableModel tableModel;
	private JButton btnAddPlayer, btnDeletePlayer, btnAddTeam, btnReturn;

	private ControleurEquipe controleur;

	public New_Equipe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matth\\Desktop\\A4\\UML\\Workspace\\NBA_Tracker\\src\\View\\logo-NBA.jpg"));
		setTitle("NBA Tracker : Statistiques Match");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 580);
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

		btnAddPlayer = new JButton("Ajouter Joueur");
		btnAddPlayer.setBounds(568, 300, 130, 21);
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajouterJoueur();
			}
		});
		contentPane.add(btnAddPlayer);

		btnDeletePlayer = new JButton("Supprimer Joueur");
		btnDeletePlayer.setBounds(718, 300, 130, 21);
		btnDeletePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supprimerJoueur();
			}
		});
		contentPane.add(btnDeletePlayer);

		btnAddTeam = new JButton("Ajouter Équipe");
		btnAddTeam.setBounds(568, 10, 130, 21);
		btnAddTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajouterEquipe();
			}
		});
		contentPane.add(btnAddTeam);

		btnReturn = new JButton("Retour");
		btnReturn.setBounds(718, 10, 130, 21);
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (controleur != null) {
					controleur.retournerAuxMatchs();
				}
			}
		});
		contentPane.add(btnReturn);

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

		textField_2 = new JTextField();
		textField_2.setBounds(648, 100, 154, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		comboBoxPosition = new JComboBox<>(new String[] {"Meneur", "Arrière", "Ailier", "Ailier Fort", "Pivot"});
		comboBoxPosition.setBounds(648, 134, 154, 21);
		contentPane.add(comboBoxPosition);

		textField_3 = new JTextField();
		textField_3.setBounds(648, 209, 154, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(648, 251, 154, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(648, 169, 154, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		String[] columnNames = {"Nom", "Position", "Age", "Taille (cm)", "Poids (kg)"};
		tableModel = new DefaultTableModel(columnNames, 0);
		table_1 = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(20, 36, 515, 497);
		contentPane.add(scrollPane);
	}

	private void ajouterJoueur() {
		String nom = textField_2.getText();
		String position = (String) comboBoxPosition.getSelectedItem();
		String age = textField_5.getText();
		String taille = textField_3.getText();
		String poids = textField_4.getText();

		Object[] row = { nom, position, age, taille, poids };
		tableModel.addRow(row);

		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
	}

	private void supprimerJoueur() {
		int row = table_1.getSelectedRow();
		if (row >= 0) {
			tableModel.removeRow(row);
		} else {
			JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne à supprimer.", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void ajouterEquipe() {
		// Logique pour sauvegarder l'équipe
		JOptionPane.showMessageDialog(this, "Équipe enregistrée avec succès.", "Sauvegarde Équipe", JOptionPane.INFORMATION_MESSAGE);
	}

	private void retournerAuxMatchs() {
		// Implémentez votre logique ici pour retourner à la page des matchs
	}

	public void setControleur(ControleurEquipe controleur) {
		this.controleur = controleur;
	}
}
