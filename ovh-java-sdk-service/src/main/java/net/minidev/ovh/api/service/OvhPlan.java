package net.minidev.ovh.api.service;

import net.minidev.ovh.api.service.plan.OvhProduct;

/**
 * Plan information
 */
public class OvhPlan {
	/**
	 * Product plan information
	 *
	 * canBeNull
	 */
	public OvhProduct product;

	/**
	 * Product code
	 *
	 * canBeNull
	 */
	public String code;
}
