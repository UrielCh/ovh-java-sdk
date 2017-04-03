package net.minidev.ovh.api.tsaas;

import net.minidev.ovh.api.paas.timeseries.OvhTag;

/**
 * OpenTSDBToken
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
	 * Id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Secret part
	 *
	 * canBeNull && readOnly
	 */
	public String secret;

	/**
	 * List of tags
	 *
	 * canBeNull && readOnly
	 */
	public OvhTag[] tags;
}
