package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.option.OvhStateEnum;

/**
 * The Private Cloud vRealize Operations option
 */
public class OvhVrops {
	/**
	 * State of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Url of the vRealize Operations interface
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
