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
	 * AWS
	 *
	 * canBeNull && readOnly
	 */
	public Boolean aws;

	/**
	 * Microsoft
	 *
	 * canBeNull && readOnly
	 */
	public Boolean microsoft;

	/**
	 * Cisco
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cisco;

	/**
	 * Intel
	 *
	 * canBeNull && readOnly
	 */
	public Boolean intel;
}
