package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * Deferred payment account info
 */
public class OvhDeferredPaymentAccount {
	/**
	 * canBeNull && readOnly
	 */
	public Boolean defaultPaymentMean;

	/**
	 * Custom description of this account
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Deferred account type
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDeferredPaymentAccountStatusEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
