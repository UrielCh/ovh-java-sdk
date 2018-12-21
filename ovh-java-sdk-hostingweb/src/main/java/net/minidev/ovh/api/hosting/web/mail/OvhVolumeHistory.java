package net.minidev.ovh.api.hosting.web.mail;

import java.util.Date;

/**
 * The volume history type
 */
public class OvhVolumeHistory {
	/**
	 * The volume history size
	 *
	 * canBeNull
	 */
	public Long volume;

	/**
	 * The datetime of this volume history point
	 *
	 * canBeNull
	 */
	public Date date;
}
