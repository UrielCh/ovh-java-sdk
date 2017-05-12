package net.minidev.ovh.api.status.reply;

import java.util.Date;

/**
 * A reply is useful to know the progress of a task
 */
public class OvhReply {
	/**
	 * The date of the reply
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * The comment of the reply
	 *
	 * canBeNull && readOnly
	 */
	public String comment;
}
