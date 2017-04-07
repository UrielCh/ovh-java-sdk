package net.minidev.ovh.api.image;

import java.util.Date;

/**
 * 
 */
public class OvhImageDetail {
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
	 * Minimum RAM required to use image
	 *
	 * canBeNull && readOnly
	 */
	public int minRam;

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
	 * Image creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Image region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Minimum disks required to use image
	 *
	 * canBeNull && readOnly
	 */
	public int minDisk;

	/**
	 * Image status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
