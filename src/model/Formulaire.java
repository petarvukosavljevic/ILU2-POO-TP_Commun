package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int nEntite;
	
	protected Formulaire(int jour, int mois) {
		this.mois = mois;
		this.jour = jour;
	}
	
	public int getIdentificationEntite() {
		return nEntite;
	}

	public void setIdentificationEntite(int nEntite) {
		this.nEntite = nEntite;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
}
