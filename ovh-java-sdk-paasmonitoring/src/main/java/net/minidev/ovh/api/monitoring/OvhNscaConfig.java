package net.minidev.ovh.api.monitoring;

/**
 * Configuration for the NSCA receiver
 */
public class OvhNscaConfig {
	/**
	 * The kind of encryption (only kind 1 is supported, 0 is for no encryption)
	 *
	 * canBeNull && readOnly
	 */
	public Long encryption;

	/**
	 * true to enable the NSCA receiver (for passive checks)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;

	/**
	 * The encryption key
	 *
	 * canBeNull && readOnly
	 */
	public String key;
}
