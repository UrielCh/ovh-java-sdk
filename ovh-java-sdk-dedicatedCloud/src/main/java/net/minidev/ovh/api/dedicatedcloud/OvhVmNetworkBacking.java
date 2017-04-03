package net.minidev.ovh.api.dedicatedcloud;

/**
 * A structure describing the backing network of a the virtual machine
 */
public class OvhVmNetworkBacking {
	/**
	 * canBeNull
	 */
	public String portGroupKey;

	/**
	 * canBeNull
	 */
	public String switchUuid;

	/**
	 * canBeNull
	 */
	public Boolean useAutoDetect;

	/**
	 * canBeNull
	 */
	public String valueMoref;

	/**
	 * canBeNull
	 */
	public OvhVmNetworkBackingTypeEnum type;

	/**
	 * canBeNull
	 */
	public String deviceName;

	/**
	 * canBeNull
	 */
	public String portKey;
}
