package net.minidev.ovh.api.license;

/**
 * All versions for CloudLinux product
 */
public enum OvhCloudLinuxVersionEnum {
	SINGLE("SINGLE"),
	WITH_CPANEL("WITH_CPANEL"),
	WITH_PLESK12("WITH_PLESK12");

	final String value;

	OvhCloudLinuxVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
