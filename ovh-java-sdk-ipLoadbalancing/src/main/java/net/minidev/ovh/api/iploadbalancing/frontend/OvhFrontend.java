package net.minidev.ovh.api.iploadbalancing.frontend;

import net.minidev.ovh.api.iploadbalancing.OvhProxyTypeEnum;

/**
 * Frontend
 */
public class OvhFrontend {
	/**
	 * Add header to your frontend. Useful variables admitted : %ci <=> client_ip, %cp <=> client_port
	 *
	 * canBeNull && readOnly
	 */
	public String[] httpHeader;

	/**
	 * Only attach frontend on these ip. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] dedicatedIpfo;

	/**
	 * Type of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public OvhProxyTypeEnum type;

	/**
	 * SSL deciphering
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ssl;

	/**
	 * Default ssl served to your customer
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultSslId;

	/**
	 * Zone of you frontend
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Port(s) attached to your frontend
	 *
	 * canBeNull && readOnly
	 */
	public String port;

	/**
	 * Default Backend of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultBackendId;

	/**
	 * Restrict iplb access to these ip block. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] allowedSource;

	/**
	 * Disable frontend
	 *
	 * canBeNull && readOnly
	 */
	public Boolean disabled;

	/**
	 * HTTP Strict Transport Security
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hsts;

	/**
	 * Id of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * HTTP redirection (Ex : http://www.ovh.com)
	 *
	 * canBeNull && readOnly
	 */
	public String redirectLocation;
}
