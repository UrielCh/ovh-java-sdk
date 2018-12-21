package net.minidev.ovh.api.support;

import java.util.Date;

/**
 * Support Ticket
 */
public class OvhTicket {
	/**
	 * Ticket external number
	 *
	 * canBeNull
	 */
	public Long ticketNumber;

	/**
	 * Ticket last update date
	 *
	 * canBeNull
	 */
	public Date updateDate;

	/**
	 * Product service concerned by ticket
	 *
	 * canBeNull
	 */
	public OvhTicketProductEnum product;

	/**
	 * Ticket subject
	 *
	 * canBeNull
	 */
	public String subject;

	/**
	 * Ticket type
	 *
	 * canBeNull
	 */
	public OvhTicketTypeEnum type;

	/**
	 * Ticket creation date
	 *
	 * canBeNull
	 */
	public Date creationDate;

	/**
	 * Name of service concerned by ticket
	 *
	 * canBeNull
	 */
	public String serviceName;

	/**
	 * Customer account identifier
	 *
	 * canBeNull
	 */
	public String accountId;

	/**
	 * Ticket score
	 *
	 * canBeNull
	 */
	public String score;

	/**
	 * Can this ticket be closed or not
	 *
	 * canBeNull
	 */
	public Boolean canBeClosed;

	/**
	 * Sender type of last message
	 *
	 * canBeNull
	 */
	public OvhMessageSenderEnum lastMessageFrom;

	/**
	 * State of ticket
	 *
	 * canBeNull
	 */
	public OvhTicketStatusEnum state;

	/**
	 * Ticket request category
	 *
	 * canBeNull
	 */
	public OvhTicketCategoryEnum category;

	/**
	 * Ticket identifier
	 *
	 * canBeNull
	 */
	public Long ticketId;
}
