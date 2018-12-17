package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.localseo.account.OvhStatusEnum;

/**
 * Local SEO accounts
 */
public class OvhLocalSeoAccount {
	/**
	 * Date of the last account's update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Account id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date of creation of the account
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Running task associated to the account
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Email address associated to the account
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Current status of the account
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
