package net.minidev.ovh.api.hosting.web.mail;

import java.util.Date;

/**
 * The volume history type
 */
public class OvhVolumeHistory {
	/**
	 * The datetime of this volume history point
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * The volume history size
	 *
	 * canBeNull
	 */
	public Long volume;
}
