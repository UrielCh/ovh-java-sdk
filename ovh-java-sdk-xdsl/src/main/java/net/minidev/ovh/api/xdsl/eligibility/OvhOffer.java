package net.minidev.ovh.api.xdsl.eligibility;

import net.minidev.ovh.api.xdsl.OvhDeconsolidationEnum;
import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;
import net.minidev.ovh.api.xdsl.OvhGtrEnum;

/**
 * An offer
 */
public class OvhOffer {
	/**
	 * Estimated or guaranteed upload rate in Mbit/s, if applicable
	 *
	 * canBeNull
	 */
	public Double uploadRate;

	/**
	 * Is copper lines desaturation needed and available for this offer ?
	 *
	 * canBeNull
	 */
	public Boolean desaturation;

	/**
	 * Estimated or guaranteed download rate in Mbit/s, if applicable
	 *
	 * canBeNull
	 */
	public Double downloadRate;

	/**
	 * Allowed GTR (none, 4ho : 4 work hours, 4hno : 4 unworked hours)
	 *
	 * canBeNull
	 */
	public OvhGtrEnum[] gtr;

	/**
	 * Allowed unbundling methods
	 *
	 * canBeNull
	 */
	public OvhDeconsolidationEnum[] unbundling;

	/**
	 * DEPRECATED Please use downloadRate instead /DEPRECATED - Estimated or guaranteed rate in Mbit/s, if applicable
	 *
	 * canBeNull
	 */
	public Double rate;

	/**
	 * Provider, if applicable
	 *
	 * canBeNull
	 */
	public OvhProviderEnum provider;

	/**
	 * Is the rate guaranteed ?
	 *
	 * canBeNull
	 */
	public Boolean guaranteed;

	/**
	 * Offer label
	 *
	 * canBeNull
	 */
	public String label;

	/**
	 * DSL technology
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum type;

	/**
	 * Number of pairs to use
	 *
	 * canBeNull
	 */
	public Long pairs;
}
