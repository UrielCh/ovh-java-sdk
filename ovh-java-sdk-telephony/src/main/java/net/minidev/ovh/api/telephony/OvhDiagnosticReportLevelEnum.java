package net.minidev.ovh.api.telephony;

/**
 * Level of the diagnostic report
 */
public enum OvhDiagnosticReportLevelEnum {
	debug("debug"),
	error("error"),
	info("info"),
	warn("warn");

	final String value;

	OvhDiagnosticReportLevelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
