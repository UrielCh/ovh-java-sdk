package net.minidev.ovh.api.cloud.imageregion;

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
	public OvhImageTypeEnum type;

	/**
	 * Image creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Minimum disks required to use image (in GiB)
	 *
	 * canBeNull && readOnly
	 */
	public Long minDisk;

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
	 * Minimum RAM required to use image (in GiB)
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
	 * Image category. 'official' are public images provided by OVH, 'customer' are imported images or instance snapshots, 'shared' are shared images from other projects
	 *
	 * canBeNull && readOnly
	 */
	public OvhImageCategoryEnum category;

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
