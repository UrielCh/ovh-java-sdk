package net.minidev.ovh.api.volume;

import java.util.Date;

/**
 * 
 */
public class OvhVolume {
	/**
	 * Volume size (in GiB)
	 *
	 * canBeNull && readOnly
	 */
	public int size;

	/**
	 * canBeNull && readOnly
	 */
	public Date created;

	/**
	 * Volume name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Volume description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Volume id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Volume attached to instances id
	 *
	 * canBeNull && readOnly
	 */
	public String[] attachedTo;

	/**
	 * Volume region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Volume type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Volume status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
