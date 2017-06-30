package net.minidev.ovh.api.metrics.api;

import java.util.Date;

/**
 * Structure holding the options for a service
 */
public class OvhOption {
	/**
	 * Monthly active device streams
	 *
	 * canBeNull && readOnly
	 */
	public Long mads;

	/**
	 * Daily data points
	 *
	 * canBeNull && readOnly
	 */
	public Long ddp;

	/**
	 * Time of last modification
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModification;
}
