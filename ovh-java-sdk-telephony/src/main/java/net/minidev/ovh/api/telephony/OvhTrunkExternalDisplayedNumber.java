package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * External displayed number linked to a trunk
 */
public class OvhTrunkExternalDisplayedNumber {
	/**
	 * External displayed number linked to a trunk
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

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
