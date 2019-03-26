package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * SEPA bank account info
 */
public class OvhBankAccount {
	/**
	 * canBeNull && readOnly
	 */
	public Boolean defaultPaymentMean;

	/**
	 * canBeNull && readOnly
	 */
	public String uniqueReference;

	/**
	 * canBeNull && readOnly
	 */
	public String ownerName;

	/**
	 * canBeNull && readOnly
	 */
	public String iban;

	/**
	 * Custom description of this account
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhBankAccountStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public String ownerAddress;

	/**
	 * canBeNull && readOnly
	 */
	public Date mandateSignatureDate;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * canBeNull && readOnly
	 */
	public String bic;

	/**
	 * canBeNull && readOnly
	 */
	public String validationDocumentLink;
}
