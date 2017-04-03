package net.minidev.ovh.api.dedicated.server;

import java.util.Date;

/**
 * Physical KVM
 */
public class OvhKvm {
	/**
	 * KVM access ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * KVM hostname
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * KVM expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expiration;
}
