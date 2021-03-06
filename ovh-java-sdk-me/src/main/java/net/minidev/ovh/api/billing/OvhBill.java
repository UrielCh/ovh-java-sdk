package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a Bill
 */
public class OvhBill {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public String pdfUrl;

	/**
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * canBeNull && readOnly
	 */
	public String billId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithTax;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice priceWithoutTax;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice tax;

	/**
	 * canBeNull && readOnly
	 */
	public String url;
}
