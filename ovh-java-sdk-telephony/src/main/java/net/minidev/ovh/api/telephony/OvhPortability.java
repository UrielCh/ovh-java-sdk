package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Portability informations
 */
public class OvhPortability {
	/**
	 * The ID of the portability order
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * The date when the portability will be done and when numbers will be ported
	 *
	 * canBeNull && readOnly
	 */
	public Date desiredExecutionDate;

	/**
	 * Customer informations about this portability
	 *
	 * canBeNull && readOnly
	 */
	public OvhPortabilityCustomerInfos customerInfos;

	/**
	 * Codes representing the error in current portability
	 *
	 * canBeNull && readOnly
	 */
	public String[] errorCodes;

	/**
	 * Country that defines the portability kind
	 *
	 * canBeNull && readOnly
	 */
	public OvhPortabilityCountryEnum portabilityCountry;

	/**
	 * The list of numbers that is going to be ported
	 *
	 * canBeNull && readOnly
	 */
	public String[] numbersList;

	/**
	 * The ID of the portability
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The portability's creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Show the redirection that will be configured when the portability will be done
	 *
	 * canBeNull && readOnly
	 */
	public String lineToRedirectTo;

	/**
	 * Indicates that portability is in error
	 *
	 * canBeNull && readOnly
	 */
	public Boolean error;

	/**
	 * The billing account where the numbers will be inserted
	 *
	 * canBeNull && readOnly
	 */
	public String billingAccount;

	/**
	 * The operator that currently holds the numbers
	 *
	 * canBeNull && readOnly
	 */
	public String operator;
}
