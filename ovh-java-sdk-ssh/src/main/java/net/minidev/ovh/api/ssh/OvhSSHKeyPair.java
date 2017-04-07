package net.minidev.ovh.api.ssh;

/**
 * 
 */
public class OvhSSHKeyPair {
	/**
	 * SSH keypair name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * SSH public key
	 *
	 * canBeNull && readOnly
	 */
	public String publicKey;

	/**
	 * SSH keypair region
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * SSH keypair fingerprint
	 *
	 * canBeNull && readOnly
	 */
	public String fingerPrint;
}
