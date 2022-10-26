package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 4));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, Integer.MAX_VALUE));
	}

	/**
	 * Ajoute un item dans la bonne caisse
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		for (Caisse caisse : caisses) {
			if (caisse.isValid(item)) {
				caisse.getItems().add(item);
			}
		}
	}

	/**
	 * Calcul le nombre d'item
	 * 
	 * @return le nombre d'item de toutes les caisses
	 */
	public int taille() {

		int taille = 0;
		for (Caisse caisse : caisses) {
			taille = taille + caisse.getItems().size();
		}

		return taille;
	}
}
