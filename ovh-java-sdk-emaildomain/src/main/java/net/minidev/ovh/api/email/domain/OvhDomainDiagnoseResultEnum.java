package net.minidev.ovh.api.email.domain;

/**
 * Result of diagnose
 */
public enum OvhDomainDiagnoseResultEnum {
	CUSTOM("CUSTOM"),
	DEPRECATED("DEPRECATED"),
	KO("KO"),
	OK("OK");

	final String value;

	OvhDomainDiagnoseResultEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
