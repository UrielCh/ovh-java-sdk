package net.minidev.ovh.api.partner;

/**
 * Possible choices for externalCertifications
 */
public class OvhExternalCertifications {
	/**
	 * Other (specify)
	 *
	 * canBeNull && readOnly
	 */
	public String other;

	/**
	 * VMWare
	 *
	 * canBeNull && readOnly
	 */
	public Boolean vmware;

	/**
	 * Microsoft
	 *
	 * canBeNull && readOnly
	 */
	public Boolean microsoft;

	/**
	 * AWS
	 *
	 * canBeNull && readOnly
	 */
	public Boolean aws;

	/**
	 * Intel
	 *
	 * canBeNull && readOnly
	 */
	public Boolean intel;

	/**
	 * Cisco
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cisco;
}
