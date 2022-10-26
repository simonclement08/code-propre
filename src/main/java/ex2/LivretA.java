package ex2;

public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(TypeCompte.LIVRETA, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}	
	}
	
	/**
	 * Permet d'appliquer la rémunération du livret A
	 */
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
