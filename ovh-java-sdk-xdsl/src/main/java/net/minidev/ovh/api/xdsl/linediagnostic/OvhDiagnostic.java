package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Diagnostic status and informations
 */
public class OvhDiagnostic {
	/**
	 * Contains informations about diagnostic (questions, previous answers, actions to do, line details, selt result...)
	 *
	 * canBeNull
	 */
	public OvhDiagnosticData data;

	/**
	 * Detected fault type
	 *
	 * canBeNull
	 */
	public OvhFaultTypeEnum faultType;

	/**
	 * Diagnostic id
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Diagnostic status
	 *
	 * canBeNull
	 */
	public OvhDiagnosticStatusEnum status;
}
