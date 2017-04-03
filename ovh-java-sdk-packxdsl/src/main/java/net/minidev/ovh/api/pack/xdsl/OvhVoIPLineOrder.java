package net.minidev.ovh.api.pack.xdsl;

/**
 * Represents an order of VoIP lines
 */
public class OvhVoIPLineOrder {
	/**
	 * canBeNull
	 */
	public String orderUrl;

	/**
	 * canBeNull
	 */
	public Long orderId;

	/**
	 * Whether or not this order need to be payed manually
	 *
	 * canBeNull
	 */
	public Boolean needPayment;

	/**
	 * canBeNull
	 */
	public Long[] taskIds;
}
