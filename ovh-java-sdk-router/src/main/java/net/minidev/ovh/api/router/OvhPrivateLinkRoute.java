package net.minidev.ovh.api.router;

import java.util.Date;

/**
 * Outgoing routes configured inside a Private Link
 */
public class OvhPrivateLinkRoute {
	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Network allowed to be routed outside
	 *
	 * canBeNull && readOnly
	 */
	public String network;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
