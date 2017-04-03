package net.minidev.ovh.api.xdsl.eligibility;

/**
 * The characteristics of a line
 */
public class OvhLineCharacteristics {
	/**
	 * The estimated mitigation for SDSL technology
	 *
	 * canBeNull
	 */
	public Double mitigationSdsl;

	/**
	 * The estimated mitigation for ADSL and VDSL technologies
	 *
	 * canBeNull
	 */
	public Double mitigation;

	/**
	 * Number of free pairs
	 *
	 * canBeNull
	 */
	public Long freePairs;

	/**
	 * Distance to the NRA in meters
	 *
	 * canBeNull
	 */
	public Long distance;

	/**
	 * The NRA
	 *
	 * canBeNull
	 */
	public String nra;

	/**
	 * Details of line calibration
	 *
	 * canBeNull
	 */
	public OvhLineSectionCalibration[] calibration;
}
