package net.minidev.ovh.api.telephony;

/**
 * Call diagnostic analyze structure call cdrs
 */
public class OvhCallDiagnosticCdrsBasic {
	/**
	 * SS7 ISUP cause codes
	 *
	 * canBeNull
	 */
	public String causeDescription;

	/**
	 * Hexadecimal SIP-to-SS7 ISUP cause codes
	 *
	 * canBeNull
	 */
	public OvhCallDiagnosticCauseEnum cause;

	/**
	 * Release location type : forward if the calling hangup, backward if the caller hangup, else local
	 *
	 * canBeNull
	 */
	public OvhReleaseLocationEnum releaseLocation;
}
