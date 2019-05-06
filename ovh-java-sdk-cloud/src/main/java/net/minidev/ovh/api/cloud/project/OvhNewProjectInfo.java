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
	 * Error to fix before trying to create a new Public Cloud project
	 *
	 * canBeNull
	 */
	public OvhNewProjectInfoError error;

	/**
	 * Cloud project order
	 *
	 * canBeNull
	 */
	public OvhPrice order;
}
