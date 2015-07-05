package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;

import Verarbeitungsschicht.Mitarbeiter;
import Verarbeitungsschicht.Mitarbeiterverwaltung;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Einloggfenster extends JFrame {

	private JPanel contentPane;
	private JTextField userID_eingabe;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einloggfenster frame = new Einloggfenster();
					frame.setLocationRelativeTo(null);
					frame.setTitle("NY Times Record - Log in");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Einloggfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblAnmeldungImSystem = new JLabel("Anmeldung im System");
		lblAnmeldungImSystem.setBounds(120, -12, 175, 44);
		lblAnmeldungImSystem.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblAnmeldungImSystem);
		
		JLabel lblBenutzername = new JLabel("Benutzername:");
		lblBenutzername.setBounds(106, 62, 101, 25);
		panel.add(lblBenutzername);
		
		userID_eingabe = new JTextField();
		userID_eingabe.setBounds(228, 64, 101, 20);
		panel.add(userID_eingabe);
		userID_eingabe.setColumns(10);
		
		JLabel lblPasswort = new JLabel("Passwort:");
		lblPasswort.setBounds(106, 126, 77, 14);
		panel.add(lblPasswort);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(228, 123, 101, 20);
		panel.add(passwordField);
		
		
		final JLabel LoginFeedback = new JLabel("");
		LoginFeedback.setEnabled(false);
		LoginFeedback.setBounds(192, 166, 46, 14);
		panel.add(LoginFeedback);
		
		final JButton btnOk = new JButton("Ok");
		btnOk.setSize(89, 23);
		btnOk.setLocation(106, 201);
		btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Mitarbeiterverwaltung list = new Mitarbeiterverwaltung();
				String tmp_password= new String(passwordField.getPassword());
				try {
					list.lesen("MAListe2");
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(null,"Es wurde keine Mitarbeiterdatei gefunden."+"\n"+"Bitte informieren Sie umgehend den Systemadministrator!","keine Daten vorhanden", JOptionPane.CANCEL_OPTION);
				}
				Mitarbeiter tmp= list.login(userID_eingabe.getText(), tmp_password);
				if(tmp!=null){
					LoginFeedback.setText(tmp.toString());
					LoginFeedback.setBounds(120,166,200,14);
					LoginFeedback.setEnabled(true);
				}else{
					LoginFeedback.setText("");
				}
				
				
			}
        	
        });
		getRootPane().setDefaultButton(btnOk);
		panel.add(btnOk);
		
		JButton btnPasswortVergessen = new JButton("Login vergessen");
		btnPasswortVergessen.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				LoginFeedback.setText("Bitte informieren Sie Ihren lokalen Manager!");
				LoginFeedback.setBounds(106,166,400,14);
				LoginFeedback.setEnabled(true);
			}
			
			
		});
		btnPasswortVergessen.setBounds(228, 200, 129, 23);
		panel.add(btnPasswortVergessen);
		
		
	}
}
