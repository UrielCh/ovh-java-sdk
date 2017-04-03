package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.vlan.OvhStateEnum;
import net.minidev.ovh.api.dedicatedcloud.vlan.OvhTypeEnum;

/**
 * Private Cloud Vlan
 */
public class OvhVlan {
	/**
	 * canBeNull && readOnly
	 */
	public Long vlanId;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Speed in Mbps
	 *
	 * canBeNull && readOnly
	 */
	public String routingRateLimit;

	/**
	 * canBeNull && readOnly
	 */
	public Long vlanNumber;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;
}
