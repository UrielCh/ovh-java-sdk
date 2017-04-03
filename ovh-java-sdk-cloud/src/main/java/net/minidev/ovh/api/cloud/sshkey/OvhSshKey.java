package net.minidev.ovh.api.cloud.sshkey;

/**
 * SshKey
 */
public class OvhSshKey {
	/**
	 * SSH key regions
	 *
	 * canBeNull && readOnly
	 */
	public String[] regions;

	/**
	 * SSH key name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * SSH key id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * SSH public key
	 *
	 * canBeNull && readOnly
	 */
	public String publicKey;
}
