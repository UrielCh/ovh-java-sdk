package net.minidev.ovh.api.telephony;

/**
 * Enumeration providing payload type to Name of RTP audio video profile
 */
public enum OvhCallDiagnosticCodecEnum {
	G722("G722"),
	G729("G729"),
	PCMA("PCMA"),
	PCMU("PCMU");

	final String value;

	OvhCallDiagnosticCodecEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
