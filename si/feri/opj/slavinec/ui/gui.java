package si.feri.opj.slavinec.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JList;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.Box;
import java.awt.Rectangle;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import si.feri.opj.slavinec.razredi.Artikel;
import si.feri.opj.slavinec.razredi.Dimenzije;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;

public class gui {
	private static int counterArtikel = 0;
    private static Map<String, Artikel> artikelMap = new HashMap<>();
	private Boolean tezaCena = false;
	
	private JFrame frame;
	private JTextField text_NazivArtikla;
	private JTextField text_VisinaArtikel;
	private JTextField text_SirinaArtikel;
	private JTextField text_DolzinaArtikel;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField text_NazivPosiljke;
	private JTextField text_VisinaPosiljke;
	private JTextField text_SirinaPosiljke;
	private JTextField text_DolzinaPosiljke;
	private JTextField text_TezaArtikel;
	private JTextField text_CenaArtikel;
	private JTable table_IzpisArtikla;
	private JTable table_SpremeniPosiljko;
	private JTextField textField;
	private JTextField text_DatumOdposlanja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(1, 0));
		
		JPanel UpravljanjeArtiklov = new JPanel();
		frame.getContentPane().add(UpravljanjeArtiklov, "name_226105625223200");
		UpravljanjeArtiklov.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ustvari Artikel:");
		lblNewLabel.setBounds(10, 11, 77, 14);
		UpravljanjeArtiklov.add(lblNewLabel);
		
		text_NazivArtikla = new JTextField();
		
		text_NazivArtikla.setBounds(97, 8, 86, 20);
		UpravljanjeArtiklov.add(text_NazivArtikla);
		text_NazivArtikla.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Višina");
		lblNewLabel_1.setBounds(200, 11, 46, 14);
		UpravljanjeArtiklov.add(lblNewLabel_1);
		
		text_VisinaArtikel = new JTextField();
		text_VisinaArtikel.setBounds(236, 8, 86, 20);
		UpravljanjeArtiklov.add(text_VisinaArtikel);
		text_VisinaArtikel.setColumns(10);
		
		text_SirinaArtikel = new JTextField();
		text_SirinaArtikel.setColumns(10);
		text_SirinaArtikel.setBounds(236, 47, 86, 20);
		UpravljanjeArtiklov.add(text_SirinaArtikel);
		
		text_DolzinaArtikel = new JTextField();
		text_DolzinaArtikel.setColumns(10);
		text_DolzinaArtikel.setBounds(236, 85, 86, 20);
		UpravljanjeArtiklov.add(text_DolzinaArtikel);
		
		JLabel lblNewLabel_2 = new JLabel("Spremeni Artikel:");
		lblNewLabel_2.setBounds(10, 176, 86, 14);
		UpravljanjeArtiklov.add(lblNewLabel_2);
		
		JList list_SpremeniArtikel = new JList();
		list_SpremeniArtikel.setBounds(10, 201, 121, 106);
		UpravljanjeArtiklov.add(list_SpremeniArtikel);
		
		JLabel lblNewLabel_3 = new JLabel("Odstrani Artikel:");
		lblNewLabel_3.setBounds(10, 318, 86, 14);
		UpravljanjeArtiklov.add(lblNewLabel_3);
		
		JList list_OdstraniArtikel = new JList();
		list_OdstraniArtikel.setBounds(10, 343, 121, 106);
		UpravljanjeArtiklov.add(list_OdstraniArtikel);
		
		JLabel lblNewLabel_19 = new JLabel("Širina");
		lblNewLabel_19.setBounds(200, 50, 46, 14);
		UpravljanjeArtiklov.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Dolžina");
		lblNewLabel_20.setBounds(200, 88, 46, 14);
		UpravljanjeArtiklov.add(lblNewLabel_20);
		
		JCheckBox chckbx_TezaCenaArtikel = new JCheckBox("Opcijsko(teža,cena)");
		chckbx_TezaCenaArtikel.setBounds(366, 7, 134, 23);
		UpravljanjeArtiklov.add(chckbx_TezaCenaArtikel);
		
		JLabel lblNewLabel_21 = new JLabel("Teža");
		lblNewLabel_21.setBounds(366, 50, 46, 14);
		UpravljanjeArtiklov.add(lblNewLabel_21);
		
		JLabel lblNewLabel_21_1 = new JLabel("Cena");
		lblNewLabel_21_1.setBounds(366, 88, 46, 14);
		UpravljanjeArtiklov.add(lblNewLabel_21_1);
		
		text_TezaArtikel = new JTextField();
		text_TezaArtikel.setColumns(10);
		text_TezaArtikel.setBounds(395, 47, 86, 20);
		UpravljanjeArtiklov.add(text_TezaArtikel);
		
		text_CenaArtikel = new JTextField();
		text_CenaArtikel.setColumns(10);
		text_CenaArtikel.setBounds(395, 85, 86, 20);
		UpravljanjeArtiklov.add(text_CenaArtikel);
		
		table_IzpisArtikla = new JTable();
		table_IzpisArtikla.setBounds(182, 200, 299, 100);
		UpravljanjeArtiklov.add(table_IzpisArtikla);
		
		JButton btn_PotrdiArtikel = new JButton("Potrdi");
		btn_PotrdiArtikel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nazivArtikla = text_NazivArtikla.getText();
				String visinaArtikla = text_VisinaArtikel.getText();
				String dolzinaArtikla = text_DolzinaArtikel.getText();
				String sirinaArtikla = text_SirinaArtikel.getText();
				
				String ArtikelIme = "Artikel" + counterArtikel;
				Artikel ArtikelObj = new Artikel(nazivArtikla, new Dimenzije(Double.parseDouble(visinaArtikla),Double.parseDouble(dolzinaArtikla),Double.parseDouble(sirinaArtikla)));
				artikelMap.put(ArtikelIme, ArtikelObj);
				counterArtikel++;
			}
		});
		btn_PotrdiArtikel.setBounds(544, 7, 89, 23);
		UpravljanjeArtiklov.add(btn_PotrdiArtikel);
		
		JPanel UpravljanjeDepojev = new JPanel();
		frame.getContentPane().add(UpravljanjeDepojev, "name_226376345575000");
		UpravljanjeDepojev.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Urejanje depojev");
		lblNewLabel_4.setBounds(5, 9, 83, 14);
		UpravljanjeDepojev.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Dodaj");
		btnNewButton_2.setBounds(93, 5, 61, 23);
		UpravljanjeDepojev.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Spremeni");
		btnNewButton_3.setBounds(159, 5, 77, 23);
		UpravljanjeDepojev.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Zbriši");
		btnNewButton_4.setBounds(241, 5, 57, 23);
		UpravljanjeDepojev.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Skladisce");
		btnNewButton.setBounds(5, 48, 75, 23);
		UpravljanjeDepojev.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Premium Skladisce");
		btnNewButton_1.setBounds(103, 48, 119, 23);
		UpravljanjeDepojev.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Naziv:");
		lblNewLabel_5.setBounds(5, 96, 30, 14);
		UpravljanjeDepojev.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(78, 93, 86, 20);
		UpravljanjeDepojev.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Lokacija:");
		lblNewLabel_6.setBounds(5, 134, 42, 14);
		UpravljanjeDepojev.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(78, 131, 86, 20);
		UpravljanjeDepojev.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Stevilo posiljk:");
		lblNewLabel_7.setBounds(5, 178, 68, 14);
		UpravljanjeDepojev.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(78, 175, 86, 20);
		UpravljanjeDepojev.add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Kamera");
		chckbxNewCheckBox.setBounds(5, 207, 61, 23);
		UpravljanjeDepojev.add(chckbxNewCheckBox);
		
		JList list_Depoji = new JList();
		list_Depoji.setBounds(268, 51, 188, 179);
		list_Depoji.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		UpravljanjeDepojev.add(list_Depoji);
		
		JButton btn_Potrditev = new JButton("Potrdi");
		btn_Potrditev.setBounds(10, 262, 89, 23);
		UpravljanjeDepojev.add(btn_Potrditev);
		
		JPanel UpravljanjeZPosiljkami = new JPanel();
		frame.getContentPane().add(UpravljanjeZPosiljkami, "name_230345935746800");
		GridBagLayout gbl_UpravljanjeZPosiljkami = new GridBagLayout();
		gbl_UpravljanjeZPosiljkami.columnWidths = new int[]{1, 84, 53, 86, 0, 0, 0, 0};
		gbl_UpravljanjeZPosiljkami.rowHeights = new int[]{23, 14, 20, 20, 20, 20, 0, 68, 0, 40, 94, 100, 14, 0};
		gbl_UpravljanjeZPosiljkami.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_UpravljanjeZPosiljkami.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		UpravljanjeZPosiljkami.setLayout(gbl_UpravljanjeZPosiljkami);
		
		JRadioButton rdbtn_Zaboj = new JRadioButton("Zaboj");
		GridBagConstraints gbc_rdbtn_Zaboj = new GridBagConstraints();
		gbc_rdbtn_Zaboj.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtn_Zaboj.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtn_Zaboj.gridx = 2;
		gbc_rdbtn_Zaboj.gridy = 0;
		UpravljanjeZPosiljkami.add(rdbtn_Zaboj, gbc_rdbtn_Zaboj);
		
		JRadioButton rdbtn_Paket = new JRadioButton("Paket");
		GridBagConstraints gbc_rdbtn_Paket = new GridBagConstraints();
		gbc_rdbtn_Paket.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtn_Paket.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtn_Paket.gridx = 3;
		gbc_rdbtn_Paket.gridy = 0;
		UpravljanjeZPosiljkami.add(rdbtn_Paket, gbc_rdbtn_Paket);
		
		JLabel lblNewLabel_8 = new JLabel(" Dodaj Pošiljko:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridwidth = 2;
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 1;
		UpravljanjeZPosiljkami.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(" Naziv:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridwidth = 2;
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 2;
		UpravljanjeZPosiljkami.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		text_NazivPosiljke = new JTextField();
		GridBagConstraints gbc_text_NazivPosiljke = new GridBagConstraints();
		gbc_text_NazivPosiljke.anchor = GridBagConstraints.NORTHWEST;
		gbc_text_NazivPosiljke.insets = new Insets(0, 0, 5, 5);
		gbc_text_NazivPosiljke.gridx = 3;
		gbc_text_NazivPosiljke.gridy = 2;
		UpravljanjeZPosiljkami.add(text_NazivPosiljke, gbc_text_NazivPosiljke);
		text_NazivPosiljke.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel(" Dimenzije:");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridwidth = 2;
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 3;
		UpravljanjeZPosiljkami.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Višina:");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 2;
		gbc_lblNewLabel_11.gridy = 3;
		UpravljanjeZPosiljkami.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		text_VisinaPosiljke = new JTextField();
		GridBagConstraints gbc_text_VisinaPosiljke = new GridBagConstraints();
		gbc_text_VisinaPosiljke.anchor = GridBagConstraints.NORTHWEST;
		gbc_text_VisinaPosiljke.insets = new Insets(0, 0, 5, 5);
		gbc_text_VisinaPosiljke.gridx = 3;
		gbc_text_VisinaPosiljke.gridy = 3;
		UpravljanjeZPosiljkami.add(text_VisinaPosiljke, gbc_text_VisinaPosiljke);
		text_VisinaPosiljke.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Širina");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 2;
		gbc_lblNewLabel_12.gridy = 4;
		UpravljanjeZPosiljkami.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		text_SirinaPosiljke = new JTextField();
		GridBagConstraints gbc_text_SirinaPosiljke = new GridBagConstraints();
		gbc_text_SirinaPosiljke.anchor = GridBagConstraints.NORTHWEST;
		gbc_text_SirinaPosiljke.insets = new Insets(0, 0, 5, 5);
		gbc_text_SirinaPosiljke.gridx = 3;
		gbc_text_SirinaPosiljke.gridy = 4;
		UpravljanjeZPosiljkami.add(text_SirinaPosiljke, gbc_text_SirinaPosiljke);
		text_SirinaPosiljke.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Dolžina");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 2;
		gbc_lblNewLabel_13.gridy = 5;
		UpravljanjeZPosiljkami.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		text_DolzinaPosiljke = new JTextField();
		GridBagConstraints gbc_text_DolzinaPosiljke = new GridBagConstraints();
		gbc_text_DolzinaPosiljke.anchor = GridBagConstraints.NORTHWEST;
		gbc_text_DolzinaPosiljke.insets = new Insets(0, 0, 5, 5);
		gbc_text_DolzinaPosiljke.gridx = 3;
		gbc_text_DolzinaPosiljke.gridy = 5;
		UpravljanjeZPosiljkami.add(text_DolzinaPosiljke, gbc_text_DolzinaPosiljke);
		text_DolzinaPosiljke.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel(" Datum odposlanja:");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 0;
		gbc_lblNewLabel_18.gridy = 6;
		UpravljanjeZPosiljkami.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		text_DatumOdposlanja = new JTextField();
		GridBagConstraints gbc_text_DatumOdposlanja = new GridBagConstraints();
		gbc_text_DatumOdposlanja.insets = new Insets(0, 0, 5, 5);
		gbc_text_DatumOdposlanja.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_DatumOdposlanja.gridx = 3;
		gbc_text_DatumOdposlanja.gridy = 6;
		UpravljanjeZPosiljkami.add(text_DatumOdposlanja, gbc_text_DatumOdposlanja);
		text_DatumOdposlanja.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Oznaka zaboja:");
		lblNewLabel_22.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 0;
		gbc_lblNewLabel_22.gridy = 7;
		UpravljanjeZPosiljkami.add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		JComboBox comboBox_OznakaZaboja = new JComboBox();
		GridBagConstraints gbc_comboBox_OznakaZaboja = new GridBagConstraints();
		gbc_comboBox_OznakaZaboja.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_OznakaZaboja.gridwidth = 2;
		gbc_comboBox_OznakaZaboja.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_OznakaZaboja.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_OznakaZaboja.gridx = 2;
		gbc_comboBox_OznakaZaboja.gridy = 7;
		UpravljanjeZPosiljkami.add(comboBox_OznakaZaboja, gbc_comboBox_OznakaZaboja);
		
		JButton btn_PotrdiPosiljko = new JButton("Potrdi");
		GridBagConstraints gbc_btn_PotrdiPosiljko = new GridBagConstraints();
		gbc_btn_PotrdiPosiljko.insets = new Insets(0, 0, 5, 5);
		gbc_btn_PotrdiPosiljko.gridx = 0;
		gbc_btn_PotrdiPosiljko.gridy = 8;
		UpravljanjeZPosiljkami.add(btn_PotrdiPosiljko, gbc_btn_PotrdiPosiljko);
		
		JLabel lblNewLabel_23 = new JLabel("Dragocenost:");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 0;
		gbc_lblNewLabel_23.gridy = 9;
		UpravljanjeZPosiljkami.add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		JCheckBox dragocenost = new JCheckBox("");
		GridBagConstraints gbc_dragocenost = new GridBagConstraints();
		gbc_dragocenost.anchor = GridBagConstraints.NORTHWEST;
		gbc_dragocenost.insets = new Insets(0, 0, 5, 5);
		gbc_dragocenost.gridx = 1;
		gbc_dragocenost.gridy = 9;
		UpravljanjeZPosiljkami.add(dragocenost, gbc_dragocenost);
		
		JLabel lblNewLabel_14 = new JLabel(" Spremeni pošiljko:");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridwidth = 2;
		gbc_lblNewLabel_14.gridx = 0;
		gbc_lblNewLabel_14.gridy = 10;
		UpravljanjeZPosiljkami.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		JList list_SpremeniPosiljko = new JList();
		GridBagConstraints gbc_list_SpremeniPosiljko = new GridBagConstraints();
		gbc_list_SpremeniPosiljko.gridwidth = 2;
		gbc_list_SpremeniPosiljko.insets = new Insets(0, 0, 5, 5);
		gbc_list_SpremeniPosiljko.fill = GridBagConstraints.BOTH;
		gbc_list_SpremeniPosiljko.gridx = 2;
		gbc_list_SpremeniPosiljko.gridy = 10;
		UpravljanjeZPosiljkami.add(list_SpremeniPosiljko, gbc_list_SpremeniPosiljko);
		
		table_SpremeniPosiljko = new JTable();
		table_SpremeniPosiljko.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		GridBagConstraints gbc_table_SpremeniPosiljko = new GridBagConstraints();
		gbc_table_SpremeniPosiljko.insets = new Insets(0, 0, 5, 5);
		gbc_table_SpremeniPosiljko.fill = GridBagConstraints.BOTH;
		gbc_table_SpremeniPosiljko.gridx = 5;
		gbc_table_SpremeniPosiljko.gridy = 10;
		UpravljanjeZPosiljkami.add(table_SpremeniPosiljko, gbc_table_SpremeniPosiljko);
		
		JLabel lblNewLabel_15 = new JLabel("Odstrani pošiljko");
		lblNewLabel_15.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_15.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 0;
		gbc_lblNewLabel_15.gridy = 11;
		UpravljanjeZPosiljkami.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JList list_OdstraniPosiljko = new JList();
		GridBagConstraints gbc_list_OdstraniPosiljko = new GridBagConstraints();
		gbc_list_OdstraniPosiljko.gridwidth = 2;
		gbc_list_OdstraniPosiljko.insets = new Insets(0, 0, 5, 5);
		gbc_list_OdstraniPosiljko.fill = GridBagConstraints.BOTH;
		gbc_list_OdstraniPosiljko.gridx = 2;
		gbc_list_OdstraniPosiljko.gridy = 11;
		UpravljanjeZPosiljkami.add(list_OdstraniPosiljko, gbc_list_OdstraniPosiljko);
		
		JPanel UpravljanjeDepojevInPosiljk = new JPanel();
		frame.getContentPane().add(UpravljanjeDepojevInPosiljk, "name_322535249483600");
		SpringLayout sl_UpravljanjeDepojevInPosiljk = new SpringLayout();
		UpravljanjeDepojevInPosiljk.setLayout(sl_UpravljanjeDepojevInPosiljk);
		
		JLabel lblNewLabel_16 = new JLabel("Upravljanje Depojev In Pošiljk:");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, lblNewLabel_16, 10, SpringLayout.NORTH, UpravljanjeDepojevInPosiljk);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, lblNewLabel_16, 10, SpringLayout.WEST, UpravljanjeDepojevInPosiljk);
		UpravljanjeDepojevInPosiljk.add(lblNewLabel_16);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Dodaj");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 12, SpringLayout.SOUTH, lblNewLabel_16);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 10, SpringLayout.WEST, UpravljanjeDepojevInPosiljk);
		UpravljanjeDepojevInPosiljk.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Odstrani");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, 5, SpringLayout.SOUTH, rdbtnNewRadioButton);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1, 0, SpringLayout.WEST, lblNewLabel_16);
		UpravljanjeDepojevInPosiljk.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Depo");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_2, 31, SpringLayout.SOUTH, rdbtnNewRadioButton_1);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_2, 0, SpringLayout.WEST, lblNewLabel_16);
		UpravljanjeDepojevInPosiljk.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Posiljka");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_3, 6, SpringLayout.SOUTH, rdbtnNewRadioButton_2);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_3, 0, SpringLayout.WEST, lblNewLabel_16);
		UpravljanjeDepojevInPosiljk.add(rdbtnNewRadioButton_3);
		
		textField = new JTextField();
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_1, -10, SpringLayout.EAST, textField);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, lblNewLabel_16);
		UpravljanjeDepojevInPosiljk.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Naziv:");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.SOUTH, lblNewLabel_17, -281, SpringLayout.SOUTH, UpravljanjeDepojevInPosiljk);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblNewLabel_17);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, lblNewLabel_17, 0, SpringLayout.WEST, lblNewLabel_16);
		UpravljanjeDepojevInPosiljk.add(lblNewLabel_17);
		
		JList list_Depo = new JList();
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, list_Depo, 3, SpringLayout.NORTH, rdbtnNewRadioButton);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, list_Depo, 100, SpringLayout.EAST, textField);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.SOUTH, list_Depo, 0, SpringLayout.SOUTH, textField);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.EAST, list_Depo, 379, SpringLayout.WEST, UpravljanjeDepojevInPosiljk);
		UpravljanjeDepojevInPosiljk.add(list_Depo);
		
		JButton btn_PotrdiDepoPosiljka = new JButton("Potrdi");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, btn_PotrdiDepoPosiljka, 33, SpringLayout.SOUTH, textField);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, btn_PotrdiDepoPosiljka, 0, SpringLayout.WEST, lblNewLabel_16);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.EAST, btn_PotrdiDepoPosiljka, 0, SpringLayout.EAST, textField);
		UpravljanjeDepojevInPosiljk.add(btn_PotrdiDepoPosiljka);
		
		JList list_Posiljke = new JList();
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, list_Posiljke, 3, SpringLayout.NORTH, rdbtnNewRadioButton);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, list_Posiljke, 26, SpringLayout.EAST, list_Depo);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.SOUTH, list_Posiljke, 0, SpringLayout.SOUTH, textField);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.EAST, list_Posiljke, -55, SpringLayout.EAST, UpravljanjeDepojevInPosiljk);
		UpravljanjeDepojevInPosiljk.add(list_Posiljke);
		
		JList list_Artikli = new JList();
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, list_Artikli, 73, SpringLayout.SOUTH, list_Depo);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, list_Artikli, 0, SpringLayout.WEST, list_Depo);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.SOUTH, list_Artikli, -23, SpringLayout.SOUTH, UpravljanjeDepojevInPosiljk);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.EAST, list_Artikli, 0, SpringLayout.EAST, list_Depo);
		UpravljanjeDepojevInPosiljk.add(list_Artikli);
		
		JLabel lblNewLabel_24 = new JLabel("Depoji:");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, lblNewLabel_24, 0, SpringLayout.NORTH, lblNewLabel_16);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, lblNewLabel_24, 0, SpringLayout.WEST, list_Depo);
		UpravljanjeDepojevInPosiljk.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Posiljke:");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.NORTH, lblNewLabel_25, 0, SpringLayout.NORTH, lblNewLabel_16);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, lblNewLabel_25, 0, SpringLayout.WEST, list_Posiljke);
		UpravljanjeDepojevInPosiljk.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Artikli:");
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.WEST, lblNewLabel_26, 0, SpringLayout.WEST, list_Depo);
		sl_UpravljanjeDepojevInPosiljk.putConstraint(SpringLayout.SOUTH, lblNewLabel_26, 0, SpringLayout.SOUTH, btn_PotrdiDepoPosiljka);
		UpravljanjeDepojevInPosiljk.add(lblNewLabel_26);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton btn_Nazaj = new JButton("Nazaj");
		menuBar.add(btn_Nazaj);
		
		JButton btn_Naprej = new JButton("Naprej");
		menuBar.add(btn_Naprej);
	}
}
