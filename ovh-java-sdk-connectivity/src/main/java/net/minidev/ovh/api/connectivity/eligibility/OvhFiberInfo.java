package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Fiber informations
 */
public class OvhFiberInfo {
	/**
	 * Building name
	 *
	 * canBeNull
	 */
	public String buildingName;

	/**
	 * NRO ("Nœud de raccordement optique" in french) is an identifier of the building where is the Optical Distribution Frame (ODF) of the fiber
	 *
	 * canBeNull
	 */
	public String nro;

	/**
	 * Operator code
	 *
	 * canBeNull
	 */
	public String operatorCode;

	/**
	 * Building unique identifier
	 *
	 * canBeNull
	 */
	public String buildingReference;

	/**
	 * Operator name
	 *
	 * canBeNull
	 */
	public String operatorName;

	/**
	 * Building type
	 *
	 * canBeNull
	 */
	public OvhBuildingTypeEnum buildingType;
}
