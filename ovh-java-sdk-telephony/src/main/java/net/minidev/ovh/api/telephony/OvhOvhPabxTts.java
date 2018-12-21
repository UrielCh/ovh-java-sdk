package net.minidev.ovh.api.telephony;

/**
 * The PABX Text To Speech sounds
 */
public class OvhOvhPabxTts {
	/**
	 * The voice used to say text
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxTtsVoiceEnum voice;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The text that will be played
	 *
	 * canBeNull && readOnly
	 */
	public String text;
}
