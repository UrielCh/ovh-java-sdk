package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.runtime.OvhEnvEnum;
import net.minidev.ovh.api.hosting.web.runtime.OvhStateEnum;
import net.minidev.ovh.api.hosting.web.runtime.OvhTypeEnum;

/**
 * The runtime configuration of an attached domain for cloud web offer
 */
public class OvhRuntime {
	/**
	 * Return if the runtime configuration can be deleted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isDeletable;

	/**
	 * Is the runtime configuration is the one by default for the hosting
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isDefault;

	/**
	 * The last update date of the runtime configuration
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * The client application environment
	 *
	 * canBeNull && readOnly
	 */
	public OvhEnvEnum appEnv;

	/**
	 * The custom display name of the runtime configuration
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The client application public directory
	 *
	 * canBeNull && readOnly
	 */
	public String publicDir;

	/**
	 * The client application bootstrap script
	 *
	 * canBeNull && readOnly
	 */
	public String appBootstrap;

	/**
	 * The runtime configuration ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The backend type of the runtime
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;

	/**
	 * The creation date of the runtime configuration
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The link current task for the runtime configuration
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The status of the runtime
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;
}
