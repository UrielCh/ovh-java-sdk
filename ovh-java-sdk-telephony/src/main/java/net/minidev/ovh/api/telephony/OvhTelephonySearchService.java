package net.minidev.ovh.api.telephony;

/**
 * Informations related to a telephony service
 */
public class OvhTelephonySearchService {
	/**
	 * The service domain
	 *
	 * canBeNull
	 */
	public String domain;

	/**
	 * The billing account of the service
	 *
	 * canBeNull
	 */
	public String billingAccount;

	/**
	 * The offer description
	 *
	 * canBeNull
	 */
	public OvhTelephonySearchServiceTypeEnum type;
}
