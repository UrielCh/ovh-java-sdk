package net.minidev.ovh.api.telephony;

/**
 * IVR Menu
 */
public class OvhOvhPabxMenu {
	/**
	 * The text to speech sound played when the caller uses an invalid DTMF
	 *
	 * canBeNull && readOnly
	 */
	public Long invalidSoundTts;

	/**
	 * The name of the menu
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The id of the OvhPabxSound played when the caller uses an invalid DTMF
	 *
	 * canBeNull && readOnly
	 */
	public Long invalidSound;

	/**
	 * canBeNull && readOnly
	 */
	public Long menuId;

	/**
	 * The id of the OvhPabxSound played to greet
	 *
	 * canBeNull && readOnly
	 */
	public Long greetSound;

	/**
	 * The text to speech sound played to greet
	 *
	 * canBeNull && readOnly
	 */
	public Long greetSoundTts;
}
