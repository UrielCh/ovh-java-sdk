package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.hostedssl.OvhReportValueEnum;

/**
 * Hostedssl Report
 */
public class OvhSslReport {
	/**
	 * Trade name verified directly with registration agency or through a verified third party
	 *
	 * canBeNull && readOnly
	 */
	public OvhReportValueEnum tradeNameVerificationStatus;

	/**
	 * Applicant's legal status obtained or verified directly with registration agency
	 *
	 * canBeNull && readOnly
	 */
	public OvhReportValueEnum organizationValidationStatus;

	/**
	 * Terms and conditions agreements acceptance
	 *
	 * canBeNull && readOnly
	 */
	public OvhReportValueEnum termsAndConditionsAcceptanceStatus;

	/**
	 * The order ID from given hostedssl provider
	 *
	 * canBeNull && readOnly
	 */
	public String providerOrderId;

	/**
	 * Approval verified through a phone call to the contract signer
	 *
	 * canBeNull && readOnly
	 */
	public OvhReportValueEnum phoneCallApprovalStatus;

	/**
	 * "Domain control validation" test status done by certification authority
	 *
	 * canBeNull && readOnly
	 */
	public OvhReportValueEnum domainControlValidationStatus;

	/**
	 * "Certificate signing request" test status done by certification authority
	 *
	 * canBeNull && readOnly
	 */
	public OvhReportValueEnum certificateSigningRequestStatus;
}
