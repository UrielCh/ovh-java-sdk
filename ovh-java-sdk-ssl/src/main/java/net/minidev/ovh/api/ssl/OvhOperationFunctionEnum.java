package net.minidev.ovh.api.ssl;

/**
 * All functions a SSL operation can handle
 */
public enum OvhOperationFunctionEnum {
	createCertificate("createCertificate");

	final String value;

	OvhOperationFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
