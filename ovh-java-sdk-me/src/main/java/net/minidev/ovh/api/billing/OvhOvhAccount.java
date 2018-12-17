package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about an OVH account
 */
public class OvhOvhAccount {
	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice balance;

	/**
	 * canBeNull && readOnly
	 */
	public String ovhAccountId;

	/**
	 * canBeNull && readOnly
	 */
	public Long alertThreshold;

	/**
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean canBeCredited;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean isActive;

	/**
	 * canBeNull && readOnly
	 */
	public Date openDate;
}
