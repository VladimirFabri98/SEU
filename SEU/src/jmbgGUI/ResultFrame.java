package jmbgGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDatumRodjenja;
	private JTextField textFieldMestoRodjenja;
	private JTextField textFieldPol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultFrame frame = new ResultFrame();
					frame.setLocationRelativeTo(null);
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
	public ResultFrame() {
		setTitle("Podaci na osnovu unetog JMBG-a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblDatumRodjenja = new JLabel("Datum rodjenja je: ");
		lblDatumRodjenja.setFont(new Font("Calibri", Font.BOLD, 16));
		
		JLabel lblMestoRodjenja = new JLabel("Mesto rodjenja/region je: ");
		lblMestoRodjenja.setFont(new Font("Calibri", Font.BOLD, 16));
		
		JLabel lblPol = new JLabel("Pol: ");
		lblPol.setFont(new Font("Calibri", Font.BOLD, 16));
		
		textFieldDatumRodjenja = new JTextField();
		textFieldDatumRodjenja.setFont(new Font("Calibri", Font.BOLD, 16));
		textFieldDatumRodjenja.setEditable(false);
		textFieldDatumRodjenja.setColumns(10);
		
		textFieldMestoRodjenja = new JTextField();
		textFieldMestoRodjenja.setFont(new Font("Calibri", Font.BOLD, 16));
		textFieldMestoRodjenja.setEditable(false);
		textFieldMestoRodjenja.setColumns(10);
		
		textFieldPol = new JTextField();
		textFieldPol.setFont(new Font("Calibri", Font.BOLD, 16));
		textFieldPol.setEditable(false);
		textFieldPol.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Calibri", Font.BOLD, 15));
		
		JButton btnNoviJMBG = new JButton("Novi JMBG");
		btnNoviJMBG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				InputGUI.main(null);
			}
		});
		btnNoviJMBG.setFont(new Font("Calibri", Font.BOLD, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(36)
									.addComponent(lblDatumRodjenja, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(10)
									.addComponent(lblMestoRodjenja, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblPol, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(75))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnOk)
							.addGap(44)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNoviJMBG)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textFieldMestoRodjenja, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
							.addComponent(textFieldDatumRodjenja)
							.addGroup(gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textFieldPol, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldDatumRodjenja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDatumRodjenja, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldMestoRodjenja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMestoRodjenja, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPol, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNoviJMBG)
						.addComponent(btnOk))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	public JTextField getTextFieldDatumRodjenja() {
		return textFieldDatumRodjenja;
	}

	public void setTextFieldDatumRodjenja(String textFieldDatumRodjenja) {
		this.textFieldDatumRodjenja.setText(textFieldDatumRodjenja);
	}

	public JTextField getTextFieldMestoRodjenja() {
		return textFieldMestoRodjenja;
	}

	public void setTextFieldMestoRodjenja(String textFieldMestoRodjenja) {
		this.textFieldMestoRodjenja.setText(textFieldMestoRodjenja);
	}

	public JTextField getTextFieldPol() {
		return textFieldPol;
	}

	public void setTextFieldPol(String textFieldPol) {
		this.textFieldPol.setText(textFieldPol);
	}
}
