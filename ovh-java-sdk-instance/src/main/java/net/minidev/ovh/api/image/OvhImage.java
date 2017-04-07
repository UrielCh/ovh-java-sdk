package net.minidev.ovh.api.image;

/**
 * 
 */
public class OvhImage {
	/**
	 * Image visibility
	 *
	 * canBeNull && readOnly
	 */
	public String visibility;

	/**
	 * Is image deprecated?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deprecated;

	/**
	 * Image name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Image unique id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Image region
	 *
	 * canBeNull && readOnly
	 */
	public String region;
}
