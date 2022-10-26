package ex3;

public class Animal {
	/** Nom de l'animal */
	private String nom;
	/** Type de l'animal */
	private String type;
	/** Comportement de l'animal */
	private String comportement;

	/**
	 * @param nom          : nom de l'animal
	 * @param type         : type de l'animal
	 * @param comportement : comportement de l'animal
	 */
	public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return this.getNom() + " " + this.getType() + " " + this.getComportement();
	}

	/**
	 * Getter pour l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter pour l'attribut type
	 * 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter pour l'attribut comportement
	 * 
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter pour l'attribut comportement
	 * 
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

}
