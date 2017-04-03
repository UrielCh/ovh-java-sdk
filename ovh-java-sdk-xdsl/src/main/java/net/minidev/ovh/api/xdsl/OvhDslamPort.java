package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Information about the port on the DSLAM
 */
public class OvhDslamPort {
	/**
	 * canBeNull && readOnly
	 */
	public OvhDslamLineProfile profile;

	/**
	 * Last time the port lost the synchronization
	 *
	 * canBeNull && readOnly
	 */
	public Date lastDesyncDate;

	/**
	 * Last time the port synchronized
	 *
	 * canBeNull && readOnly
	 */
	public Date lastSyncDate;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDslamPortStatusEnum status;
}
