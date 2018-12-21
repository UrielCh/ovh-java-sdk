package net.minidev.ovh.api.secondarydns;

import net.minidev.ovh.api.zone.OvhNamedResolutionFieldTypeEnum;

/**
 * A structure describing informations about secondary dns check field
 */
public class OvhSecondaryDNSCheckField {
	/**
	 * The subdomain to add on your DNS zone for the domain
	 *
	 * canBeNull
	 */
	public String subDomain;

	/**
	 * The field value to add on your DNS zone for this subDomain
	 *
	 * canBeNull
	 */
	public String fieldValue;

	/**
	 * The field type to add on your DNS zone for this subDomain
	 *
	 * canBeNull
	 */
	public OvhNamedResolutionFieldTypeEnum fieldType;
}
