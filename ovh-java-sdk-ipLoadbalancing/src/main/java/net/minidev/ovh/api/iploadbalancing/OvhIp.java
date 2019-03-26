package net.minidev.ovh.api.iploadbalancing;

/**
 * Your IP load balancing
 */
public class OvhIp {
	/**
	 * The metrics token associated with your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String metricsToken;

	/**
	 * Set the name displayed in ManagerV6 for your iplb (max 50 chars)
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * The internal name of your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * The offer of your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String offer;

	/**
	 * Modern oldest compatible clients : Firefox 27, Chrome 30, IE 11 on Windows 7, Edge, Opera 17, Safari 9, Android 5.0, and Java 8. Intermediate oldest compatible clients : Firefox 1, Chrome 1, IE 7, Opera 5, Safari 1, Windows XP IE8, Android 2.3, Java 7. Intermediate if null.
	 *
	 * canBeNull && readOnly
	 */
	public OvhSslConfigurationEnum sslConfiguration;

	/**
	 * Vrack eligibility
	 *
	 * canBeNull && readOnly
	 */
	public Boolean vrackEligibility;

	/**
	 * The IPV4 associated to your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String ipv4;

	/**
	 * Location where your service is
	 *
	 * canBeNull && readOnly
	 */
	public String[] zone;

	/**
	 * The IPV6 associated to your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String ipv6;

	/**
	 * Available additional zone for your Load Balancer
	 *
	 * canBeNull && readOnly
	 */
	public OvhOrderableZone[] orderableZone;

	/**
	 * Current state of your IP
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpStateEnum state;

	/**
	 * Name of the vRack on which the current Load Balancer is attached to, as it is named on vRack product
	 *
	 * canBeNull && readOnly
	 */
	public String vrackName;

	/**
	 * Your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String ipLoadbalancing;
}
