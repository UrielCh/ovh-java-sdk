package net.minidev.ovh.api.horizonview;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.horizonview.filer.OvhStateEnum;

/**
 * Cloud Desktop Infrastructure storages
 */
public class OvhStorage {
	/**
	 * Provisionned space of this datastore, in GB
	 *
	 * canBeNull && readOnly
	 */
	public Double spaceProvisionned;

	/**
	 * Filer capacity
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> size;

	/**
	 * Used Space of this filer, in GB
	 *
	 * canBeNull && readOnly
	 */
	public Double spaceUsed;

	/**
	 * Commercial profile name
	 *
	 * canBeNull && readOnly
	 */
	public String profile;

	/**
	 * Filer name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * State of the filer
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Storage ids
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Available space of this datastore, in GB
	 *
	 * canBeNull && readOnly
	 */
	public Double spaceFree;

	/**
	 * Number of virtual machine on the filer
	 *
	 * canBeNull && readOnly
	 */
	public Long vmTotal;

	/**
	 * Human-Readable profile name
	 *
	 * canBeNull && readOnly
	 */
	public String fullProfile;
}
