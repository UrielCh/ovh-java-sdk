package net.minidev.ovh.api.cloud.usage;

/**
 * UsageBill
 */
public class OvhUsageBill {
	/**
	 * ID of the bill
	 *
	 * canBeNull && readOnly
	 */
	public String bill_id;

	/**
	 * Payment type
	 *
	 * canBeNull && readOnly
	 */
	public OvhPaymentTypeEnum payment_type;

	/**
	 * Total amount of the bill, credits not taken into account
	 *
	 * canBeNull && readOnly
	 */
	public Double total;

	/**
	 * Amount of the bill that accounts for services for the usage period, credits not taken into account
	 *
	 * canBeNull && readOnly
	 */
	public Double part;

	/**
	 * Amount of credits used in this bill (not necessarily on part)
	 *
	 * canBeNull && readOnly
	 */
	public Double credit;
}
