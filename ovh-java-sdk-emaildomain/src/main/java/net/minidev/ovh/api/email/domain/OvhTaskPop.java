package net.minidev.ovh.api.email.domain;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhDomainPopActionEnum;

/**
 * Task Pop List
 */
public class OvhTaskPop {
	/**
	 * Creation date of task
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Domain name of task
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Account name of task
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Action of task
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainPopActionEnum action;

	/**
	 * Id of task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
