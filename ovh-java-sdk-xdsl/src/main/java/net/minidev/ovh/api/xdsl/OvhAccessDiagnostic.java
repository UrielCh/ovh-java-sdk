package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Diagnostic of the access
 */
public class OvhAccessDiagnostic {
	/**
	 * Available tests for this access
	 *
	 * canBeNull && readOnly
	 */
	public OvhAccessDiagnosticCapabilities capabilities;

	/**
	 * Is the modem connected ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isModemConnected;

	/**
	 * Test details by line
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineDiagnostic[] lineDetails;

	/**
	 * Datime of the diagnostic
	 *
	 * canBeNull && readOnly
	 */
	public Date diagnosticTime;

	/**
	 * Does the access ping ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ping;

	/**
	 * Is the access active on its primary or secondary LNS
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isActiveOnLns;

	/**
	 * Is there an ongoing genericIncident on the access ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean incident;

	/**
	 * Remaining number of diagnostic for this access
	 *
	 * canBeNull && readOnly
	 */
	public Long remaining;
}
