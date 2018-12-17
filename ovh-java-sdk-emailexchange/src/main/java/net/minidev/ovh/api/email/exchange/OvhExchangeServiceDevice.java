package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Get the list of your ActiveSync devices registered on this Exchange service
 */
public class OvhExchangeServiceDevice {
	/**
	 * Exchange identity
	 *
	 * canBeNull && readOnly
	 */
	public String identity;

	/**
	 * Last update date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * user guid
	 *
	 * canBeNull && readOnly
	 */
	public String guid;

	/**
	 * Model device
	 *
	 * canBeNull && readOnly
	 */
	public String deviceModel;

	/**
	 * International Mobile Equipment Identity
	 *
	 * canBeNull && readOnly
	 */
	public String IMEI;

	/**
	 * Device State
	 *
	 * canBeNull && readOnly
	 */
	public OvhDeviceActiveSyncStateEnum deviceState;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Device Id
	 *
	 * canBeNull && readOnly
	 */
	public String deviceId;

	/**
	 * Pending task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
