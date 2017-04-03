package net.minidev.ovh.api.billing.order;

import net.minidev.ovh.api.billing.order.associatedobject.OvhTypeEnum;

/**
 * The object the processing of the order leaded to
 */
public class OvhAssociatedObject {
	/**
	 * canBeNull
	 */
	public String id;

	/**
	 * canBeNull
	 */
	public OvhTypeEnum type;
}
