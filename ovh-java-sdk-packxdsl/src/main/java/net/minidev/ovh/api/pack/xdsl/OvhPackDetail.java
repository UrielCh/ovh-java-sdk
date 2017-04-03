package net.minidev.ovh.api.pack.xdsl;

import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;

/**
 * Information about pack xdsl
 */
public class OvhPackDetail {
	/**
	 * Number of the line
	 *
	 * canBeNull
	 */
	public String number;

	/**
	 * Name of the pack
	 *
	 * canBeNull
	 */
	public String packname;

	/**
	 * Reference of the access
	 *
	 * canBeNull
	 */
	public String accessname;

	/**
	 * Description of the access
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Type of the access
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum type;
}
