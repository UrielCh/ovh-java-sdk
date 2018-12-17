package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Details about the resiliation
 */
public class OvhResiliationFollowUpDetail {
	/**
	 * If the customer needs to return his modem
	 *
	 * canBeNull
	 */
	public Boolean needModemReturn;

	/**
	 * Date when the resiliation was done
	 *
	 * canBeNull
	 */
	public Date registrationDate;

	/**
	 * Date when the resiliation will take effect
	 *
	 * canBeNull
	 */
	public Date dateTodo;

	/**
	 * Status of the resiliation
	 *
	 * canBeNull
	 */
	public String status;
}
