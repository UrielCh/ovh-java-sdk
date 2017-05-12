package net.minidev.ovh.api.dbaas.logs;

/**
 * Input engine
 */
public class OvhEngine {
	/**
	 * Indicates if engine will soon not be supported
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isDeprecated;

	/**
	 * Software name
	 *
	 * canBeNull && readOnly
	 */
	public OvhEngineNameEnum name;

	/**
	 * Software version
	 *
	 * canBeNull && readOnly
	 */
	public String version;

	/**
	 * Input engine UUID
	 *
	 * canBeNull && readOnly
	 */
	public String engineId;
}
