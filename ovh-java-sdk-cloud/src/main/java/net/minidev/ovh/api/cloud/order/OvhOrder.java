package net.minidev.ovh.api.cloud.order;

import java.util.Date;

/**
 * Order
 */
public class OvhOrder {
	/**
	 * Order creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Service created
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Order plan code
	 *
	 * canBeNull && readOnly
	 */
	public String planCode;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
