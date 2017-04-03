package net.minidev.ovh.api.email.domain;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhDomainSpecialAccountActionEnum;
import net.minidev.ovh.api.domain.OvhDomainSpecialAccountTypeEnum;

/**
 * Task special account List
 */
public class OvhTaskSpecialAccount {
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
	 * Action of task
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainSpecialAccountActionEnum action;

	/**
	 * Id of task
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of action filter
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainSpecialAccountTypeEnum type;

	/**
	 * Account name of task
	 *
	 * canBeNull && readOnly
	 */
	public String account;
}
