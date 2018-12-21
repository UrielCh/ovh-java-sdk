package net.minidev.ovh.api.paas.timeseries;

import net.minidev.ovh.api.tsaas.OvhPermissionEnum;

/**
 * Key
 */
public class OvhKey {
	/**
	 * List of permissions
	 *
	 * canBeNull && readOnly
	 */
	public OvhPermissionEnum[] permissions;

	/**
	 * Description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

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
