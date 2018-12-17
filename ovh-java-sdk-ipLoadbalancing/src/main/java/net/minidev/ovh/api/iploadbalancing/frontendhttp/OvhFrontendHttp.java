package net.minidev.ovh.api.iploadbalancing.frontendhttp;

/**
 * Frontend HTTP
 */
public class OvhFrontendHttp {
	/**
	 * Add header to your frontend. Useful variables admitted : %ci <=> client_ip, %cp <=> client_port
	 *
	 * canBeNull && readOnly
	 */
	public String[] httpHeader;

	/**
	 * Human readable name for your frontend, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Only attach frontend on these ip. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] dedicatedIpfo;

	/**
	 * Id of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long frontendId;

	/**
	 * SSL deciphering. Default: 'false'
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
	 * Listening port(s) on the server
	 *
	 * canBeNull && readOnly
	 */
	public String port;

	/**
	 * Zone of you frontend
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Restrict IP Load Balancing access to these ip block. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] allowedSource;

	/**
	 * Disable frontend. Default: 'false'
	 *
	 * canBeNull && readOnly
	 */
	public Boolean disabled;

	/**
	 * HTTP Strict Transport Security. Default: 'false'
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hsts;

	/**
	 * Default HTTP Farm of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultFarmId;

	/**
	 * HTTP redirection (Ex : http://www.ovh.com)
	 *
	 * canBeNull && readOnly
	 */
	public String redirectLocation;
}
