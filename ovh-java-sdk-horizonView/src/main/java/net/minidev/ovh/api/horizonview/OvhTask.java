package net.minidev.ovh.api.horizonview;

import java.util.Date;

/**
 * Operation on a Horizon View component
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
	 * Current progress
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Current progress description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

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
