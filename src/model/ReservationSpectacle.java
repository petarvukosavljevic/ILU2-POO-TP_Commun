package model;

public class ReservationSpectacle extends Reservation {
	private int zone;
	private int chaise;

	protected ReservationSpectacle(int jour, int mois, int zone, int chaise) {
		super(jour, mois);
		this.chaise = chaise;
		this.zone = zone;
	}
	
	@Override
	public String toString() {
		return "Le " + this.getJour() + "/" + this.getMois() + " : zone " + this.zone + ", chaise " + this.chaise + ".\n";
	}

}
