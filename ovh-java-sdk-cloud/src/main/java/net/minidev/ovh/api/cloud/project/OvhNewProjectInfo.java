package net.minidev.ovh.api.cloud.project;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * New cloud project informations
 */
public class OvhNewProjectInfo {
	/**
	 * Agreement to valid
	 *
	 * canBeNull
	 */
	public Long[] agreements;

	/**
	 * Cloud project order
	 *
	 * canBeNull
	 */
	public OvhPrice order;
}
