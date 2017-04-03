package net.minidev.ovh.api.stack.mis;

import net.minidev.ovh.api.stack.OvhStackTypeEnum;

/**
 * Stack MIS
 */
public class OvhProduct {
	/**
	 * Domain of the service
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Type of the infrastructure
	 *
	 * canBeNull && readOnly
	 */
	public OvhStackTypeEnum type;
}
