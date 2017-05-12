package net.minidev.ovh.api.dbaas.logs;

/**
 * Logstash configuration
 */
public class OvhLogstashConfiguration {
	/**
	 * The filter section of logstash.conf
	 *
	 * canBeNull && readOnly
	 */
	public String inputSection;

	/**
	 * The filter section of logstash.conf
	 *
	 * canBeNull && readOnly
	 */
	public String filterSection;

	/**
	 * The list of customs Grok patterns
	 *
	 * canBeNull && readOnly
	 */
	public String patternSection;
}
