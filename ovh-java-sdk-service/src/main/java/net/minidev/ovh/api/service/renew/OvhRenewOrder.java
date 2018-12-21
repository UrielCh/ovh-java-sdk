package net.minidev.ovh.api.service.renew;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a renew Order
 */
public class OvhRenewOrder {
	/**
	 * The creation date of the renew Order
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * The retraction date
	 *
	 * canBeNull && readOnly
	 */
	public Date retractionDate;

	/**
	 * The public pdf URL of the generated renew Order
	 *
	 * canBeNull && readOnly
	 */
	public String pdfUrl;

	/**
	 * The password
	 *
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * The ID of the renew Order
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Price of the product with tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithTax;

	/**
	 * Price of the product without tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithoutTax;

	/**
	 * Value of the tax
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice tax;

	/**
	 * The public URL to display generated renew Order
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * The expiration date of the renew Order
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
