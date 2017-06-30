package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;

/**
 * OOM kill informations
 */
public class OvhOom {
	/**
	 * Date of the OOM kill
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * Memory size reached
	 *
	 * canBeNull
	 */
	public Long sizeReached;
}
