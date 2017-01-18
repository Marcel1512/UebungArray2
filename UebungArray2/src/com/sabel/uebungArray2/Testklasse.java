package com.sabel.uebungArray2;

public class Testklasse {

	public static void main(String[] args) {
		Spieler spieler0 = new Spieler("Neuer", "Tor");
		String info = spieler0.toString();
		spieler0.druckeInfo();
		spieler0.TorGeschossen();
		spieler0.druckeInfo();

		Mannschaft mannschaft = new Mannschaft("Fc Bayern");

		Spieler ausgewechselterSpieler = mannschaft.aufstellen(spieler0, 0);
		if (ausgewechselterSpieler != null) {
			System.out.println("Der Abend ist für Ihn heute gelaufen");
		} else {
			System.out.println("Kein Spieler ausgewechselt");
		}

		Spieler spieler1 = new Spieler("Ulreich", "Tor");
		ausgewechselterSpieler = mannschaft.aufstellen(spieler1, 0);
		if (ausgewechselterSpieler != null) {
			System.out.println("Der Abend ist für Ihn heute gelaufen" + " " + ausgewechselterSpieler);
		} else {
			System.out.println("Kein Spieler ausgewechselt");
		}
		mannschaft.ausgabeMannschaft();

		Spieler spieler10 = new Spieler("Kiboto Mane", "Stürmer");
		mannschaft.aufstellen(spieler10, 10);
		for (int i = 0; i < 12; i++) {
			spieler10.TorGeschossen();
		}

		Spieler spieler9 = new Spieler("Wagenhuber", "Stürmer");
		mannschaft.aufstellen(spieler9, 9);
		for (int i = 0; i < 15; i++) {
			spieler9.TorGeschossen();
		}

		mannschaft.aufstellen(spieler0, 0);
		mannschaft.ausgabeMannschaft();
		System.out.println(mannschaft.anzahlTore() + " " + "Tore Geballert");

		Spieler koenig = mannschaft.gibTorschuetzenkoenig();
		if (koenig != null) {
			System.out.println("König" + " " + koenig);
		} else
			System.out.println(" Es gibt keinen König");

		Mannschaft mannschaft2 = new Mannschaft("Hertha BSC");
		Spielplan spielplan = new Spielplan();
		spielplan.anmelden(mannschaft);
		spielplan.anmelden(mannschaft);
		spielplan.anmelden(mannschaft2);
		spielplan.anmelden(new Mannschaft("BVB"));
	}
}
