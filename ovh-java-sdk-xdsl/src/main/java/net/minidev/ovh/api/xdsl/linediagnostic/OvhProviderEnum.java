package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * The providers for xdsl access
 */
public enum OvhProviderEnum {
	axione("axione"),
	ft("ft"),
	ftBySfr("ftBySfr"),
	kosc("kosc"),
	koscDeg("koscDeg"),
	ovh("ovh"),
	sfr("sfr");

	final String value;

	OvhProviderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
