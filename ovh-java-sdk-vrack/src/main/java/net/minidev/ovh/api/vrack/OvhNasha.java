package net.minidev.ovh.api.vrack;

/**
 * vrack (1.5) nasha server interfaces
 */
public class OvhNasha {
	/**
	 * service ip
	 *
	 * canBeNull && readOnly
	 */
	public String serviceIp;

	/**
	 * Name of Nasha zpool
	 *
	 * canBeNull && readOnly
	 */
	public String zpool;
}
