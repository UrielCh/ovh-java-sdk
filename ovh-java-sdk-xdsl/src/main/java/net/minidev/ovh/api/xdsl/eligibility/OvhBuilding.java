package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Details of a Building
 */
public class OvhBuilding {
	/**
	 * Identifier which refer to a building uniquely
	 *
	 * canBeNull
	 */
	public String reference;

	/**
	 * Building name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Building NRO (Optical main distribution frame)
	 *
	 * canBeNull
	 */
	public String nro;

	/**
	 * Building type
	 *
	 * canBeNull
	 */
	public OvhBuildingTypeEnum type;
}
