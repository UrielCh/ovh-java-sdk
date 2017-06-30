package net.minidev.ovh.api.metrics.api;

/**
 * Structure holding the elements about a label
 */
public class OvhLabel {
	/**
	 * Label value
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * Label key
	 *
	 * canBeNull && readOnly
	 */
	public String key;
}
