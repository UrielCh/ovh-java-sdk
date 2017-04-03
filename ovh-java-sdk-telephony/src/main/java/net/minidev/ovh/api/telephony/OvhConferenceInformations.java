package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Conference realtime informations structure
 */
public class OvhConferenceInformations {
	/**
	 * The current participants count in your conference room
	 *
	 * canBeNull
	 */
	public Long membersCount;

	/**
	 * The date when the conference began
	 *
	 * canBeNull
	 */
	public Date dateStart;

	/**
	 * Whether or not the conference room is locked
	 *
	 * canBeNull
	 */
	public Boolean locked;
}
