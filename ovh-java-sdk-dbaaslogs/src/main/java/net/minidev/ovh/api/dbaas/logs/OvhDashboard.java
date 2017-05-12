package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Graylog dashboard
 */
public class OvhDashboard {
	/**
	 * Dashboard creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Indicates if you are allowed to edit entry
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isEditable;

	/**
	 * Dashboard UUID
	 *
	 * canBeNull && readOnly
	 */
	public String dashboardId;

	/**
	 * Dashboard description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Associated DBaaS Logs option
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Dashboard description
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Dashboard last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;
}
