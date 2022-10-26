package ex3;

import java.util.List;

public class Zoo {

	/** Nom du zoo */
	private String nom;
	/** Liste des animaux */
	private List<Animal> animals;

	/**
	 * @param nom : nom du zoo
	 */
	public Zoo(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * @param nom     : nom du zoo
	 * @param animals : liste des animaux dans le zoo
	 */
	public Zoo(String nom, List<Animal> animals) {
		super();
		this.nom = nom;
		this.animals = animals;
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	/**
	 * Affiche les animaux présents dans le zoo
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

	/**
	 * @return le nombre de type d'animaux dans le zoo
	 */
	public int taille() {
		return animals.size();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut animals
	 * 
	 * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}

	/**
	 * Setter pour l'attribut animals
	 * 
	 * @param animals the animals to set
	 */
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

}
