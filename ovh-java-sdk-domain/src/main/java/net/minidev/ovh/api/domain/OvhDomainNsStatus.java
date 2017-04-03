package net.minidev.ovh.api.domain;

import java.util.Date;

/**
 * DNS server status
 */
public class OvhDomainNsStatus {
	/**
	 * Date from which the DNS server is used by the domain
	 *
	 * canBeNull
	 */
	public Date usedSince;

	/**
	 * Whether or not the DNS server is working
	 *
	 * canBeNull
	 */
	public OvhDomainNsStateEnum state;

	/**
	 * Whether or not the DNS server is managed by OVH
	 *
	 * canBeNull
	 */
	public OvhDomainNsTypeEnum type;
}
