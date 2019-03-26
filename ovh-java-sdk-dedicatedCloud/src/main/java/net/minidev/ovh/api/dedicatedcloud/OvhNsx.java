package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.option.OvhStateEnum;

/**
 * The Private Cloud Nsx option
 */
public class OvhNsx {
	/**
	 * State of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Url of the NSX API
	 *
	 * canBeNull && readOnly
	 */
	public String url;
}
