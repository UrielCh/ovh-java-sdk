package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.module.OvhDependencyType;
import net.minidev.ovh.api.hosting.web.module.OvhLanguageEnum;
import net.minidev.ovh.api.hosting.web.module.OvhStatusEnum;

/**
 * Hosting modules installed
 */
public class OvhModule {
	/**
	 * Login for the admin account
	 *
	 * canBeNull && readOnly
	 */
	public String adminName;

	/**
	 * Where the module is installed, relative to your home directory
	 *
	 * canBeNull && readOnly
	 */
	public String path;

	/**
	 * Date of the last module's upgrade
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * The language of the module
	 *
	 * canBeNull && readOnly
	 */
	public OvhLanguageEnum language;

	/**
	 * Installation ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The admin folder, relative to the module's installation path
	 *
	 * canBeNull && readOnly
	 */
	public String adminFolder;

	/**
	 * ID of the module associated with this installation
	 *
	 * canBeNull && readOnly
	 */
	public Long moduleId;

	/**
	 * Date of the installation of the module
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * The URL from where your module can be reached
	 *
	 * canBeNull && readOnly
	 */
	public String targetUrl;

	/**
	 * The task ID working on this module
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The module status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;

	/**
	 * The dependencies to which the module has access. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
	 *
	 * canBeNull && readOnly
	 */
	public OvhDependencyType[] dependencies;
}
