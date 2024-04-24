package model;

public interface IEtablissement <T extends Formulaire> {
	
	public int[] donnerPossibilites(T formulaire);
	
	public Reservation reserver(int nEntite, T formulaire);
	
}
