package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Copper informations
 */
public class OvhCopperInfo {
	/**
	 * Is the number unlisted ? ("sur liste rouge" in french)
	 *
	 * canBeNull
	 */
	public Boolean unlistedNumber;

	/**
	 * Number of maximun available pairs using desaturation. This is given only for an eligibility test.
	 *
	 * canBeNull
	 */
	public Long maxAvailablePairs;

	/**
	 * Number of available pairs. This is given only for an eligibility test.
	 *
	 * canBeNull
	 */
	public Long availablePairs;

	/**
	 * Is the line under construction ? This is given only for an eligibility test.
	 *
	 * canBeNull
	 */
	public Boolean underConstruction;

	/**
	 * NRA ("Nœud de raccordement abonné" in french) is an identifier of the building where is the Main Distribution Frames for the copper line. This is given only for an eligibility test.
	 *
	 * canBeNull
	 */
	public String nra;

	/**
	 * Sections lengths of the copper line. This is given only for an eligibility test.
	 *
	 * canBeNull
	 */
	public OvhSectionLength[] sectionsLengths;

	/**
	 * Status of the copper line
	 *
	 * canBeNull
	 */
	public OvhLineStatusEnum status;
}
