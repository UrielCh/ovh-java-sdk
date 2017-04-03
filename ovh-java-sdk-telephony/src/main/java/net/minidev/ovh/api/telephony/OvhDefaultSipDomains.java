package net.minidev.ovh.api.telephony;

/**
 * 
 */
public class OvhDefaultSipDomains {
	/**
	 * Country
	 *
	 * canBeNull
	 */
	public OvhNumberCountryEnum country;

	/**
	 * Current SIP domain
	 *
	 * canBeNull
	 */
	public String currentDomain;

	/**
	 * List of available SIP domains
	 *
	 * canBeNull
	 */
	public String[] list;

	/**
	 * Type of the VoIP product concerned
	 *
	 * canBeNull
	 */
	public OvhSipDomainProductTypeEnum productType;
}
