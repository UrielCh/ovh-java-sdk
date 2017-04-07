package net.minidev.ovh.api.iploadbalancing.frontendtcp;

/**
 * Frontend TCP
 */
public class OvhFrontendTcp {
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
	 * Listening port(s) on the server
	 *
	 * canBeNull && readOnly
	 */
	public String port;

	/**
	 * Restrict IP Load Balancing access to these ip block. No restriction if null
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
	 * Id of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Only attach frontend on these ip. No restriction if null
	 *
	 * canBeNull && readOnly
	 */
	public String[] dedicatedIpfo;

	/**
	 * SSL deciphering
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ssl;

	/**
	 * Default TCP Farm of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultFarmId;
}
