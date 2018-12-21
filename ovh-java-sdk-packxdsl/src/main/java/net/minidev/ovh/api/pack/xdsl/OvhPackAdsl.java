package net.minidev.ovh.api.pack.xdsl;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Pack of xDSL services
 */
public class OvhPackAdsl {
	/**
	 * Capabilities of the pack
	 *
	 * canBeNull && readOnly
	 */
	public OvhPackCapabilities capabilities;

	/**
	 * Price of the offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice offerPrice;

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
