package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * Sms template for moderation (Needed to send in US country)
 */
public class OvhTemplateControl {
	/**
	 * Template creation datetime
	 *
	 * canBeNull && readOnly
	 */
	public Date datetime;

	/**
	 * Specify the kind of template
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeTemplateEnum activity;

	/**
	 * Name of the template
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Template description
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
	 * Message pattern to be moderated. Use "#VALUE#" format for dynamic text area.
	 *
	 * canBeNull && readOnly
	 */
	public String message;

	/**
	 * Template status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusSenderEnum status;
}
