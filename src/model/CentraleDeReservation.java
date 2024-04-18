package model;

public abstract class CentraleDeReservation <E extends EntiteReservable<T>, T extends Formulaire> {
	private int nEntite;
	private E[] tab;
	
	protected CentraleDeReservation(int nEntite, E[] tab) {
		this.nEntite = nEntite;
		this.tab = tab;
	}
	
	public int ajouterEntite(E entite) {
		tab[nEntite] = entite;
		nEntite++;
		return nEntite;
	}
	
	public int[] donnerPossiblilites(T formulaire) {
		int[] tabentier = new int[nEntite];
		for(int i = 0; i < nEntite; i++) {
			if(tab[i].compatible(formulaire)) {
				tabentier[i] = nEntite;
			} else {
				tabentier[i] = 0;
			}
		}
		return tabentier;
	}
	
	public Reservation reserver(int entite, T formulaire) {
		formulaire.setIdentificationEntite(entite);
		return tab[entite].reserver(formulaire);
	}
}
