package net.minidev.ovh.api.pack.xdsl.addressmove;

import net.minidev.ovh.api.xdsl.OvhDeconsolidationEnum;
import net.minidev.ovh.api.xdsl.eligibility.OvhLandlineStatusEnum;

/**
 * The parameters needed to activate the access on a landline
 */
public class OvhLandline {
	/**
	 * The unbundling of the landline
	 *
	 * canBeNull
	 */
	public OvhDeconsolidationEnum unbundling;

	/**
	 * Whether or not tha lineNumber should be ported to OVH, if eligibile
	 *
	 * canBeNull
	 */
	public Boolean portLineNumber;

	/**
	 * A token to prove the ownership of the line number, needed to port the number
	 *
	 * canBeNull
	 */
	public String rio;

	/**
	 * The number of the landline
	 *
	 * canBeNull
	 */
	public String lineNumber;

	/**
	 * The status of the landline
	 *
	 * canBeNull
	 */
	public OvhLandlineStatusEnum status;
}
