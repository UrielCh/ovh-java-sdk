package net.minidev.ovh.api.iploadbalancing.frontendudp;

/**
 * Frontend UDP
 */
public class OvhFrontendUdp {
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
	 * Human readable name for your frontend, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

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
	 * Default UDP Farm of your frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long defaultFarmId;
}
