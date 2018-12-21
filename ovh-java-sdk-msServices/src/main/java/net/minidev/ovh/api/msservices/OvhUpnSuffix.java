package net.minidev.ovh.api.msservices;

/**
 * Active Directory UPN Suffix
 */
public class OvhUpnSuffix {
	/**
	 * Ownership for upn suffix confirmed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ownershipValidated;

	/**
	 * Cname record used for UPN suffix verification
	 *
	 * canBeNull && readOnly
	 */
	public String cnameToCheck;

	/**
	 * UPN suffix state
	 *
	 * canBeNull && readOnly
	 */
	public OvhUPNStateEnum state;

	/**
	 * UPN suffix
	 *
	 * canBeNull && readOnly
	 */
	public String suffix;

	/**
	 * Pending task for this upnSuffix
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
