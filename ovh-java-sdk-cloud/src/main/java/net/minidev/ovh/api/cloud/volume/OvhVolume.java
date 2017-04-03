package net.minidev.ovh.api.cloud.volume;

import java.util.Date;

/**
 * Volume
 */
public class OvhVolume {
	/**
	 * Volume size (in GB)
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

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
	 * Volume creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Volume type
	 *
	 * canBeNull && readOnly
	 */
	public OvhVolumeTypeEnum type;

	/**
	 * Volume bootable
	 *
	 * canBeNull && readOnly
	 */
	public Boolean bootable;

	/**
	 * Volume status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
