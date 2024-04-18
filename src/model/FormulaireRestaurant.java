package model;

public class FormulaireRestaurant extends Formulaire {
	private int numService;
	private int numPersonnes;

	protected FormulaireRestaurant(int jour, int mois, int numPersonnes, int numService) {
		super(jour, mois);
		this.numService = numService;
		this.numPersonnes = numPersonnes;
	}

	public int getNumService() {
		return numService;
	}

	public int getNombrePersonnes() {
		return numPersonnes;
	}
	
}
