package TemaC;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlegereCursGUI{	
	
	CourseFactory cursFactory;

	JFrame frame;
	private JPanel panel;
	
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField txtMedia;
	private JTextArea txtRezultat;
	
	private JComboBox<String> anStudiu;
	
	private ButtonGroup btnGrup;
	private JRadioButton rdbtnNeIntegralist;
	private JRadioButton rdbtnIntegralist;
	
	private JLabel lblNume;
	private JLabel lblPrenume;
	private JLabel lblAn;
	private JLabel lblMedia;
	private JLabel lblSituatie;	
	private JButton btnNewButton;
	

	public AlegereCursGUI() {
		initialize();
	}
	
	private void initialize() {
		/*
		 * setBounds(X, Y, width, height)
		 * coordonata X
		 * coordonata Y
		 * width - latimea
		 * height - lungimea
		 */
		
		cursFactory = new CourseFactory();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		
		JLabel lblTitlu = new JLabel("Selectarea Optionalelor Universitare");
		lblTitlu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitlu.setBounds(10, 0, 336, 32);
		
		
		/*************Nume**************/
		//Label pentru nume
		lblNume = new JLabel("Nume:");
		lblNume.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNume.setBounds(10, 40, 82, 20);
		
		//TextField Nume
		firstNameField = new JTextField();		
		firstNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		firstNameField.setBounds(88, 40, 206, 20);
		firstNameField.setColumns(15);
		/*******************************/
		
		
		/*************Prenume***********/
		//Label pentru prenume
		lblPrenume = new JLabel("Prenume:");
		lblPrenume.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrenume.setBounds(10, 70, 106, 20);
		
		//TextField Prenume		
		lastNameField = new JTextField();		
		lastNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lastNameField.setBounds(88, 70, 206, 20);
		lastNameField.setColumns(25);
		/*******************************/
		
		
		/*************An****************/
		//Label selectare an
		lblAn = new JLabel("An:");
		lblAn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAn.setBounds(10, 100, 45, 20);
		
		//selectare an
		anStudiu = new JComboBox<>();		
		anStudiu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		anStudiu.setModel(new DefaultComboBoxModel<String>(new String[] {" ","I", "II", "III"}));
		anStudiu.setEditable(true);
		anStudiu.setBounds(88, 100, 45, 20);		
		/**************************************/
		
		
		/*************Media********************/
		//Label pt media
		lblMedia = new JLabel("Media:");
		lblMedia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMedia.setBounds(10, 130, 74, 20);
		//text field pt introducerea mediei anuale
		txtMedia = new JTextField();
		txtMedia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMedia.setColumns(25);
		txtMedia.setBounds(88, 130, 48, 20);
		/**************************************/
		
		
		/*************Situatie******************/
		lblSituatie = new JLabel("Situatie:");
		lblSituatie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSituatie.setBounds(10, 160, 74, 20);
		//radio butoane pt Integralist si neintegralist
		rdbtnIntegralist = new JRadioButton("Integralist");
		rdbtnIntegralist.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnIntegralist.setBounds(84, 160, 109, 20);		
		rdbtnNeIntegralist = new JRadioButton("Neintegralist");
		rdbtnNeIntegralist.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNeIntegralist.setBounds(84, 190, 109, 20);
		
		//am creat button grup pentru a ramane selectat doar un singur radiobuton
		btnGrup = new ButtonGroup();
		btnGrup.add(rdbtnIntegralist);
		btnGrup.add(rdbtnNeIntegralist);
		/**************************************/
		
		/*************Buton verificare*********/
		btnNewButton = new JButton("Verifica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitForm();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(88, 223, 206, 43);
		panel.setLayout(null);
		/**************************************/
		
		/*************Rezultatul***************/
		txtRezultat = new JTextArea();
		
		txtRezultat.setBackground(Color.WHITE);
		txtRezultat.setEditable(false);
		txtRezultat.setEnabled(false);
		txtRezultat.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		// Set line wrap and word wrap to true
		txtRezultat.setLineWrap(true);
		txtRezultat.setWrapStyleWord(true);
		
		// Set the maximum number of visible lines
		txtRezultat.setMaximumSize(new Dimension(Integer.MAX_VALUE, 
												 txtRezultat.getPreferredSize().height * 5));
		
		txtRezultat.setBounds(10, 277, 336, 113);		
		txtRezultat.setColumns(10);
		txtRezultat.setSelectionColor(Color.BLACK);
		/**************************************/
		
		panel.add(lblNume);
		panel.add(firstNameField);
		panel.add(lblPrenume);
		panel.add(lastNameField);
		panel.add(anStudiu);
		panel.add(btnNewButton);
		panel.add(rdbtnIntegralist);
		panel.add(rdbtnNeIntegralist);
		panel.add(lblAn);		
		panel.add(lblSituatie);		
		panel.add(lblTitlu);		
		panel.add(lblMedia);		
		panel.add(txtMedia);
		panel.add(txtRezultat);
		
	}
	
	public void submitForm() {		
		String firstName = firstNameField.getText();
		String lastName = lastNameField.getText();
		String year = (String) anStudiu.getSelectedItem();
		
		
		try {
			//verificare daca "AN I" este selectat
			 if ("I".equals(year)) {
		            throw new IllegalArgumentException("Studentul este in anul I, nu poate alege optionale.");
		     	}
			 
			//atentionare din caz de casuta nume si prenume este goala
			if(firstName.isEmpty() || lastName.isEmpty()) {
				throw new IllegalArgumentException("Nu ai introdus numele si prenumele");
				}
			
			//atentionare din caz de casuta nota este goala
			String notaText = txtMedia.getText().trim();
	        if (notaText.isEmpty()) {
	            throw new IllegalArgumentException("Casuta nota nu poate fi goala");
	        	}	
	        
			double nota = Double.parseDouble(txtMedia.getText());
			Course cursSelectat = cursFactory.alegeCurs(year, nota);
			
			if(rdbtnIntegralist.isSelected()) {
				if (cursSelectat != null) {				
					String cursAles = cursSelectat.enroll();
					txtRezultat.setSelectedTextColor(Color.BLACK);
					txtRezultat.setText("Studentul:" + "\n" +
										"Nume: " + firstName + "\n" +
										"Prenume: " + lastName +"\n" +
										"Anul: " + year + "\n" +
										"Poate fi inscris la cursul optional: " + "\n" + cursAles);
				}else {
					txtRezultat.setText("Nota prea mica pentru optional.");
				}
				
			} else if(rdbtnNeIntegralist.isSelected()) {
				txtRezultat.setText("Ne pare rau, nu esti integralist.");
			}
			
		} catch (NumberFormatException e) {
	        // mesaj pt casuta goala de la nota
	        txtRezultat.setText("Introduceti o valoare valida pentru media anuala");
	    } catch (IllegalArgumentException e) {
	        // arata mesaj din caz de casuta este goala
	        txtRezultat.setText(e.getMessage());
	    }
			
	}

}
