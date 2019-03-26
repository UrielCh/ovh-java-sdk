package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.envvar.OvhStatusEnum;
import net.minidev.ovh.api.hosting.web.envvar.OvhTypeEnum;

/**
 * Environment variables set into your webhosting account
 */
public class OvhEnvVar {
	/**
	 * Type of variable set
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;

	/**
	 * Value of the variable
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * The task ID working on this variable
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Name of the variable
	 *
	 * canBeNull && readOnly
	 */
	public String key;

	/**
	 * The environnement variable status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
