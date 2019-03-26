package net.minidev.ovh.api.cloud.image;

import java.util.Date;

/**
 * Image
 */
public class OvhImage {
	/**
	 * Image visibility
	 *
	 * canBeNull && readOnly
	 */
	public String visibility;

	/**
	 * Image type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Image creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Minimum disks required to use image
	 *
	 * canBeNull && readOnly
	 */
	public Long minDisk;

	/**
	 * Order plan code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Tags about the image
	 *
	 * canBeNull && readOnly
	 */
	public String[] tags;

	/**
	 * Image usable only for this type of flavor if not null
	 *
	 * canBeNull && readOnly
	 */
	public String flavorType;

	/**
	 * Image size (in GiB)
	 *
	 * canBeNull && readOnly
	 */
	public Double size;

	/**
	 * Minimum RAM required to use image
	 *
	 * canBeNull && readOnly
	 */
	public Long minRam;

	/**
	 * Image name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Image id
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

	/**
	 * User to connect with
	 *
	 * canBeNull && readOnly
	 */
	public String user;

	/**
	 * Image status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
