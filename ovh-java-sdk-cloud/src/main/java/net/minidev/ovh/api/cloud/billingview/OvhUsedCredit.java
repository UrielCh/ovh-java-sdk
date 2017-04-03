package net.minidev.ovh.api.cloud.billingview;

/**
 * UsedCredit
 */
public class OvhUsedCredit {
	/**
	 * Total credit used
	 *
	 * canBeNull && readOnly
	 */
	public Double usedAmount;

	/**
	 * Credit description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Credit ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
