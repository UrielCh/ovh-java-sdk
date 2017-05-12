package net.minidev.ovh.api.license.office;

import java.util.Date;

/**
 * Office subscription
 */
public class OvhOfficeSubscription {
	/**
	 * Number of available licenses
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Subscription's unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * License's type id
	 *
	 * canBeNull && readOnly
	 */
	public Long licenseId;

	/**
	 * Pending task's unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Current state of the subscription
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
