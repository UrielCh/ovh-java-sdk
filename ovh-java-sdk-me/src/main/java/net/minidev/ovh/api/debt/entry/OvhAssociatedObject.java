package net.minidev.ovh.api.debt.entry;

import net.minidev.ovh.api.debt.associatedobject.OvhPaymentInfo;
import net.minidev.ovh.api.debt.associatedobject.OvhTypeEnum;

/**
 * The object linked to this debt entry
 */
public class OvhAssociatedObject {
	/**
	 * canBeNull
	 */
	public String subId;

	/**
	 * canBeNull
	 */
	public String id;

	/**
	 * canBeNull
	 */
	public OvhTypeEnum type;

	/**
	 * canBeNull
	 */
	public OvhPaymentInfo paymentInfo;
}
