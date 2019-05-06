package net.minidev.ovh.api.xdsl.eligibility;

import java.util.Date;
import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;
import net.minidev.ovh.api.xdsl.OvhGtrEnum;

/**
 * A fiber offer
 */
public class OvhFiberOffer {
	/**
	 * Estimated or guaranteed upload rate in Mbit/s, if applicable
	 *
	 * canBeNull
	 */
	public Double uploadRate;

	/**
	 * Reason of non eligibility, if applicable
	 *
	 * canBeNull
	 */
	public String reason;

	/**
	 * Estimated or guaranteed download rate in Mbit/s, if applicable
	 *
	 * canBeNull
	 */
	public Double downloadRate;

	/**
	 * Allowed GTR
	 *
	 * canBeNull
	 */
	public OvhGtrEnum[] gtr;

	/**
	 * The availibility date if the fiber is planned but not available yet
	 *
	 * canBeNull
	 */
	public Date availibilityDate;

	/**
	 * Are you eligible to this offer ?
	 *
	 * canBeNull
	 */
	public Boolean eligible;

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
	 * Technology
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum type;
}
