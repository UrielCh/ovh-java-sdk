package net.minidev.ovh.api.dedicated;

/**
 * A structure describing the availabilities of dedicated server
 */
public class OvhAvailabilitiesRaw {
	/**
	 * Last availability rule applied
	 *
	 * canBeNull
	 */
	public String lastRule;

	/**
	 * Product reference
	 *
	 * canBeNull
	 */
	public String reference;

	/**
	 * Ordered count
	 *
	 * canBeNull
	 */
	public Long ordered;

	/**
	 * Validating order count
	 *
	 * canBeNull
	 */
	public Long orderedCheck;

	/**
	 * 4H count
	 *
	 * canBeNull
	 */
	public Long trueAvailable4H;

	/**
	 * 24H count
	 *
	 * canBeNull
	 */
	public Long trueAvailable24H;

	/**
	 * Region where is located the product
	 *
	 * canBeNull
	 */
	public OvhAvailabilityRegionEnum zone;

	/**
	 * Real stock (considering order in validating)
	 *
	 * canBeNull
	 */
	public Long trueAvailable;

	/**
	 * Real stock in database
	 *
	 * canBeNull
	 */
	public Long available;

	/**
	 * Stock in datacenter
	 *
	 * canBeNull
	 */
	public Long incomingDatacenter;

	/**
	 * Blockbuster stock count
	 *
	 * canBeNull
	 */
	public Long parentAvailable;

	/**
	 * The availability
	 *
	 * canBeNull
	 */
	public OvhAvailabilityEnum availability;
}
