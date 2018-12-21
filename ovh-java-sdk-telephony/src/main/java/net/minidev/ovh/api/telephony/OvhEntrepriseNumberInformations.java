package net.minidev.ovh.api.telephony;

/**
 * Task informations about an entreprise
 */
public class OvhEntrepriseNumberInformations {
	/**
	 * Short version of the entreprise number (FR only)
	 *
	 * canBeNull
	 */
	public String siren;

	/**
	 * Address of the entreprise
	 *
	 * canBeNull
	 */
	public String address;

	/**
	 * Entreprise number
	 *
	 * canBeNull
	 */
	public String entrepriseNumber;

	/**
	 * Entreprise's category code for directory services
	 *
	 * canBeNull
	 */
	public String ape;

	/**
	 * Is this a valid entreprise number?
	 *
	 * canBeNull
	 */
	public Boolean isValid;

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
