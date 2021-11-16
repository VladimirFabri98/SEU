package jmbgAlgoritam;

import javax.swing.JOptionPane;

public class MesecRodjenja {
	private String[] meseci = new String[] {"Januar","Februar","Mart","April","Maj","Jun","Jul","August","Septembar","Oktobar","Novembar","Decembar"};
	
	public String odredjivanje(String jmbg) throws NumberFormatException {
		try {
			Integer.parseInt(jmbg.substring(2, 4));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "JMBG treba da se sastoji samo od brojeva!", "Pogrešan input", JOptionPane.ERROR_MESSAGE);
		}
		switch (jmbg.substring(2, 4)) {
		case "01":
			return meseci[0];
		case "02":
			return meseci[1];
		case "03":
			return meseci[2];
		case "04":
			return meseci[3];
		case "05":
			return meseci[4];
		case "06":
			return meseci[5];
		case "07":
			return meseci[6];
		case "08":
			return meseci[7];
		case "09":
			return meseci[8];
		case "10":
			return meseci[9];
		case "11":
			return meseci[10];
		case "12":
			return meseci[11];
		default:
			String defaultAnswer = "JMBG nije validan.";
			return defaultAnswer;
	}
	}
}
