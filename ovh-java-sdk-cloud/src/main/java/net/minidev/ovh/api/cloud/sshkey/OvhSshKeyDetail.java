package net.minidev.ovh.api.cloud.sshkey;

/**
 * SshKeyDetail
 */
public class OvhSshKeyDetail {
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
	 * SSH public key
	 *
	 * canBeNull && readOnly
	 */
	public String publicKey;

	/**
	 * SSH key id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * SSH key fingerprint
	 *
	 * canBeNull && readOnly
	 */
	public String fingerPrint;
}
