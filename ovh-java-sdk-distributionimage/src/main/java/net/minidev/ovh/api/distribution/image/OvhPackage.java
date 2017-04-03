package net.minidev.ovh.api.distribution.image;

/**
 * An image package description
 */
public class OvhPackage {
	/**
	 * Package name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Package alias
	 *
	 * canBeNull && readOnly
	 */
	public String alias;

	/**
	 * Package version
	 *
	 * canBeNull && readOnly
	 */
	public String version;
}
