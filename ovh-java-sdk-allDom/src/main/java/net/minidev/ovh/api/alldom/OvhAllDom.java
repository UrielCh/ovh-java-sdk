package net.minidev.ovh.api.alldom;

import net.minidev.ovh.api.domain.OvhOfferEnum;

/**
 * AllDom administration
 */
public class OvhAllDom {
	/**
	 * Offer of the allDom
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferEnum offer;

	/**
	 * Name of the allDom
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Type of the allDom
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;
}
