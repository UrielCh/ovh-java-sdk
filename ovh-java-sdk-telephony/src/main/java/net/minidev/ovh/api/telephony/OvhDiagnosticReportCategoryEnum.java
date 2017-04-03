package net.minidev.ovh.api.telephony;

/**
 * Source of the diagnostic report
 */
public enum OvhDiagnosticReportCategoryEnum {
	dpi("dpi"),
	signal("signal");

	final String value;

	OvhDiagnosticReportCategoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
