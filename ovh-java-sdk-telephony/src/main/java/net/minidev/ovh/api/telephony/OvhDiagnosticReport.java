package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Relevant informations of the service detected from the MOS or the signal leg in SIP/MGCP protocol.
 */
public class OvhDiagnosticReport {
	/**
	 * Identifier of the concerned leg
	 *
	 * canBeNull
	 */
	public String callId;

	/**
	 * Datetime of the diagnostic
	 *
	 * canBeNull
	 */
	public Date datetime;

	/**
	 * The level of the diagnostic
	 *
	 * canBeNull
	 */
	public OvhDiagnosticReportLevelEnum level;

	/**
	 * Report of the diagnostic
	 *
	 * canBeNull
	 */
	public String report;

	/**
	 * Name of the rule detected
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Explanation of the diagnostic
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Typology where the diagnostic arriving from
	 *
	 * canBeNull
	 */
	public OvhDiagnosticReportCategoryEnum category;
}
