package net.minidev.ovh.api.paas.database.instance;

/**
 * Parameters used for the instance creation
 */
public class OvhParameters {
	/**
	 * Image used in the new instance
	 *
	 * canBeNull
	 */
	public String imageName;

	/**
	 * Offer associated with this new instance
	 *
	 * canBeNull
	 */
	public String offerName;

	/**
	 * Region where you want to run the new instance
	 *
	 * canBeNull
	 */
	public String regionName;

	/**
	 * Custom name
	 *
	 * canBeNull
	 */
	public String name;
}
