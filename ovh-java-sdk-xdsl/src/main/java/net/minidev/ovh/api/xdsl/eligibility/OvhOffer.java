package net.minidev.ovh.api.xdsl.eligibility;

import net.minidev.ovh.api.xdsl.OvhDeconsolidationEnum;
import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;
import net.minidev.ovh.api.xdsl.OvhGtrEnum;

/**
 * An offer
 */
public class OvhOffer {
	/**
	 * The allowed gtr (none, 4ho : 4 work hours, 4hno : 4 unworked hours)
	 *
	 * canBeNull
	 */
	public OvhGtrEnum[] gtr;

	/**
	 * The provider, if applicable
	 *
	 * canBeNull
	 */
	public OvhProviderEnum provider;

	/**
	 * The estimated or guaranteed rate in Mbit/s, if applicable
	 *
	 * canBeNull
	 */
	public Double rate;

	/**
	 * The allowed unbundling
	 *
	 * canBeNull
	 */
	public OvhDeconsolidationEnum[] unbundling;

	/**
	 * Is the rate guaranteed ?
	 *
	 * canBeNull
	 */
	public Boolean guaranteed;

	/**
	 * The offer label
	 *
	 * canBeNull
	 */
	public String label;

	/**
	 * The DSL technology
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum type;

	/**
	 * The number if pairs to use
	 *
	 * canBeNull
	 */
	public Long pairs;
}
