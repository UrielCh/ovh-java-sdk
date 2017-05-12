package net.minidev.ovh.api.telephony;

/**
 * List public web access of your conference
 */
public class OvhConferenceWebAccess {
	/**
	 * The id of the conference web access
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The type of the conference web access : read or write
	 *
	 * canBeNull && readOnly
	 */
	public OvhConferenceWebAccessTypeEnum type;

	/**
	 * The URL of the conference web access
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
