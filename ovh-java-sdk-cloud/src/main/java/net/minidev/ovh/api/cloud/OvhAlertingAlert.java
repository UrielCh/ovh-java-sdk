package net.minidev.ovh.api.cloud;

import java.util.Date;

/**
 * Cloud alert on your consumption
 */
public class OvhAlertingAlert {
	/**
	 * Alert sent to
	 *
	 * canBeNull && readOnly
	 */
	public String[] emails;

	/**
	 * Alert date
	 *
	 * canBeNull && readOnly
	 */
	public Date alertDate;

	/**
	 * Alert id
	 *
	 * canBeNull && readOnly
	 */
	public Long alertId;
}
