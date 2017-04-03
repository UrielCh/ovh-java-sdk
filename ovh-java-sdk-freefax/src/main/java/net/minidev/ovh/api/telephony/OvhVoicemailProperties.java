package net.minidev.ovh.api.telephony;

/**
 * Voicemail Properties
 */
public class OvhVoicemailProperties {
	/**
	 * Email addresses to notify when a new voicemail is left
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceVoicemailNotifications[] redirectionEmails;

	/**
	 * Current voicemail version
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isNewVersion;

	/**
	 * Don't allow callers to leave voicemails
	 *
	 * canBeNull && readOnly
	 */
	public Boolean doNotRecord;

	/**
	 * Quantity of unread voicemails
	 *
	 * canBeNull && readOnly
	 */
	public Long unreadMessages;

	/**
	 * Don't delete voicemails after they've been sent by email
	 *
	 * canBeNull && readOnly
	 */
	public Boolean keepMessage;

	/**
	 * Name from which emails will be sent
	 *
	 * canBeNull && readOnly
	 */
	public String fromName;

	/**
	 * Name of the voicemail panel announce file
	 *
	 * canBeNull && readOnly
	 */
	public String annouceMessage;

	/**
	 * Format of the voicemail audio file attached to emails
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceVoicemailAudioFormatEnum audioFormat;

	/**
	 * Force password request to access the voicemail panel
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forcePassword;

	/**
	 * Email address from which emails will be sent
	 *
	 * canBeNull && readOnly
	 */
	public String fromEmail;
}
