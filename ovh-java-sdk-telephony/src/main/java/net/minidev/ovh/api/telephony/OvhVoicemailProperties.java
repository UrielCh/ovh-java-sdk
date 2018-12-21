package net.minidev.ovh.api.telephony;

/**
 * Voicemail Properties
 */
public class OvhVoicemailProperties {
	/**
	 * Sound ID of the temporary greeeting
	 *
	 * canBeNull && readOnly
	 */
	public Long temporaryGreetingSoundId;

	/**
	 * Quantity of unread voicemails
	 *
	 * canBeNull && readOnly
	 */
	public Long unreadMessages;

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
	 * Email address from which emails will be sent
	 *
	 * canBeNull && readOnly
	 */
	public String fromEmail;

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
	 * Sound ID of the short greeting played before an automated message
	 *
	 * canBeNull && readOnly
	 */
	public Long shortGreetingSoundId;

	/**
	 * Play the temporary greeting instead of the regular one
	 *
	 * canBeNull && readOnly
	 */
	public Boolean temporaryGreetingActivated;

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
	 * Type of the greeting to play
	 *
	 * canBeNull && readOnly
	 */
	public OvhVoicemailGreetingEnum greetingType;

	/**
	 * Force password request to access the voicemail panel
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forcePassword;

	/**
	 * Sound ID of the long greeeting
	 *
	 * canBeNull && readOnly
	 */
	public Long fullGreetingSoundId;
}
