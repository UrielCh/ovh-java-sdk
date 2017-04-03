package net.minidev.ovh.api.email.domain;

import java.util.Date;

/**
 * Email diagnoses
 */
public class OvhDiagnose {
	/**
	 * Creation date of diagnose
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Result of diagnose
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainDiagnoseResultEnum result;

	/**
	 * Trace of diagnose
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainDiagnoseTraceStruct<OvhDomainDiagnoseResultEnum>[] trace;

	/**
	 * Function of diagnose
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainDiagnoseFunctionEnum function;

	/**
	 * Name of account
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Id of diagnose
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
