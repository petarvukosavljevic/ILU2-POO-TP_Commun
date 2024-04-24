package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant>{
	private CentraleDeReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centrale;

	
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		centrale.ajouterEntite(table);
		
	}

	@Override
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossiblilites(formulaire);
	}

	@Override
	public Reservation reserver(int i, FormulaireRestaurant formulaire) {
		return centrale.reserver(i, formulaire);
	}
	
	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;
		
		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			if(this.nbChaises == formulaire.getNombrePersonnes()) {
				if(estLibre(formulaire)) return true;
			}
			return false;
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) { //TODO
			
			if(formulaire.getNumService() == 1) {
				if(compatible(formulaire)) {
					
				}
			}
			return null;
		}
		
		
	}

}
