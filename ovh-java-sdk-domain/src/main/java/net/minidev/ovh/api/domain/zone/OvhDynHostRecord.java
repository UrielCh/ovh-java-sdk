package net.minidev.ovh.api.domain.zone;

/**
 * DynHost record
 */
public class OvhDynHostRecord {
	/**
	 * Zone of the DynHost record
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Subdomain of the DynHost record
	 *
	 * canBeNull && readOnly
	 */
	public String subDomain;

	/**
	 * Ip address of the DynHost record
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Id of the DynHost record
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * DynHost record ttl
	 *
	 * canBeNull && readOnly
	 */
	public Long ttl;
}
