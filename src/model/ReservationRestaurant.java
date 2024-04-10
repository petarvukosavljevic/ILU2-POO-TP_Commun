package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;

	protected ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	
	public String toString() {
		StringBuilder message = new StringBuilder();
		message.append("Le " + this.getJour() + "/" + this.getMois() + "\nTable " + numTable + " pour le ");
		if(numService == 1) {
			message.append("premier service.");
		} else if (numService == 2) {
			message.append("deuxième service.");
		}
		return message.toString();
	}
}
