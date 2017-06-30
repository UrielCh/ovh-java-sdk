package net.minidev.ovh.api.telephony;

/**
 * Telephony settings linked to the customer account
 */
public class OvhSettings {
	/**
	 * Line description policies settings
	 *
	 * canBeNull
	 */
	public OvhLineDescriptionSettings lineDescriptionPolicies;

	/**
	 * Billing policies settings
	 *
	 * canBeNull
	 */
	public OvhBillingSettings billingPolicies;
}
