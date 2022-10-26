package ex1;

import java.util.Date;

public class Entreprise {

	/** Siret de l'entreprise */
	private int siret;
	/** Nom de l'entreprise */
	private String nom;
	/** Adresse de l'entreprise */
	private String adresse;
	/** Date de création de l'entreprise */
	private Date dateCreation;

	/** Capital max de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Affiche le statut
	 */
	public void afficherStatut(){
		
	}
	
	/** Getter pour l'attribut siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter pour l'attribut siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter pour l'attribut adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter pour l'attribut dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter pour l'attribut dateCreation
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
