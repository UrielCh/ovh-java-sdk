package net.minidev.ovh.api.iploadbalancing.customerserver;

import net.minidev.ovh.api.iploadbalancing.OvhCustomerServerStatusEnum;
import net.minidev.ovh.api.iploadbalancing.OvhCustomerServerTypeEnum;

/**
 * Server
 */
public class OvhCustomerServer {
	/**
	 * Address of your server
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Zone of your server
	 *
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * Id of your server
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of your server
	 *
	 * canBeNull && readOnly
	 */
	public OvhCustomerServerTypeEnum type;

	/**
	 * Status attached to your server
	 *
	 * canBeNull && readOnly
	 */
	public OvhCustomerServerStatusEnum status;
}
