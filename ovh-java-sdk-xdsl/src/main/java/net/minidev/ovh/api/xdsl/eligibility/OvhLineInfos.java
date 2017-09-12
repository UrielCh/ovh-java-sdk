package net.minidev.ovh.api.xdsl.eligibility;

/**
 * The line infos
 */
public class OvhLineInfos {
	/**
	 * The line status, if endpoint is number
	 *
	 * canBeNull
	 */
	public OvhLandlineStatusEnum lineStatus;

	/**
	 * Weither we are in create neighbor case or not
	 *
	 * canBeNull
	 */
	public Boolean createNeighbour;

	/**
	 * Is the number unlisted ?
	 *
	 * canBeNull
	 */
	public Boolean unlistedNumber;

	/**
	 * The line number, if endpoint is number
	 *
	 * canBeNull
	 */
	public String lineNumber;
}
