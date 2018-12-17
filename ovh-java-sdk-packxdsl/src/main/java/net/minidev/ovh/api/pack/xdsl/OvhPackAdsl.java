package net.minidev.ovh.api.pack.xdsl;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Pack of xDSL services
 */
public class OvhPackAdsl {
	/**
	 * Price of the offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice offerPrice;

	/**
	 * Capabilities of the pack
	 *
	 * canBeNull && readOnly
	 */
	public OvhPackCapabilities capabilities;

	/**
	 * Name of the offer
	 *
	 * canBeNull && readOnly
	 */
	public String offerDescription;

	/**
	 * Customer pack description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Name of the xdsl pack
	 *
	 * canBeNull && readOnly
	 */
	public String packName;
}
