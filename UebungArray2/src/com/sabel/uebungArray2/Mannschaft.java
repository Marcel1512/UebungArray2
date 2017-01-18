package com.sabel.uebungArray2;

public class Mannschaft {

	private String teamname;
	private Spieler[] aufstellung;

	public Mannschaft() {
		this.aufstellung = new Spieler[11];

	}

	public Mannschaft(String name) {
		this();
		this.teamname = name;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Spieler aufstellen(Spieler spieler, int position) {

		if (position >= aufstellung.length || position < 0) {
			System.out.println("Denk nochmal über deine Position nach");
			return null;
		}
		Spieler Lappenspieler = aufstellung[position];
		aufstellung[position] = spieler;
		return Lappenspieler;

	}

	public void ausgabeMannschaft() {
		System.out.println(this.teamname);
		for (int i = 0; i < aufstellung.length; i++) {
			if (aufstellung[i] != null) {
				System.out.println((i + 1) + " " + aufstellung[i].getName());
			} else {
				System.out.println((i + 1) + " Spieler noch nicht aufgestellt");
			}
		}

	}

	public int anzahlTore() {
		int anzahlTore = 0;
		for (Spieler spieler : aufstellung) {
			if (spieler != null) {
				anzahlTore = spieler.getTore();

			}
		}
		return anzahlTore;
	}

	public Spieler gibTorschuetzenkoenig() {
		Spieler torschuetzenkoenig = null;
		Spieler spieler = null;
		int tore = 0;
		for (int i = 0; i < aufstellung.length; i++) {
			spieler = aufstellung [i];
			if(spieler != null) {
				if (spieler.getTore() > tore ) {
					torschuetzenkoenig = spieler;
					tore = spieler.getTore();
				}
			}
		}
	
	return torschuetzenkoenig;
	}
	
	
	
}
