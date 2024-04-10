package View;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JButton;

import Controleur.ControleurMatchs;

public class New_Match extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    // Controleur
    private ControleurMatchs controleur;
    
    // ELements
    private JTextField txtIDMatch;
    private JTextField txtDate;
    private JTextField txtEquipeDomicile;
    private JTextField txtEquipeVisiteur;
    private JTextField txtScoreDomicile;
    private JTextField txtScoreVisiteur;
    private JTextField txtMVPNom;
    private JTextField txtMVPPrenom;
    private JTextField txtMVPPoints;
    private JTextField txtMVPRebonds;
    private JTextField txtMVPPasses;
    private JTextField txtMVPinter;
    private JTextField txtMVPContres;
    private JTextField txtMVPMinutes;
    private JButton btnSaveMatch;
    

    public New_Match() {
    	   	
    	// Configuration initiale du JFrame
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Users\\\\matth\\\\Desktop\\\\A4\\\\UML\\\\Workspace\\\\NBA_Tracker\\\\src\\\\View\\\\logo-NBA.jpg"));
        setTitle("NBA Tracker : Statistiques Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 580);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Panel InfoMatch avec Absolute Layout
        JPanel InfoMatch = new JPanel(null); // set layout to null for absolute positioning
        InfoMatch.setBackground(new Color(192, 192, 192));
        InfoMatch.setBounds(10, 10, 400, 180); // adjust dimensions as needed
        contentPane.add(InfoMatch);

        // Configure and add components to InfoMatch
        // ID Match label and text field
        JLabel lblIDMatch = new JLabel("ID match :");
        lblIDMatch.setBounds(10, 10, 60, 20);
        InfoMatch.add(lblIDMatch);

        txtIDMatch = new JTextField();
        txtIDMatch.setEditable(true);
        txtIDMatch.setBounds(65, 10, 100, 20);
        InfoMatch.add(txtIDMatch);

        // Date label and text field
        JLabel lblDate = new JLabel("Date :");
        lblDate.setBounds(200, 10, 40, 20);
        InfoMatch.add(lblDate);

        txtDate = new JTextField();
        txtDate.setEditable(true);
        txtDate.setBounds(240, 10, 100, 20);
        InfoMatch.add(txtDate);
        
        JLabel lblEquipeDomicile = new JLabel("Equipe à domicile :");
        lblEquipeDomicile.setBounds(10, 45, 150, 20);
        InfoMatch.add(lblEquipeDomicile);

        txtEquipeDomicile = new JTextField();
        txtEquipeDomicile.setEditable(true);
        txtEquipeDomicile.setBounds(160, 45, 200, 20);
        InfoMatch.add(txtEquipeDomicile);

        JLabel lblEquipeVisiteur = new JLabel("Equipe visiteur :");
        lblEquipeVisiteur.setBounds(10, 80, 150, 20);
        InfoMatch.add(lblEquipeVisiteur);

        txtEquipeVisiteur = new JTextField();
        txtEquipeVisiteur.setEditable(true);
        txtEquipeVisiteur.setBounds(160, 80, 200, 20);
        InfoMatch.add(txtEquipeVisiteur);

        JLabel lblScoreDomicile = new JLabel("Score equipe à domicile :");
        lblScoreDomicile.setBounds(10, 115, 150, 20);
        InfoMatch.add(lblScoreDomicile);

        txtScoreDomicile = new JTextField();
        txtScoreDomicile.setEditable(true);
        txtScoreDomicile.setBounds(160, 115, 200, 20);
        InfoMatch.add(txtScoreDomicile);

        JLabel lblScoreVisiteur = new JLabel("Score equipe visiteur :");
        lblScoreVisiteur.setBounds(10, 150, 150, 20);
        InfoMatch.add(lblScoreVisiteur);
        
        txtScoreVisiteur = new JTextField();
        txtScoreVisiteur.setEditable(true);
        txtScoreVisiteur.setBounds(160, 150, 200, 20);
        InfoMatch.add(txtScoreVisiteur);
        
        
        // Panel MVP
        JPanel MVP = new JPanel(null);
        MVP.setBackground(new Color(192, 192, 192));
        MVP.setBounds(425, 10, 400, 180);
        getContentPane().add(MVP);

        JLabel lblMVP = new JLabel("MVP");
        lblMVP.setBackground(new Color(255, 255, 255));
        lblMVP.setHorizontalAlignment(JLabel.CENTER);
        lblMVP.setBounds(10, 5, 380, 20);
        MVP.add(lblMVP);

        JLabel lblMVPNom = new JLabel("Nom :");
        lblMVPNom.setBounds(10, 35, 50, 20);
        MVP.add(lblMVPNom);
        
        txtMVPNom = new JTextField();
        txtMVPNom.setEditable(true);
        txtMVPNom.setBounds(70, 35, 100, 20);
        MVP.add(txtMVPNom);

        JLabel lblMVPPrenom = new JLabel("Prénom :");
        lblMVPPrenom.setBounds(205, 35, 60, 20);
        MVP.add(lblMVPPrenom);
        
        txtMVPPrenom = new JTextField();
        txtMVPPrenom.setEditable(true);
        txtMVPPrenom.setBounds(275, 35, 115, 20);
        MVP.add(txtMVPPrenom);    
        
        JLabel lblMVPPoints = new JLabel("Points :");
        lblMVPPoints.setBounds(10, 65, 50, 20);
        MVP.add(lblMVPPoints);

        txtMVPPoints = new JTextField();
        txtMVPPoints.setEditable(true);
        txtMVPPoints.setBounds(70, 65, 100, 20);
        MVP.add(txtMVPPoints);

        JLabel lblMVPRebonds = new JLabel("Rebonds :");
        lblMVPRebonds.setBounds(205, 65, 60, 20);
        MVP.add(lblMVPRebonds);

        txtMVPRebonds = new JTextField();
        txtMVPRebonds.setEditable(true);
        txtMVPRebonds.setBounds(275, 65, 115, 20);
        MVP.add(txtMVPRebonds);
        
        JLabel lblMVPPasses = new JLabel("Passes Décisives :");
        lblMVPPasses.setBounds(10, 100, 90, 20);
        MVP.add(lblMVPPasses);

        txtMVPPasses = new JTextField();
        txtMVPPasses.setEditable(true);
        txtMVPPasses.setBounds(110, 100, 60, 20);
        MVP.add(txtMVPPasses);

        JLabel lblMVPInter = new JLabel("Interceptions :");
        lblMVPInter.setBounds(205, 100, 77, 20);
        MVP.add(lblMVPInter);
        
        txtMVPinter = new JTextField();
        txtMVPinter.setEditable(true);
        txtMVPinter.setBounds(300, 100, 90, 20);
        MVP.add(txtMVPinter);
        
        JLabel lblMVPContres = new JLabel("Contres :");
        lblMVPContres.setBounds(10, 135, 50, 20);
        MVP.add(lblMVPContres);

        txtMVPContres = new JTextField();
        txtMVPContres.setEditable(true);
        txtMVPContres.setBounds(70, 135, 100, 20);
        MVP.add(txtMVPContres);

        JLabel lblMVPMinutes = new JLabel("Minutes :");
        lblMVPMinutes.setBounds(205, 135, 60, 20);
        MVP.add(lblMVPMinutes);
        
        txtMVPMinutes = new JTextField();
        txtMVPMinutes.setEditable(true);
        txtMVPMinutes.setBounds(275, 135, 115, 20);
        MVP.add(txtMVPMinutes);
        
        
        // Equipe à Domicile
        JPanel EquipeDomicile = new JPanel();
        EquipeDomicile.setBackground(new Color(192, 192, 192));
        EquipeDomicile.setBounds(10, 200, 400, 300);
        getContentPane().add(EquipeDomicile);
        EquipeDomicile.setLayout(null);


        JLabel lblEquipeaDomicile = new JLabel("Equipe à domicile :");
        lblEquipeaDomicile.setBounds(10, 5, 100, 20);
        EquipeDomicile.add(lblEquipeaDomicile);

        String[] columnNamesDomiciles = {"Nom", "Prénom", "Temps", "Points", "Rebonds", "Passes"};
        DefaultTableModel modelDomicile = new DefaultTableModel(columnNamesDomiciles, 0);
        JTable tableDomicile = new JTable(modelDomicile);
     
        //modelDomicile.addRow(new Object[]{"Nicolas", "Jokic", "35", "28", "15", "12"});

        JScrollPane scrollPaneDomicile = new JScrollPane(tableDomicile);
        scrollPaneDomicile.setBounds(10, 30, 380, 260);
        EquipeDomicile.add(scrollPaneDomicile);


        // Equipe Visiteur
        JPanel EquipeVisiteur = new JPanel();
        EquipeVisiteur.setBackground(new Color(192, 192, 192));
        EquipeVisiteur.setBounds(425, 200, 400, 300);
        getContentPane().add(EquipeVisiteur);
        EquipeVisiteur.setLayout(null);

        JLabel lblEquipeaVisiteur = new JLabel("Equipe Visiteur :");
        lblEquipeaVisiteur.setBounds(10, 5, 100, 20);
        EquipeVisiteur.add(lblEquipeaVisiteur);

        String[] columnNamesVisiteur = {"Nom", "Prénom", "Temps", "Points", "Rebonds", "Passes"};
        DefaultTableModel modelVisiteur = new DefaultTableModel(columnNamesVisiteur, 0);
        JTable tableVisiteur = new JTable(modelVisiteur);
        
        //modelVisiteur.addRow(new Object[]{"Bam", "Adebayo", "38", "25", "13", "4"});

        JScrollPane scrollPaneVisiteur = new JScrollPane(tableVisiteur);
        scrollPaneVisiteur.setBounds(10, 30, 380, 260);
        EquipeVisiteur.add(scrollPaneVisiteur);   
        
        btnSaveMatch = new JButton("Sauvegarder le match");
        btnSaveMatch.setBounds(10, 510, 815, 21);
        btnSaveMatch.addActionListener(e -> {
			try {
				controleur.ouvrirMatchs();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
        contentPane.add(btnSaveMatch);
    }
    
    public int get_txtIDMatch()
    {
    	return Integer.parseInt(txtIDMatch.getText());
    }
    public Date get_txtDate()
    {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    	try {
			return formatter.parse(txtDate.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
    public String get_txtEquipeDomicile()
    {
    	return txtEquipeDomicile.getText();
    }
    public String get_txtEquipeVisiteur()
    {
    	return txtEquipeVisiteur.getText();
    }
    public int get_txtEquipeDomicileScore()
    {
    	return Integer.parseInt(txtScoreDomicile.getText());
    }
    public int get_txtEquipeVisiteurScore()
    {
    	return Integer.parseInt(txtScoreVisiteur.getText());
    }
    
    public void setControleur(ControleurMatchs controleur) {
        this.controleur = controleur;
    }
}