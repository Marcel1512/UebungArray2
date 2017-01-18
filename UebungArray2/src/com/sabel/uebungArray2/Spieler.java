package com.sabel.uebungArray2;

public class Spieler {
	// Aufgabe 1
	private String name;
	private String spielposition;
	private int anzahlTore;

	// Aufgabe 2
	public Spieler(String name, String position) {
		this.name = name;
		this.spielposition = position;
		this.anzahlTore = 0;
	}

	// Aufgabe 3
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return spielposition;
	}

	public void setPosition(String position) {
		this.spielposition = position;
	}

	public int getTore() {
		return anzahlTore;
	}

	// Aufgabe 4
	public void TorGeschossen() {
		this.anzahlTore++;

	}

	// Aufgabe 5
	public void druckeInfo() {
		System.out.println(toString());

	}

	public String toString() {
		return name + "," + spielposition + "," + anzahlTore;
	}

	
}
