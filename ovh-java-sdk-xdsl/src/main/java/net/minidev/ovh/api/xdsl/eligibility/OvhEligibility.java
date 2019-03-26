package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Eligibility result
 */
public class OvhEligibility {
	/**
	 * The eligible offers list
	 *
	 * canBeNull
	 */
	public OvhOffer[] offers;

	/**
	 * Portability capabilities
	 *
	 * canBeNull
	 */
	public OvhPortability portability;

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
