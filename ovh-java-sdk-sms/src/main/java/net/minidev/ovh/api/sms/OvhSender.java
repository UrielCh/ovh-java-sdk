package net.minidev.ovh.api.sms;

/**
 * SMS senders
 */
public class OvhSender {
	/**
	 * Specify if the sender is custom or not
	 *
	 * canBeNull && readOnly
	 */
	public OvhRefererSenderEnum referer;

	/**
	 * The sms sender
	 *
	 * canBeNull && readOnly
	 */
	public String sender;

	/**
	 * Validation media identifier
	 *
	 * canBeNull && readOnly
	 */
	public String validationMedia;

	/**
	 * Sender description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Message sent by the moderator
	 *
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * Specify the kind of sender
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeSenderEnum type;

	/**
	 * Sender status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusSenderEnum status;
}
