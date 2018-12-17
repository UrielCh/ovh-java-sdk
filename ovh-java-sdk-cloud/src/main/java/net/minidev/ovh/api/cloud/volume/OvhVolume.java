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
	 * Volume creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

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
	public OvhVolumeTypeEnum type;

	/**
	 * Volume attached to instances id
	 *
	 * canBeNull && readOnly
	 */
	public String[] attachedTo;

	/**
	 * Volume bootable
	 *
	 * canBeNull && readOnly
	 */
	public Boolean bootable;

	/**
	 * Order plan code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * Volume status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
