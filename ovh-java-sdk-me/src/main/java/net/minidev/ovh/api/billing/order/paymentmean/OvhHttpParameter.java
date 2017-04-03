package net.minidev.ovh.api.billing.order.paymentmean;

/**
 * Parameter to give to a payment page
 */
public class OvhHttpParameter {
	/**
	 * canBeNull
	 */
	public String name;

	/**
	 * canBeNull
	 */
	public OvhHttpParameterChoice[] choice;

	/**
	 * canBeNull
	 */
	public String value;
}
