package jmbgAlgoritam;

import javax.swing.JOptionPane;

public class PolitickiRegionRodjenja {
	private String[] stranci = new String[] {
			"stranci u BiH","stranci u Crnoj Gori","stranci u Hrvatskoj","stranci u Makedoniji","stranci u Sloveniji",
			"stranci u Srbiji","stranci u Vojvodini","stranci na Kosovu i Metohiji"
	};
	
	private String[] gradoviBiH =  new String[] {
			"Banja Luka","Bihać", "Doboj", "Goražde", "Livno", "Mostar","Prijedor", "Sarajevo", "Tuzla", "Zenica"
	};
	
	private String[] gradoviCrnaGora = new String[] {
			"Podgorica", "Nikšić", "Pljevlja"
	};
	
	private String[] gradoviHrvatska = new String[] {
			"Osijek, Slavonija region", "Bjelovar, Virovitica, Koprivnica, Pakrac, Podravina region", "Varaždin, Međimurje region",
			"Zagreb", "Karlovac","Gospić, Lika region", "Rijeka, Pula, Istra, Primorje region", "Sisak, Banovina region",
			"Split, Zadar, Dubrovnik, Dalmacija region", "ostalo"
	}; 
	
	private String[] gradoviMakedonija = new String[] {
			"Bitola", "Kumanovo", "Ohrid", "Prilep", "Skoplje", "Strumica", "Tetovo", "Veles", "Štip"
	};
	
	private String[] gradoviCenSrbija = new String[] {
			"Beograd region", "Šumadija", "Niš region", "Južna Morava", "Zaječar", "Podunavlje", "Podrinje i Kolubara", "Kraljevo region", "Užice region"
	};
	
	private String[] gradoviAPV = new String[] {
			"Novi Sad region", "Sombor region", "Subotica region", "Zrenjanin region", "Pančevo region", "Kikinda region", "Ruma region", "Sremska Mitrovica region"
	};
	
	private String[] gradoviAPKiM = new String[] {
			"Priština region", "Kosovska Mitrovica region", "Peć region", "Đakovica region", "Prizren region", "Kosovsko Pomoravski okrug"
	};
	
	public String pprKalkulator(String jmbg) throws NumberFormatException {
		try {
			Integer.parseInt(jmbg.substring(7, 9));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "JMBG treba da se sastoji samo od brojeva!", "Pogrešan input", JOptionPane.ERROR_MESSAGE);
		}
		if(Integer.parseInt(jmbg.substring(7, 9)) == 50) {
				return "Slovenija";
		}
		else if(Integer.parseInt(jmbg.substring(7, 9)) >= 71) {
			if (Integer.parseInt(jmbg.substring(7, 9)) >= 80) {
				if (Integer.parseInt(jmbg.substring(7, 9)) >= 91) {
					switch(jmbg.substring(7, 9)){
					case "91":
						return gradoviAPKiM[0];
					case "92":
						return gradoviAPKiM[1];
					case "93":
						return gradoviAPKiM[2];
					case "94":
						return gradoviAPKiM[3];
					case "95":
						return gradoviAPKiM[4];
					case "96":
						return gradoviAPKiM[5];
					default:
						return "JMBG nije validan";
					}
				}
				else {
					switch(jmbg.substring(7, 9)){
					case "80":
						return gradoviAPV[0];
					case "81":
						return gradoviAPV[1];
					case "82":
						return gradoviAPV[2];
					case "85":
						return gradoviAPV[3];
					case "86":
						return gradoviAPV[4];
					case "87":
						return gradoviAPV[5];
					case "88":
						return gradoviAPV[6];
					case "89":
						return gradoviAPV[7];
					default:
						return "JMBG nije validan";
				}
				}
			} else {
				switch(jmbg.substring(7, 9)){
				case "71":
					return gradoviCenSrbija[0];
				case "72":
					return gradoviCenSrbija[1];
				case "73":
					return gradoviCenSrbija[2];
				case "74":
					return gradoviCenSrbija[3];
				case "75":
					return gradoviCenSrbija[4];
				case "76":
					return gradoviCenSrbija[5];
				case "77":
					return gradoviCenSrbija[6];
				case "78":
					return gradoviCenSrbija[7];
				case "79":
					return gradoviCenSrbija[8];
				default:
					return "JMBG nije validan";
				}
			}	
		}
		else if (Integer.parseInt(jmbg.substring(7, 9)) <= 49) {
			if(Integer.parseInt(jmbg.substring(7, 9)) < 41) {
				if(Integer.parseInt(jmbg.substring(7, 9)) < 30) {
					if(Integer.parseInt(jmbg.substring(7, 9)) < 21) {
						if(Integer.parseInt(jmbg.substring(7, 9)) < 10) {
							switch(jmbg.substring(7, 9)) {
							case "01":
								return stranci[0];
							case "02":
								return stranci[1];	
							case "03":
								return stranci[2];
							case "04":
								return stranci[3];
							case "05":
								return stranci[4];
							case "06":
								return stranci[5];
							case "07":
								return stranci[6];
							case "08":
								return stranci[7];
							case "09":
								return stranci[8];
							}
						} else {
							switch(jmbg.substring(7, 9)) {
							case "10":
								return gradoviBiH[0];
							case "11":
								return gradoviBiH[1];
							case "12":
								return gradoviBiH[2];
							case "13":
								return gradoviBiH[3];
							case "14":
								return gradoviBiH[4];
							case "15":
								return gradoviBiH[5];
							case "16":
								return gradoviBiH[6];
							case "17":
								return gradoviBiH[7];
							case "18":
								return gradoviBiH[8];
							case "19":
								return gradoviBiH[9];
							}
						}
						
					} else {
						switch(jmbg.substring(7, 9)) {
						case "21":
							return gradoviCrnaGora[0];
						case "26":
							return gradoviCrnaGora[1];
						case "29":
							return gradoviCrnaGora[2];
						default:
							return "JMBG nije validan";
						}
					}
				}
				else {
					switch(jmbg.substring(7, 9)) {
					case "30":
						return gradoviHrvatska[0];
					case "31":
						return gradoviHrvatska[1];	
					case "32":
						return gradoviHrvatska[2];
					case "33":
						return gradoviHrvatska[3];
					case "34":
						return gradoviHrvatska[4];
					case "35":
						return gradoviHrvatska[5];
					case "36":
						return gradoviHrvatska[6];
					case "37":
						return gradoviHrvatska[7];
					case "38":
						return gradoviHrvatska[8];
					case "39":
						return gradoviHrvatska[9];
					}
				}
			} else {
				switch(jmbg.substring(7, 9)) {
				case "41":
					return gradoviMakedonija[0];
				case "42":
					return gradoviMakedonija[1];
				case "43":
					return gradoviMakedonija[2];
				case "44":
					return gradoviMakedonija[3];
				case "45":
					return gradoviMakedonija[4];
				case "46":
					return gradoviMakedonija[5];
				case "47":
					return gradoviMakedonija[6];
				case "48":
					return gradoviMakedonija[7];
				case "49":
					return gradoviMakedonija[8];
				default:
					return "JMBG nije validan";
				}
			}
		}
		return "JMBG nije validan";
	}
}
