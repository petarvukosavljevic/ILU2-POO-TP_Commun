package model;

public class FormulaireHotel extends Formulaire {
	private int litSimple;
	private int litDouble;

	protected FormulaireHotel(int jour, int mois, int litSimple, int litDouble) {
		super(jour, mois);
		this.litSimple = litSimple;
		this.litDouble = litDouble;
	}

	public int getLitSimple() {
		return litSimple;
	}

	public int getLitDouble() {
		return litDouble;
	}
	
}
