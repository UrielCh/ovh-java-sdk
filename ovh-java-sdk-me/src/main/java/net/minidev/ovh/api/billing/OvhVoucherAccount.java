package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a Voucher account
 */
public class OvhVoucherAccount {
	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice balance;

	/**
	 * canBeNull && readOnly
	 */
	public String voucherAccountId;

	/**
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * canBeNull && readOnly
	 */
	public Date openDate;
}
