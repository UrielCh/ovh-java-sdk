package net.minidev.ovh.api.deskaas;

import java.util.Date;

/**
 * Operation on a Desktop As A Service component
 */
public class OvhTask {
	/**
	 * Task last modification date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModificationDate;

	/**
	 * Task name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Current progress description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Current progress
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Current Task state
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum state;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
