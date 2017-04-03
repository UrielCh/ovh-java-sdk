package net.minidev.ovh.api.email.domain;

/**
 * Function of diagnose
 */
public enum OvhDomainDiagnoseFunctionEnum {
	MX("MX");

	final String value;

	OvhDomainDiagnoseFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
