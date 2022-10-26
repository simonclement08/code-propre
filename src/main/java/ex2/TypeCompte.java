package ex2;

/**
 * Les différents type de compte possible
 *
 */
public enum TypeCompte {
	COMPTECOURANT("CC"), LIVRETA("LA");
	
	/** Code type de compte */
	private String code;

	/**
	 * @param code
	 */
	private TypeCompte(String code) {
		this.code = code;
	}

	/** Getter pour l'attribut code
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/** Setter pour l'attribut code
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
}
