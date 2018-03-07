package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for ssl type
 */
public enum OvhSslTypeEnum {
	built("built"),
	built_not_routed("built_not_routed"),
	custom("custom");

	final String value;

	OvhSslTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
