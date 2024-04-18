package model;

public class ReservationHotel extends Reservation {
	private int litSimple;
	private int litDouble;
	private int chambre;

	protected ReservationHotel(int jour, int mois, int litSimple, int litDouble, int chambre) {
		super(jour, mois);
		this.litSimple = litSimple;
		this.litDouble = litDouble;
		this.chambre = chambre;
	}
	
	@Override
	public String toString() {
		return "Le " + this.getJour() +"/"  + this.getMois() + " : chambre " + this.chambre + " avec " + this.litSimple + " lit simple et " + this.litDouble + " lit double.\n";
	}

}
