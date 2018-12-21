package net.minidev.ovh.api.spare.telephony;

import net.minidev.ovh.api.telephony.OvhProtocolEnum;

/**
 * Spare properties
 */
public class OvhTelephonySpare {
	/**
	 * Mac address
	 *
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * Phone protocol
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolEnum protocol;

	/**
	 * Phone brand model
	 *
	 * canBeNull && readOnly
	 */
	public String brand;
}
