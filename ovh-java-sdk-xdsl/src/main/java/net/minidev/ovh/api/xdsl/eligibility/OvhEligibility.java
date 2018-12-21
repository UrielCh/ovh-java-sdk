package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Eligibility result
 */
public class OvhEligibility {
	/**
	 * Portability capabilities
	 *
	 * canBeNull
	 */
	public OvhPortability portability;

	/**
	 * The eligible offers list
	 *
	 * canBeNull
	 */
	public OvhOffer[] offers;

	/**
	 * The line characteristics
	 *
	 * canBeNull
	 */
	public OvhLineCharacteristics characteristics;

	/**
	 * The eligibility endpoint type
	 *
	 * canBeNull
	 */
	public OvhLineEndpointEnum endpoint;

	/**
	 * The line address
	 *
	 * canBeNull
	 */
	public OvhAddress address;

	/**
	 * The eligibility uuid
	 *
	 * canBeNull
	 */
	public String id;

	/**
	 * The line infos
	 *
	 * canBeNull
	 */
	public OvhLineInfos infos;
}
