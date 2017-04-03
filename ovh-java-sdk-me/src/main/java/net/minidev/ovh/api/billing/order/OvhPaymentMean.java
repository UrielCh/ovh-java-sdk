package net.minidev.ovh.api.billing.order;

import net.minidev.ovh.api.billing.order.paymentmean.OvhHttpParameter;

/**
 * All data needed to use a payment mean
 */
public class OvhPaymentMean {
	/**
	 * canBeNull
	 */
	public Double fee;

	/**
	 * canBeNull
	 */
	public String logo;

	/**
	 * canBeNull
	 */
	public String subType;

	/**
	 * canBeNull
	 */
	public String httpMethod;

	/**
	 * canBeNull
	 */
	public OvhHttpParameter[] parameters;

	/**
	 * canBeNull
	 */
	public String url;

	/**
	 * canBeNull
	 */
	public String htmlForm;
}
