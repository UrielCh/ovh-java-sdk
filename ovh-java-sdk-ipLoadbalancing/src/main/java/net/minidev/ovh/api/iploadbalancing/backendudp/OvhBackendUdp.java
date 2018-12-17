package net.minidev.ovh.api.iploadbalancing.backendudp;

/**
 * UDP Farm
 */
public class OvhBackendUdp {
	/**
	 * Internal Load Balancer identifier of the vRack private network attached to your farm, mandatory when your Load Balancer is attached to a vRack
	 *
	 * canBeNull && readOnly
	 */
	public Long vrackNetworkId;

	/**
	 * Port attached to your farm. Inherited from frontend if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Zone of you farm
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

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
	public Long farmId;
}
