package net.minidev.ovh.api.iploadbalancing.backendudp;

/**
 * UDP Farm
 */
public class OvhBackendUdp {
	/**
	 * Zone of you farm
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Port attached to your farm. Inherited from frontend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Human readable name for your backend, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Id of your farm
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
