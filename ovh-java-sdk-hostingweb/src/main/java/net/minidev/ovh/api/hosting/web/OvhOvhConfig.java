package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEngineNameEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEngineVersionEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhEnvironmentEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhHttpFirewallEnum;
import net.minidev.ovh.api.hosting.web.ovhconfig.OvhStatusEnum;

/**
 * Virtual service
 */
public class OvhOvhConfig {
	/**
	 * Container to run this website
	 *
	 * canBeNull && readOnly
	 */
	public String container;

	/**
	 * Name of engine you want
	 *
	 * canBeNull && readOnly
	 */
	public OvhEngineVersionEnum engineVersion;

	/**
	 * Config path, relative to your home directory
	 *
	 * canBeNull && readOnly
	 */
	public String path;

	/**
	 * Environment configuration you want
	 *
	 * canBeNull && readOnly
	 */
	public OvhEnvironmentEnum environment;

	/**
	 * If .ovhConfig exists
	 *
	 * canBeNull && readOnly
	 */
	public Boolean fileExist;

	/**
	 * If this configuration is an old configuration
	 *
	 * canBeNull && readOnly
	 */
	public Boolean historical;

	/**
	 * Configuration you want for http firewall
	 *
	 * canBeNull && readOnly
	 */
	public OvhHttpFirewallEnum httpFirewall;

	/**
	 * Configuration's id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Version of engine you want
	 *
	 * canBeNull && readOnly
	 */
	public OvhEngineNameEnum engineName;

	/**
	 * When ovhconfig was created, or found for the first time, on the hosting servers
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The task ID working on this configuration
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The configuration status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
