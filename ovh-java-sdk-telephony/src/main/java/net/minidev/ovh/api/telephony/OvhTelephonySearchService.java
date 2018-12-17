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
	 * The offer description
	 *
	 * canBeNull
	 */
	public OvhTelephonySearchServiceTypeEnum type;

	/**
	 * The billing account of the service
	 *
	 * canBeNull
	 */
	public String billingAccount;
}
