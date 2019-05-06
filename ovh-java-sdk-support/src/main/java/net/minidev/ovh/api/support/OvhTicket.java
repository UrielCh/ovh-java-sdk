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
	 * Product service concerned by ticket
	 *
	 * canBeNull
	 */
	public OvhTicketProductEnum product;

	/**
	 * Ticket last update date
	 *
	 * canBeNull
	 */
	public Date updateDate;

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
	 * Ticket score
	 *
	 * canBeNull
	 */
	public String score;

	/**
	 * Customer account identifier
	 *
	 * canBeNull
	 */
	public String accountId;

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
