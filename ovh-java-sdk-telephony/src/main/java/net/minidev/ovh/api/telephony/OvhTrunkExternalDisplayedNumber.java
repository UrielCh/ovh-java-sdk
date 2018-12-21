package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * External displayed number linked to a trunk
 */
public class OvhTrunkExternalDisplayedNumber {
	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * External displayed number linked to a trunk
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * Validation date
	 *
	 * canBeNull && readOnly
	 */
	public Date validatedAt;

	/**
	 * Validation status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTrunkExternalDisplayedNumberStatusEnum status;
}
