package net.minidev.ovh.api.telephony;

/**
 * Voicemail greeting
 */
public class OvhVoicemailGreetings {
	/**
	 * Callee number in international format
	 *
	 * canBeNull && readOnly
	 */
	public String callee;

	/**
	 * Uniq customized greeting identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Customized greeting voicemail directory
	 *
	 * canBeNull && readOnly
	 */
	public OvhVoicemailMessageFolderGreetingEnum dir;
}
