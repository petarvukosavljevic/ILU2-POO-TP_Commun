package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	protected Reservation(int jour, int mois) {
		this.mois = mois;
		this.jour = jour;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
}
