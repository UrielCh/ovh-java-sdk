package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.optionaccessnetwork.OvhStateEnum;

/**
 * Private Cloud VM Encryption option access network
 */
public class OvhVMEncryptionAccessNetwork {
	/**
	 * SSL thumbprint of the remote service
	 *
	 * canBeNull && readOnly
	 */
	public String sslThumbprint;

	/**
	 * IP address of the remote service
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * VM Encryption KMS TCP port
	 *
	 * canBeNull && readOnly
	 */
	public Long kmsTcpPort;

	/**
	 * Description of your option access network
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Id of the VM Encryption KMS
	 *
	 * canBeNull && readOnly
	 */
	public Long kmsId;

	/**
	 * State of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;
}
