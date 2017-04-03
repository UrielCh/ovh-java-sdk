package net.minidev.ovh.api.pack.xdsl.promotioncode;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Informations about a promotion code
 */
public class OvhCapabilities {
	/**
	 * Enum of the possible errors
	 *
	 * canBeNull
	 */
	public OvhReasonCodes[] reasonCodes;

	/**
	 * Amount of the promotion code
	 *
	 * canBeNull
	 */
	public OvhPrice amount;

	/**
	 * Number of months of engagement
	 *
	 * canBeNull
	 */
	public Long engagement;

	/**
	 * True if the promotion code generation is available
	 *
	 * canBeNull
	 */
	public Boolean canGenerate;
}
