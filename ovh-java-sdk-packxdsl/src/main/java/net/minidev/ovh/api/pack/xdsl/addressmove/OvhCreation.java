package net.minidev.ovh.api.pack.xdsl.addressmove;

import net.minidev.ovh.api.xdsl.eligibility.OvhAddress;
import net.minidev.ovh.api.xdsl.eligibility.OvhBookMeetingSlot;

/**
 * The parameters needed to create a new landline
 */
public class OvhCreation {
	/**
	 * The address
	 *
	 * canBeNull
	 */
	public OvhAddress address;

	/**
	 * Data to book a meeting slot
	 *
	 * canBeNull
	 */
	public OvhBookMeetingSlot meeting;
}
