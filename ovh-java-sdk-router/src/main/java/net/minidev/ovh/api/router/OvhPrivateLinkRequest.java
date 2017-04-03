package net.minidev.ovh.api.router;

import java.util.Date;

/**
 * Received Private Link requests
 */
public class OvhPrivateLinkRequest {
	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrivLinkReqStatusEnum status;
}
