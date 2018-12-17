package net.minidev.ovh.api.xdsl;

/**
 * Information about the physical copper line
 */
public class OvhLine {
	/**
	 * Whether the line number has been ported to OVH, to be used with VoIP service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean portability;

	/**
	 * Data to identify the line at the concentration point
	 *
	 * canBeNull && readOnly
	 */
	public OvhLandlineConcentrationPoint concentrationPoint;

	/**
	 * The number used to place the order. Null if the same as the current number.
	 *
	 * canBeNull && readOnly
	 */
	public String originalNumber;

	/**
	 * The number of the line
	 *
	 * canBeNull && readOnly
	 */
	public String number;

	/**
	 * Mitigation of the line in dB
	 *
	 * canBeNull && readOnly
	 */
	public Double mitigation;

	/**
	 * Distance in meters from the DSLAM
	 *
	 * canBeNull && readOnly
	 */
	public Long distance;

	/**
	 * canBeNull && readOnly
	 */
	public OvhFaultRepairTimeEnum faultRepairTime;

	/**
	 * Detailed information about the sections between the DSLAM and the telephone jack
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineSectionLength[] lineSectionsLength;

	/**
	 * True if the line is directly wired on the DSLAM
	 *
	 * canBeNull && readOnly
	 */
	public Boolean directDistribution;

	/**
	 * The download synchronisation on the DSLAM in Kbps
	 *
	 * canBeNull && readOnly
	 */
	public Double syncDown;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDeconsolidationEnum deconsolidation;

	/**
	 * The upload synchronisation on the DSLAM in Kbps
	 *
	 * canBeNull && readOnly
	 */
	public Double syncUp;
}
