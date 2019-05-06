package net.minidev.ovh.api.tsaas;

import net.minidev.ovh.api.paas.timeseries.OvhTag;

/**
 * Description not available
 */
public class OvhOpenTSDBToken {
	/**
	 * protocol
	 *
	 * canBeNull && readOnly
	 */
	public String protocol;

	/**
	 * Description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public String permission;

	/**
	 * Secret part
	 *
	 * canBeNull && readOnly
	 */
	public String secret;

	/**
	 * Id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * List of tags
	 *
	 * canBeNull && readOnly
	 */
	public OvhTag[] tags;
}
