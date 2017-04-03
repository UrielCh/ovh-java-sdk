package net.minidev.ovh.api.nichandle;

/**
 * Describe all services impacted by SLA
 */
public class OvhSlaService {
	/**
	 * SLA plan description
	 *
	 * canBeNull
	 */
	public String slaPlan;

	/**
	 * Service description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Impacted service name
	 *
	 * canBeNull
	 */
	public String serviceName;

	/**
	 * SLA plan application
	 *
	 * canBeNull
	 */
	public String slaApplication;
}
