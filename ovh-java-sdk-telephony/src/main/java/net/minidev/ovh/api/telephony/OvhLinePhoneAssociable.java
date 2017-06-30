package net.minidev.ovh.api.telephony;

/**
 * Informations related to associable phone capabilities
 */
public class OvhLinePhoneAssociable {
	/**
	 * Current lines configured on the phone
	 *
	 * canBeNull
	 */
	public OvhLinePhoneAssociableConfiguredLines[] associatedLines;

	/**
	 * Phone protocol
	 *
	 * canBeNull
	 */
	public OvhProtocolEnum protocol;

	/**
	 * Maximum quantity of lines managed by the phone
	 *
	 * canBeNull
	 */
	public Long maxLines;

	/**
	 * Brand name of the phone
	 *
	 * canBeNull
	 */
	public String brand;
}
