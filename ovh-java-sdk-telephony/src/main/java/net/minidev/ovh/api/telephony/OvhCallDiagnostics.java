package net.minidev.ovh.api.telephony;

/**
 * Advanced diagnostic of the voice call
 */
public class OvhCallDiagnostics {
	/**
	 * Sip signal packets during the call and last registers
	 *
	 * canBeNull && readOnly
	 */
	public OvhCallDiagnosticSip[] sip;

	/**
	 * The Call details records information
	 *
	 * canBeNull && readOnly
	 */
	public OvhCallDiagnosticCdrs[] cdrs;

	/**
	 * The MOS call quality report
	 *
	 * canBeNull && readOnly
	 */
	public OvhCallDiagnosticCallQuality[] callQuality;

	/**
	 * The relevant informations in anormal behaviors
	 *
	 * canBeNull && readOnly
	 */
	public OvhCallDiagnosticReporting[] reporting;

	/**
	 * Todo if datas are being to be loaded in cache. done when datas are available
	 *
	 * canBeNull && readOnly
	 */
	public OvhCallDiagnosticStatusEnum status;
}
