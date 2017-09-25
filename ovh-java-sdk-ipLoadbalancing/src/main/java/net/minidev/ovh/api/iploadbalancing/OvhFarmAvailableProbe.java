package net.minidev.ovh.api.iploadbalancing;

/**
 * Available farm probes options
 */
public class OvhFarmAvailableProbe {
	/**
	 * List of available HTTP method, if available
	 *
	 * canBeNull
	 */
	public String[] method;

	/**
	 * True is this probe type supports a custom port
	 *
	 * canBeNull
	 */
	public Boolean port;

	/**
	 * List of matches operators that accept the negate option for this type of probe
	 *
	 * canBeNull
	 */
	public String[] negatableMatches;

	/**
	 * Probe protocol name. See probe "type" field in the farm probe
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * List of possible probe result checkers for this type of probe
	 *
	 * canBeNull
	 */
	public String[] matches;

	/**
	 * True is this probe type supports a URL
	 *
	 * canBeNull
	 */
	public Boolean url;
}
