package net.minidev.ovh.api.domain.zone;

import net.minidev.ovh.api.zone.OvhNamedResolutionFieldTypeEnum;

/**
 * Zone resource records
 */
public class OvhRecord {
	/**
	 * Resource record zone
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Resource record subdomain
	 *
	 * canBeNull && readOnly
	 */
	public String subDomain;

	/**
	 * Id of the zone resource record
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Resource record ttl
	 *
	 * canBeNull && readOnly
	 */
	public Long ttl;

	/**
	 * Resource record Name
	 *
	 * canBeNull && readOnly
	 */
	public OvhNamedResolutionFieldTypeEnum fieldType;

	/**
	 * Resource record target
	 *
	 * canBeNull && readOnly
	 */
	public String target;
}
