package net.minidev.ovh.api.email.pro;

import java.util.Date;

/**
 * Account Diagnosis
 */
public class OvhAccountDiagnosis {
	/**
	 * Determines if MX record for account's domain is properly set
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isMxValid;

	/**
	 * Determines if account is flagged as spammer
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isSpammer;

	/**
	 * Determines if ingoing message has been received
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canReceiveEmail;

	/**
	 * Last performed diagnostics date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastCheck;

	/**
	 * Determines if account is suspended
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isSuspended;

	/**
	 * Determines if SRV (autodiscovery) record for account's domain is properly set
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isSrvValid;

	/**
	 * Determines if outgoing message has been delivered
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canSendEmail;

	/**
	 * Determines if account is locked
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isLocked;

	/**
	 * Determines if possible to authenticate with credentials
	 *
	 * canBeNull && readOnly
	 */
	public Boolean connectiveWebmail;
}
