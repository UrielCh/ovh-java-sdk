package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for ssl ciphers
 */
public enum OvhSslConfigurationEnum {
	intermediate("intermediate"),
	modern("modern");

	final String value;

	OvhSslConfigurationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
