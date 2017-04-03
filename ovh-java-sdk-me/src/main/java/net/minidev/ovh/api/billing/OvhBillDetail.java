package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Information about a Bill entry
 */
public class OvhBillDetail {
	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice unitPrice;

	/**
	 * canBeNull && readOnly
	 */
	public String quantity;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice totalPrice;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String billDetailId;

	/**
	 * canBeNull && readOnly
	 */
	public Date periodStart;

	/**
	 * canBeNull && readOnly
	 */
	public Date periodEnd;
}
