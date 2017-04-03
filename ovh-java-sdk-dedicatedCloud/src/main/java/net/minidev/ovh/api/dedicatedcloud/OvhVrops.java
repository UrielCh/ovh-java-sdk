package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.vrops.OvhStateEnum;

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
}
