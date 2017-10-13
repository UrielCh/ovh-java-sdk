package net.minidev.ovh.api.xdsl;

/**
 * Xdsl Settings
 */
public class OvhSetting {
	/**
	 * Send the modem as soon as possible, do not wait the xdsl line to be active
	 *
	 * canBeNull
	 */
	public Boolean resellerFastModemShipping;

	/**
	 * Let the modem with vendor configuration. It prevent to apply the config managed by ovh manager
	 *
	 * canBeNull
	 */
	public Boolean resellerModemBasicConfig;
}
