package net.minidev.ovh.api.xdsl;

/**
 * Infos about a Landline at the concentration point
 */
public class OvhLandlineConcentrationPoint {
	/**
	 * Identifier of the pair at the lineHead's lineInitialSection
	 *
	 * canBeNull
	 */
	public Long lineInitialSectionPair;

	/**
	 * Identifier of the section at the lineHead
	 *
	 * canBeNull
	 */
	public Long lineInitialSection;

	/**
	 * Identifier of the head of the cable from the MDF
	 *
	 * canBeNull
	 */
	public String lineHead;
}
