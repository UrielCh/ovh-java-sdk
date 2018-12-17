package net.minidev.ovh.api.domain.zone;

import net.minidev.ovh.api.zone.OvhRedirectionTypeEnum;

/**
 * Redirection
 */
public class OvhRedirection {
	/**
	 * Keywords for invisible redirection
	 *
	 * canBeNull && readOnly
	 */
	public String keywords;

	/**
	 * Redirection zone
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * subdomain to redirect
	 *
	 * canBeNull && readOnly
	 */
	public String subDomain;

	/**
	 * Desciption for invisible redirection
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Id of the redirection
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Title for invisible redirection
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Redirection type
	 *
	 * canBeNull && readOnly
	 */
	public OvhRedirectionTypeEnum type;

	/**
	 * Target of the redirection
	 *
	 * canBeNull && readOnly
	 */
	public String target;
}
