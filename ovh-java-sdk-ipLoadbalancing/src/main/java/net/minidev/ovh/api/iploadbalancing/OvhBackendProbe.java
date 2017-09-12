package net.minidev.ovh.api.iploadbalancing;

/**
 * Probe used to determine if a backend is alive and can handle requests
 */
public class OvhBackendProbe {
	/**
	 * HTTP method to use with "http" probe. Consider using HEAD to save bandwidth when possible. Defaults to "GET"
	 *
	 * canBeNull
	 */
	public OvhProbeMethodEnum method;

	/**
	 * Port used to probe your backend. Equal to farm port if null. Ignored for oco probe type
	 *
	 * canBeNull
	 */
	public Long port;

	/**
	 * Invert the matching operator effect
	 *
	 * canBeNull
	 */
	public Boolean negate;

	/**
	 * Force probe to run over a SSL layer. Defaults to false
	 *
	 * canBeNull
	 */
	public Boolean forceSsl;

	/**
	 * Matcher to use to valide "expect". "default" uses HAProxy's default behavior for this type of check. "status" is only supported for HTTP probes
	 *
	 * canBeNull
	 */
	public OvhProbeExpectMatchEnum match;

	/**
	 * Server response expected when UP. Empty for "default", comma delimited list of statuses for "status", string for "contains", regex for "matches"
	 *
	 * canBeNull
	 */
	public String pattern;

	/**
	 * Seconds between each probe check. Must be > 30sec. Defaults to 30
	 *
	 * canBeNull
	 */
	public Long interval;

	/**
	 * Probe type. "tcp" if null
	 *
	 * canBeNull
	 */
	public OvhProbeTypeEnum type;

	/**
	 * URL to use for HTTP probes of the form [www.example.com]/path/to/check. Protocol will be ignored. Defaults to "/"
	 *
	 * canBeNull
	 */
	public String url;
}
