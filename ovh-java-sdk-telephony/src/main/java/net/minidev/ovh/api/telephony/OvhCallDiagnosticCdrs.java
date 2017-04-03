package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Call diagnostic analyze structure call cdrs
 */
public class OvhCallDiagnosticCdrs {
	/**
	 * Basic information about call details record
	 *
	 * canBeNull
	 */
	public OvhCallDiagnosticCdrsBasic basic;

	/**
	 * The timestamp of the call details record capture
	 *
	 * canBeNull
	 */
	public Date timestamp;
}
