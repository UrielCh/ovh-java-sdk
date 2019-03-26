package net.minidev.ovh.api.router;

import java.util.Date;

/**
 * Private Link to another service
 */
public class OvhPrivateLink {
	/**
	 * Your memory-friendly name of this private link
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Service name of the other side of this link
	 *
	 * canBeNull && readOnly
	 */
	public String peerServiceName;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
