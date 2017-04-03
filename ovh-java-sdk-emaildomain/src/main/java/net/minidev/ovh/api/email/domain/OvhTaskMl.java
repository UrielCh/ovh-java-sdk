package net.minidev.ovh.api.email.domain;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhDomainMlLanguageEnum;

/**
 * Task Mailing List
 */
public class OvhTaskMl {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDomainMlLanguageEnum language;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public String account;
}
