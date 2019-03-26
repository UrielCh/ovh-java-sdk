package net.minidev.ovh.api.pca;

import java.util.Date;
import net.minidev.ovh.api.cloud.pca.OvhBillingRefEnum;

/**
 * cloud archives billing
 */
public class OvhBilling {
	/**
	 * Date and time the operation took place
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Billing reference name
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingRefEnum reference;

	/**
	 * Total usage after operation
	 *
	 * canBeNull && readOnly
	 */
	public Long total;

	/**
	 * Billing action is billed.
	 *
	 * canBeNull && readOnly
	 */
	public Boolean billed;

	/**
	 * Quantity of bytes for operation
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Billing id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
