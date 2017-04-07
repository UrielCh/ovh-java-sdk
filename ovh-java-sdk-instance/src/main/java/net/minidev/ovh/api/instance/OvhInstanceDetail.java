package net.minidev.ovh.api.instance;

import java.util.Date;
import net.minidev.ovh.api.flavor.OvhFlavor;
import net.minidev.ovh.api.image.OvhImage;
import net.minidev.ovh.api.ssh.OvhSSHKeyPair;

/**
 * 
 */
public class OvhInstanceDetail {
	/**
	 * Instance flavor
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlavor flavor;

	/**
	 * Instance image
	 *
	 * canBeNull && readOnly
	 */
	public OvhImage image;

	/**
	 * Instance id
	 *
	 * canBeNull && readOnly
	 */
	public String instanceId;

	/**
	 * Instance main IPv4
	 *
	 * canBeNull && readOnly
	 */
	public String ipv4;

	/**
	 * SSH keypair
	 *
	 * canBeNull && readOnly
	 */
	public OvhSSHKeyPair sshKey;

	/**
	 * Instance creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date created;

	/**
	 * Instance name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Instance region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Instance IPs
	 *
	 * canBeNull && readOnly
	 */
	public OvhInstanceIp[] ips;

	/**
	 * Instance status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
