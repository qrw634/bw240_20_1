package de.hs_lu.o2s.tut1.loesung;

public class Adressenliste {

	private String[] strasseA = { "Aachener Stra�e", "Berliner Stra�e", "Chemnitzer Stra�e" };
	private String[] hnrA = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };;
	private Adresse[][] adressenAA = new Adresse[strasseA.length][hnrA.length];

	public Adressenliste() {
		for (int i = 0; i < strasseA.length; i++) {
			for (int j = 0; j < hnrA.length; i++) {
				adressenAA[i][j] = new Adresse(strasseA[i], hnrA[j]);
				System.out.println(adressenAA[i][j]);

			}
		}
	}
}