package net.minidev.ovh.api.iploadbalancing.backendudpcustomerserver;

import net.minidev.ovh.api.iploadbalancing.OvhBackendCustomerServerStatusEnum;

/**
 * UDP Farm's Server
 */
public class OvhBackendUDPServer {
	/**
	 * Address of your server
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Port attached to your server. Inherited from farm if null
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * farm id
	 *
	 * canBeNull && readOnly
	 */
	public Long backendId;

	/**
	 * Id of your server
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Status attached to your server
	 *
	 * canBeNull && readOnly
	 */
	public OvhBackendCustomerServerStatusEnum status;
}
