package net.minidev.ovh.api.email.domain;

import java.util.Date;
import net.minidev.ovh.api.domain.OvhDomainMlLanguageEnum;
import net.minidev.ovh.api.domain.OvhDomainMlOptionsStruct;

/**
 * Mailing List
 */
public class OvhMailingList {
	/**
	 * Subscribers number of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public Long nbSubscribers;

	/**
	 * Last update subscribers
	 *
	 * canBeNull && readOnly
	 */
	public Date nbSubscribersUpdateDate;

	/**
	 * Options of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainMlOptionsStruct options;

	/**
	 * Name of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Email to reply of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public String replyTo;

	/**
	 * Language of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainMlLanguageEnum language;

	/**
	 * Id of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Owner email of mailing list
	 *
	 * canBeNull && readOnly
	 */
	public String ownerEmail;
}
