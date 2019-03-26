package net.minidev.ovh.api.telephony;

/**
 * Plug & Phone
 */
public class OvhPhone {
	/**
	 * Mac Address
	 *
	 * canBeNull && readOnly
	 */
	public String macAddress;

	/**
	 * Phone protocol
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolEnum protocol;

	/**
	 * The phone user password
	 *
	 * canBeNull && readOnly
	 */
	public String userPassword;

	/**
	 * Maximum number of lines managed by a phone
	 *
	 * canBeNull && readOnly
	 */
	public Long maxline;

	/**
	 * Current phone properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhPhoneConfigurationProperty[] phoneConfiguration;

	/**
	 * The ip restriction of your MGCP phone
	 *
	 * canBeNull && readOnly
	 */
	public String mgcpIpRestriction;

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
