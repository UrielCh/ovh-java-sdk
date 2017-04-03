package net.minidev.ovh.api.telephony;

/**
 * Plug & Phone
 */
public class OvhPhone {
	/**
	 * Phone protocol
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolEnum protocol;

	/**
	 * Mac Address
	 *
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * Maximum number of lines managed by a phone
	 *
	 * canBeNull && readOnly
	 */
	public Long maxline;

	/**
	 * The ip restriction of your MGCP phone
	 *
	 * canBeNull && readOnly
	 */
	public String mgcpIpRestriction;

	/**
	 * Current phone properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhPhoneConfigurationProperty[] phoneConfiguration;

	/**
	 * The phone description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Brand name
	 *
	 * canBeNull && readOnly
	 */
	public String brand;
}
