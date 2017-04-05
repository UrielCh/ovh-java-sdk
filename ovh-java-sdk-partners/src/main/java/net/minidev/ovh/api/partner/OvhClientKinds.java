package net.minidev.ovh.api.partner;

/**
 * Possible choices for clientKinds
 */
public class OvhClientKinds {
	/**
	 * Medium Business
	 *
	 * canBeNull && readOnly
	 */
	public Boolean mediumBusiness;

	/**
	 * Public Sector
	 *
	 * canBeNull && readOnly
	 */
	public Boolean publicSector;

	/**
	 * Other (specify)
	 *
	 * canBeNull && readOnly
	 */
	public String other;

	/**
	 * Individual
	 *
	 * canBeNull && readOnly
	 */
	public Boolean individual;

	/**
	 * Startup
	 *
	 * canBeNull && readOnly
	 */
	public Boolean startup;

	/**
	 * Associations
	 *
	 * canBeNull && readOnly
	 */
	public Boolean association;

	/**
	 * Large Group
	 *
	 * canBeNull && readOnly
	 */
	public Boolean largeGroup;
}
