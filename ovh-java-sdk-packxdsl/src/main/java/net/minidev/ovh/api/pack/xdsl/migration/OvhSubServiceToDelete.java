package net.minidev.ovh.api.pack.xdsl.migration;

import net.minidev.ovh.api.pack.xdsl.OvhServiceNameEnum;

/**
 * Sub service to delete
 */
public class OvhSubServiceToDelete {
	/**
	 * List of domains of sub services
	 *
	 * canBeNull
	 */
	public String[] services;

	/**
	 * Number of services to be deleted
	 *
	 * canBeNull
	 */
	public Long numberToDelete;

	/**
	 * Type of service to be deleted
	 *
	 * canBeNull
	 */
	public OvhServiceNameEnum type;
}
