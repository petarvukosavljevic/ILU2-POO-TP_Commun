package model;

public abstract class EntiteReservable <T extends Formulaire>{
	private int numero;
	private CalendrierAnnuel calendrier;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(T formunlaire) {
		return calendrier.estLibre(formunlaire.getJour(), formunlaire.getMois());
	}
	
	public abstract boolean compatible(T formulaire);
	
	public abstract Reservation reserver(T formulaire);
}
