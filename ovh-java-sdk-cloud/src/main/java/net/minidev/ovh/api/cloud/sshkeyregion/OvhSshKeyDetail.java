package net.minidev.ovh.api.cloud.sshkeyregion;

import java.util.Date;

/**
 * SshKeyDetail
 */
public class OvhSshKeyDetail {
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
	 * SSH key creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * SSH key fingerprint
	 *
	 * canBeNull && readOnly
	 */
	public String fingerPrint;
}
