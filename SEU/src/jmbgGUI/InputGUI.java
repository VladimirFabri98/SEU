package jmbgGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jmbgAlgoritam.Algoritam;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InputGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldJMBG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputGUI frame = new InputGUI();
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
	public InputGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		setTitle("Unos JMBG-a");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JLabel label1 = new JLabel("Unesite svoj JMBG:");
		label1.setBounds(new Rectangle(20, 20, 0, 0));
		label1.setAlignmentX(Component.CENTER_ALIGNMENT);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Calibri", Font.BOLD, 16));
		
		textFieldJMBG = new JTextField();
		textFieldJMBG.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textFieldJMBG.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldJMBG.setFont(new Font("Calibri", Font.BOLD, 16));
		textFieldJMBG.setColumns(10);
		GroupLayout gl_panelCenter = new GroupLayout(panelCenter);
		gl_panelCenter.setHorizontalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(28)
					.addComponent(label1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldJMBG, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panelCenter.setVerticalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(label1)
						.addComponent(textFieldJMBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(88))
		);
		panelCenter.setLayout(gl_panelCenter);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!(textFieldJMBG.getText().length() == 13)) {
					JOptionPane.showMessageDialog(null, "JMBG treba da sadrži 13 cifara!", "Pogrešan input", JOptionPane.ERROR_MESSAGE);
				}
				else {
					dispose();
					Algoritam a1 = new Algoritam();
					a1.calculate(textFieldJMBG.getText());
					ResultFrame rFrame = new ResultFrame();
					rFrame.setTextFieldDatumRodjenja(a1.getDatumRodjenja());
					rFrame.setTextFieldMestoRodjenja(a1.getMestoRodjenja());
					rFrame.setTextFieldPol(a1.getPol());
					rFrame.setLocationRelativeTo(null);
					rFrame.setVisible(true);
				}
				
			}
		});
		btnPotvrdi.setBounds(new Rectangle(0, 0, 20, 20));
		btnPotvrdi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPotvrdi.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnPotvrdi.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPotvrdi.setFont(new Font("Calibri", Font.BOLD, 16));
		GroupLayout gl_panelSouth = new GroupLayout(panelSouth);
		gl_panelSouth.setHorizontalGroup(
			gl_panelSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSouth.createSequentialGroup()
					.addGap(145)
					.addComponent(btnPotvrdi))
		);
		gl_panelSouth.setVerticalGroup(
			gl_panelSouth.createParallelGroup(Alignment.LEADING)
				.addComponent(btnPotvrdi)
		);
		panelSouth.setLayout(gl_panelSouth);
	}
}
