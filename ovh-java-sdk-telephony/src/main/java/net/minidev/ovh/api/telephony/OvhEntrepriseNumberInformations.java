package net.minidev.ovh.api.telephony;

/**
 * Task informations about an entreprise
 */
public class OvhEntrepriseNumberInformations {
	/**
	 * Address of the entreprise
	 *
	 * canBeNull
	 */
	public String address;

	/**
	 * Short version of the entreprise number (FR only)
	 *
	 * canBeNull
	 */
	public String siren;

	/**
	 * Entreprise number
	 *
	 * canBeNull
	 */
	public String entrepriseNumber;

	/**
	 * Is this a valid entreprise number?
	 *
	 * canBeNull
	 */
	public Boolean isValid;

	/**
	 * Entreprise's category code for directory services
	 *
	 * canBeNull
	 */
	public String ape;

	/**
	 * Name of the entreprise
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Brand of the entreprise
	 *
	 * canBeNull
	 */
	public String brand;
}
