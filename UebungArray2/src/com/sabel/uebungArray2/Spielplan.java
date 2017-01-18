package com.sabel.uebungArray2;

import java.util.ArrayList;

public class Spielplan {

	private ArrayList<Mannschaft> mannschaften;

	public Spielplan() {
		this.mannschaften = new ArrayList<>();
	}
	


	public void anmelden(Mannschaft mannschaft) {
		this.mannschaften.add(mannschaft);

	}

	public String toString () {
		String ausgabe = "Alle Mannschaften: \r\n";
		for (Mannschaft mannschaft : mannschaften) {
			ausgabe += mannschaft.getTeamname() + "\r\n";
		}
		return ausgabe;
		}

	public Mannschaft gibMannschaften(int index) {
		if (index < 0 ||index >= mannschaften.size()) {
			System.out.println("Falscher index");
			return null;
		}
	return mannschaften.get(index);
	
	}

}