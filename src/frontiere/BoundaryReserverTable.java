package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private ControlReserverTable controlReserverTable;
	private Scanner scanner = new Scanner(System.in);
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez-cous reserver?");
		
		int mois = Clavier.entrerEntier("Pour quel mois?");
		while(mois < 1 || mois > 12) {
			mois = Clavier.entrerEntier("Mauvaise utilisation! Choisissez un mois correct!");
		}
		
		int nbJours = 0;
		if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) nbJours = 31;
		if(mois == 4 || mois == 6 || mois == 9 || mois == 11) nbJours = 30;
		if(mois == 2) nbJours = 28;
		
		int jour = Clavier.entrerEntier("Pour quel jour?");
		while(jour < 1 || jour > nbJours) {
			jour = Clavier.entrerEntier("Mauvaise utilisation! Choisissez un jour correct!");
		}
		
		int nbPers = Clavier.entrerEntier("Pour combien de personnes?");
		
		int service = Clavier.entrerEntier("Pour quel service?");
		while(service != 1 || service != 2) {
			jour = Clavier.entrerEntier("Mauvaise utilisation! Choisissez un service entre 1 et 2!");
		}
		
		int[] possibilites = controlReserverTable.trouverPossibilite(jour, mois, nbPers, service);
		System.out.println("Table possibles:\n");
		for(int i = 1; i < possibilites.length; i++) {
			System.out.println(" - numero de table : " + possibilites[i]);
		}
		
		int choix = Clavier.entrerEntier("Choisissez votre table");
		while(choix < 1 || choix > possibilites.length) {
			choix = Clavier.entrerEntier("Choisissez une table possible");
		}
		controlReserverTable.reserver(numClient, choix, possibilites[0]);
	}

}
