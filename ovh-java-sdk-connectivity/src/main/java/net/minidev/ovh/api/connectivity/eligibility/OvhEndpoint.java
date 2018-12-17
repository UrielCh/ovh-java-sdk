package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Endpoint informations
 */
public class OvhEndpoint {
	/**
	 * Reference of the endpoint
	 *
	 * canBeNull
	 */
	public String reference;

	/**
	 * Portability informations, for copper only
	 *
	 * canBeNull
	 */
	public OvhPortability portability;

	/**
	 * Address
	 *
	 * canBeNull
	 */
	public OvhAddress address;

	/**
	 * Copper informations, if any
	 *
	 * canBeNull
	 */
	public OvhCopperInfo copperInfo;

	/**
	 * Reference type
	 *
	 * canBeNull
	 */
	public OvhEndpointReferenceTypeEnum referenceType;

	/**
	 * Fiber informations, if any
	 *
	 * canBeNull
	 */
	public OvhFiberInfo fiberInfo;
}
