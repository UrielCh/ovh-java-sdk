package net.minidev.ovh.api.msservices;

/**
 * Multi Factor Authentication informations
 */
public class OvhMfaInformation {
	/**
	 * Current status of Multi Factor Authentication feature
	 *
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Pending task for Multi Factor Authentication
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Indicates if Multi Factor Authentication is activated on this account
	 *
	 * canBeNull && readOnly
	 */
	public Boolean activated;
}
