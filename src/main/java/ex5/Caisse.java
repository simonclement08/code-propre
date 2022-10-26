package ex5;

import java.util.List;

public class Caisse {
	/** Nom de la caisse */
	private String nom;
	/** Poids minimum d'un item dans la caisse */
	private int poidsMini;
	/** Poids maximum d'un item dans la caisse */
	private int poidsMax;
	/** Liste des items dans la caisse */
	private List<Item> items;

	/**
	 * Constructeur
	 * 
	 * @param nom      : nom de la caisse
	 * @param poidMini : poids minimum d'un item dans la caisse
	 * @param poidMax  : poids maximum d'un item dans la caisse
	 * @param items    : liste des items dans la caisse
	 */
	public Caisse(String nom, int poidsMini, int poidsMax) {
		super();
		this.nom = nom;
		this.poidsMini = poidsMini;
		this.poidsMax = poidsMax;
	}

	/**
	 * Permet de savoir si l'item est accepté par la caisse
	 * 
	 * @param item
	 * @return un boolean
	 */
	public boolean isValid(Item item) {
		if (item.getPoids() >= poidsMini && item.getPoids() <= poidsMax) {
			return true;
		}
		return false;
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
	 * Getter pour l'attribut poidMini
	 * 
	 * @return the poidMini
	 */
	public int getPoidsMini() {
		return poidsMini;
	}

	/**
	 * Setter pour l'attribut poidsMini
	 * 
	 * @param poidsMini the poidsMini to set
	 */
	public void setPoidsMini(int poidsMini) {
		this.poidsMini = poidsMini;
	}

	/**
	 * Getter pour l'attribut poidsMax
	 * 
	 * @return the poidsMax
	 */
	public int getPoidsMax() {
		return poidsMax;
	}

	/**
	 * Setter pour l'attribut poidsMax
	 * 
	 * @param poidsMax the poidsMax to set
	 */
	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	/**
	 * Getter pour l'attribut items
	 * 
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Setter pour l'attribut items
	 * 
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
