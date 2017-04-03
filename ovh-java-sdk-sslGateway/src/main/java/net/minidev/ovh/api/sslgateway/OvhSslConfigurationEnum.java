package net.minidev.ovh.api.sslgateway;

/**
 * Possible values for ssl ciphers
 */
public enum OvhSslConfigurationEnum {
	intermediate("intermediate"),
	internal("internal"),
	modern("modern");

	final String value;

	OvhSslConfigurationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
