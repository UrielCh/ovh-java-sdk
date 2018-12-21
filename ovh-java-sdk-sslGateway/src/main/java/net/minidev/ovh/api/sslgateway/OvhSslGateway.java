package net.minidev.ovh.api.sslgateway;

/**
 * Your SSL Gateway
 */
public class OvhSslGateway {
	/**
	 * The metrics token associated with your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String metricsToken;

	/**
	 * Custom name of your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * The internal name of your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Set to true to contact backend servers over HTTPS
	 *
	 * canBeNull && readOnly
	 */
	public Boolean serverHttps;

	/**
	 * Zones of your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String[] zones;

	/**
	 * Custom reverse for your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public String reverse;

	/**
	 * Current offer for your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferEnum offer;

	/**
	 * Modern oldest compatible clients : Firefox 27, Chrome 30, IE 11 on Windows 7, Edge, Opera 17, Safari 9, Android 5.0, and Java 8. Intermediate oldest compatible clients : Firefox 1, Chrome 1, IE 7, Opera 5, Safari 1, Windows XP IE8, Android 2.3, Java 7. Intermediate if null.
	 *
	 * canBeNull && readOnly
	 */
	public OvhSslConfigurationEnum sslConfiguration;

	/**
	 * The IPv4 you need to put in the A field of your domain name
	 *
	 * canBeNull && readOnly
	 */
	public String ipv4;

	/**
	 * Restrict SSL Gateway access to these ip block. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] allowedSource;

	/**
	 * Set to true to enable https redirect
	 *
	 * canBeNull && readOnly
	 */
	public Boolean httpsRedirect;

	/**
	 * The IPv6 you need to put in the AAAA field of your domain name
	 *
	 * canBeNull && readOnly
	 */
	public String ipv6;

	/**
	 * Current state of your SSL Gateway
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Set to true to enable Strict-Transport-Security HTTP header
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hsts;
}
