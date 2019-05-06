package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.ressources.OvhBillingTypeEnum;
import net.minidev.ovh.api.dedicatedcloud.ressources.OvhResourceTypeEnum;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * A structure describing the Resource's new price
 */
public class OvhResourceNewPricesEntry {
	/**
	 * canBeNull
	 */
	public OvhBillingTypeEnum billingType;

	/**
	 * canBeNull
	 */
	public OvhPrice oldPrice;

	/**
	 * canBeNull
	 */
	public String name;

	/**
	 * canBeNull
	 */
	public OvhPrice newPrice;

	/**
	 * canBeNull
	 */
	public Boolean changed;

	/**
	 * canBeNull
	 */
	public OvhResourceTypeEnum resourceType;
}
