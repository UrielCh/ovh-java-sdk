package net.minidev.ovh.api.license.office;

/**
 * Office domain
 */
public class OvhOfficeDomain {
	/**
	 * TXT entry required for domain validation
	 *
	 * canBeNull && readOnly
	 */
	public String txtEntry;

	/**
	 * Domain name
	 *
	 * canBeNull && readOnly
	 */
	public String domainName;

	/**
	 * Domain state
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainStateEnum status;
}
