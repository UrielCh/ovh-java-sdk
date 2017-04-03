package net.minidev.ovh.api.cloud.billingview;

/**
 * StoredStorage
 */
public class OvhStoredStorage {
	/**
	 * GiBh stored
	 *
	 * canBeNull && readOnly
	 */
	public OvhQuantity quantity;

	/**
	 * Total price
	 *
	 * canBeNull && readOnly
	 */
	public Double totalPrice;
}
