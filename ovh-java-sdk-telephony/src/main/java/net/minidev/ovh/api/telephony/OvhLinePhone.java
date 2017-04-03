package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Informations related to phone capabilities
 */
public class OvhLinePhone {
	/**
	 * Phone protocol
	 *
	 * canBeNull
	 */
	public OvhProtocolEnum protocol;

	/**
	 * Maximum number of lines managed by a phone
	 *
	 * canBeNull
	 */
	public Long maxline;

	/**
	 * Telephony price
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * The phone description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Brand name of the phone
	 *
	 * canBeNull
	 */
	public String brand;
}
