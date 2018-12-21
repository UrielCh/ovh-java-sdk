package net.minidev.ovh.api.support;

import java.util.Date;

/**
 * Support ticket message
 */
public class OvhMessage {
	/**
	 * Message last update date
	 *
	 * canBeNull
	 */
	public Date updateDate;

	/**
	 * Message identifier
	 *
	 * canBeNull
	 */
	public Long messageId;

	/**
	 * Message sender type
	 *
	 * canBeNull
	 */
	public OvhMessageSenderEnum from;

	/**
	 * Message creation date
	 *
	 * canBeNull
	 */
	public Date creationDate;

	/**
	 * Message body
	 *
	 * canBeNull
	 */
	public String body;

	/**
	 * Ticket identifier
	 *
	 * canBeNull
	 */
	public Long ticketId;
}
