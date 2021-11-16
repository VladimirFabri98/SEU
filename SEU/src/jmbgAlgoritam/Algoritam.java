package jmbgAlgoritam;

import javax.swing.JOptionPane;

public class Algoritam {
	private int dan;
	private MesecRodjenja mr =  new MesecRodjenja();
	private String nazivMeseca;
	private String godinaRodjenja;
	private String datumRodjenja;
	
	private PolitickiRegionRodjenja ppr =  new PolitickiRegionRodjenja();
	private String mestoRodjenja;
	private String pomocnaVarPpr;
	
	private String pol;
	private int kontrolniBroj;
	
	public void calculate(String jmbg) throws NumberFormatException {
			try {
				Integer.parseInt(jmbg.substring(0, 2));
				Integer.parseInt(jmbg.substring(4, 7));
				Integer.parseInt(jmbg.substring(9,12));
				Integer.parseInt(jmbg.substring(12,13));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "JMBG treba da se sastoji samo od brojeva!", "Pogrešan input", JOptionPane.ERROR_MESSAGE);
			}
			//Odredjujemo dan rodjenja
			dan = Integer.parseInt(jmbg.substring(0, 2));
			//Odredjujemo mesec rodjenj
			nazivMeseca = mr.odredjivanje(jmbg);
			//Odredjujemo godinu rodjenja
			godinaRodjenja = jmbg.substring(4, 7);
			//Odredjujemo politicki region rodjenja
			pomocnaVarPpr = ppr.pprKalkulator(jmbg);
			//Odredjujemo pol
			if(Integer.parseInt(jmbg.substring(9,12)) <= 499) {
				pol = "Muški";
			}
			else {
				pol = "Ženski";
			}
			if (Integer.parseInt(godinaRodjenja.substring(0, 1)) != 9) {
				datumRodjenja =  dan + ". " + nazivMeseca + " 2" + godinaRodjenja + ". godine";
			}else {
				datumRodjenja =  dan + ". " + nazivMeseca + " 1" + godinaRodjenja +". godine";
			}
				mestoRodjenja =  pomocnaVarPpr;
				
			//Obezbedjujemo exception handling za kontrolni broj iako se ova promenljiva nigde vise ne koristi	
			kontrolniBroj = Integer.parseInt(jmbg.substring(12, 13));
	}
	
	public String getDatumRodjenja() {
		return datumRodjenja;
	}
	
	public String getMestoRodjenja() {
		return mestoRodjenja;
	}
	
	public String getPol() {
		return pol;
	}
}
