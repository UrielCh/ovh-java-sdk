package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Voicemail message
 */
public class OvhVoicemailMessages {
	/**
	 * Message duration (in seconds)
	 *
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * Caller number in international format
	 *
	 * canBeNull && readOnly
	 */
	public String caller;

	/**
	 * Callee number in international format
	 *
	 * canBeNull && readOnly
	 */
	public String callee;

	/**
	 * Uniq voicemail message identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Voicemessage directory
	 *
	 * canBeNull && readOnly
	 */
	public OvhVoicemailMessageFolderDirectoryEnum dir;

	/**
	 * Message datetime creation
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;
}
