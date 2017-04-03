package net.minidev.ovh.api.iploadbalancing;

/**
 * Your IP load balancing
 */
public class OvhIp {
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
	 * Set the name displayed in ManagerV6 for your iplb (max 50 chars)
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Current state of your IP
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpStateEnum state;

	/**
	 * The internal name of your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Your IP load balancing
	 *
	 * canBeNull && readOnly
	 */
	public String ipLoadbalancing;
}
