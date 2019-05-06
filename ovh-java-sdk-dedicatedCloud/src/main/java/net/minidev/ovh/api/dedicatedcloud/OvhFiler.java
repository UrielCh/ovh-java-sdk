package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.dedicatedcloud.filer.OvhStateEnum;
import net.minidev.ovh.api.dedicatedcloud.ressources.OvhBillingTypeEnum;

/**
 * Private Cloud Filer
 */
public class OvhFiler {
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
	 * Billing type of this filer
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingTypeEnum billingType;

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
	 * Filer Id
	 *
	 * canBeNull && readOnly
	 */
	public Long filerId;

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
	 * Available space of this datastore, in GB
	 *
	 * canBeNull && readOnly
	 */
	public Double spaceFree;

	/**
	 * Human-Readable profile name
	 *
	 * canBeNull && readOnly
	 */
	public String fullProfile;

	/**
	 * Number of virtual machine on the filer
	 *
	 * canBeNull && readOnly
	 */
	public Long vmTotal;
}
