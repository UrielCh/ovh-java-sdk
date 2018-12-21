package net.minidev.ovh.api.telephony;

/**
 * Details about simultaneous channels of this line
 */
public class OvhSimultaneousChannelsDetails {
	/**
	 * Current quantity of simultaneous channels.
	 *
	 * canBeNull
	 */
	public Long current;

	/**
	 * Extra quantity of simultaneous channels added to the line.
	 *
	 * canBeNull
	 */
	public Long extra;

	/**
	 * Maximum quantity of simultaneous channels the line can have.
	 *
	 * canBeNull
	 */
	public Long maximum;

	/**
	 * Quantity of simultaneous channels going to be deleted at the end of the billing cycle.
	 *
	 * canBeNull
	 */
	public Long toBeDeleted;

	/**
	 * Basic quantity of simultaneous channels included in the line.
	 *
	 * canBeNull
	 */
	public Long basic;
}
